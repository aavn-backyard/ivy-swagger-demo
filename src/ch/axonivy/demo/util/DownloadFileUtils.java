package ch.axonivy.demo.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.faces.context.FacesContext;
import javax.mail.internet.MimeUtility;
import javax.servlet.http.HttpServletResponse;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.request.IRequest;
import ch.ivyteam.ivy.request.IResponse;
import ch.ivyteam.ivy.request.impl.HttpProcessRequest;
import ch.ivyteam.ivy.request.IRequest;
import ch.ivyteam.ivy.request.IResponse;
import ch.ivyteam.ivy.request.impl.HttpResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadFileUtils {
	public static HttpServletResponse getHttpServletResponse(IResponse response) {
		return ((HttpResponse) response).getHttpServletResponse();
	}

	public static HttpServletRequest getHttpServletRequest(IRequest request) {
		return ((HttpProcessRequest) request).getHttpServletRequest();

	}
	/***
	 * Download file with HttpServletResponse
	 * 
	 * @param filePath
	 *            is full path of file need downloaded
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@SuppressWarnings("finally")
	public static boolean downloadFile(String filePath) throws UnsupportedEncodingException {

		final int DEFAULT_BUFFER_SIZE = 1024;
		HttpServletResponse response;
		HttpServletRequest request;
		String decisionFilePath = filePath;
		java.io.File decisionFile;
		String contentType;
		byte[] buffer;
		boolean isSuccess = false;

		// get HttpServlet request, and response
		response = getHttpServletResponse(Ivy.response());
		request = getHttpServletRequest(Ivy.request());

		// check the file exists or not
		decisionFile = new java.io.File(decisionFilePath);
		try {
			if (!decisionFile.exists()) {
				response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
			}
		} catch (Exception e) {

		}
		
		/*String fileName = "";
		boolean isInternetExplorer = (request.getHeader("user-agent").indexOf("MSIE") > -1);
		byte[] fileNameBytes = decisionFile.getName().getBytes((isInternetExplorer) ? ("windows-1250") : ("utf-8"));	    
	    for (byte b: fileNameBytes) fileName += (char)(b & 0xff);*/
		
		String fileName = decisionFile.getName();
		boolean isInternetExplorer = (request.getHeader("user-agent").indexOf("MSIE") > -1) || 
				(request.getHeader("user-agent").indexOf("Opera") > -1);
		
		
		contentType = request.getSession().getServletContext()
				.getMimeType(decisionFile.getName());

		response.reset();
		response.setBufferSize(DEFAULT_BUFFER_SIZE);
		response.setContentType(contentType);
		response.setContentLength((int) (decisionFile.length()));
		if (isInternetExplorer)
			response.addHeader("Content-Disposition",
				    "attachment; filename=\"" + URLEncoder.encode(fileName, "utf-8").replace("+", " ")+"\"");
		else{
			response.addHeader("Content-Disposition", "attachment; " +
				    "filename=\"" + MimeUtility.encodeWord(fileName, "utf-8", "Q") + "\"");
		}
		
		
		/*
		String userAgent = request.getHeader("User-Agent");
		String encodedFileName = null;

		if (userAgent.contains("MSIE") || userAgent.contains("Opera")) {
			encodedFileName = URLEncoder.encode(decisionFile.getName(), "UTF-8").replace("+", " ");
		} else {
			encodedFileName = "=?UTF-8?B?" + new String(Base64.encodeBase64(decisionFile.getName().getBytes("UTF-8")), "UTF-8") + "?=";
		}
		response.setHeader("Content-Disposition", "attachment; filename=\"" + encodedFileName + "\"");
		 */
		
		/*response.setHeader("Content-Disposition", "attachment; filename=\""
		+ decisionFile.getName() + "\"");*/
		
		//FacesContext.getCurrentInstance().responseComplete();

		// Prepare streams.
		BufferedInputStream input = null;
		BufferedOutputStream output = null;
		try {
			// Open streams.
			input = new BufferedInputStream(new FileInputStream(decisionFile),
					DEFAULT_BUFFER_SIZE);
			output = new BufferedOutputStream(response.getOutputStream(),
					DEFAULT_BUFFER_SIZE);
			// Write file contents to response.
			buffer = new byte[DEFAULT_BUFFER_SIZE];
			int length;
			while ((length = input.read(buffer)) > 0) {
				output.write(buffer, 0, length);
			}

			isSuccess = true;
		} catch (Exception e) {
			if (!e.getMessage().contains("ClientAbortException")) {
				Ivy.log().error(e);
			}
		} finally {
			// Gently close streams.
			try {
				input.close();
				output.close();
			} catch (Exception e) {

			}
			return isSuccess;
		}
	}		

}
