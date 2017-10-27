package ch.axonivy.demo.util;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.resources.IProject;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.security.internal.SecurityManager;

public class ResourceLoader {

	public Path getResource(String relativeRootFolder)  {
		try {
			return findResource(relativeRootFolder);
		} catch (Exception e) {
			Ivy.log().error("Can't load "+relativeRootFolder,e);
			return null;
		}
	}

	private static Path findResource(String relativeRootFolder) throws Exception {
		return Paths.get(getRootContentFolder().getFile(relativeRootFolder).getLocationURI());

	}

	private static IProject getRootContentFolder() throws Exception {

		return SecurityManager.getSecurityManager().executeAsSystem(() -> Ivy.request().getProcessModelVersion().getProject());

	}

}
