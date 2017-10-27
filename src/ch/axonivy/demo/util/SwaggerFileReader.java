package ch.axonivy.demo.util;

import java.io.UnsupportedEncodingException;
import java.nio.file.Path;

public class SwaggerFileReader {
	public static void readSwaggerFile(String filePath) throws UnsupportedEncodingException{
		ResourceLoader loader = new ResourceLoader();
		Path path = loader.getResource(filePath);
		if(path != null){
			DownloadFileUtils.downloadFile(path.toAbsolutePath().toString());
		}
	}
}
