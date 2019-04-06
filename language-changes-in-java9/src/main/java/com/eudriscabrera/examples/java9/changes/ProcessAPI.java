/**
 * 
 */
package com.eudriscabrera.examples.java9.changes;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @author ecabrerar
 *
 */
public class ProcessAPI {

	public static void main(String[] args) throws IOException {  
		ProcessBuilder ls = new ProcessBuilder()
		        .command("ls")
		        .directory(Paths.get("/home/ecabrerar/Documents/docs").toFile());
		
		
		
		ProcessBuilder grepPdf = new ProcessBuilder()
		        .command("grep", "pdf")
		        .redirectOutput(Redirect.INHERIT);
		
		
		List<Process> lsThenGrep = ProcessBuilder
		        .startPipeline(Arrays.asList(ls, grepPdf));
	}
}
