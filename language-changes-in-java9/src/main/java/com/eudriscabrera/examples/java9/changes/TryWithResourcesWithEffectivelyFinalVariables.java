package com.eudriscabrera.examples.java9.changes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ecabrerar
 *
 */
public class TryWithResourcesWithEffectivelyFinalVariables {

	public void process(InputStream inputstream) 
			throws FileNotFoundException, IOException {

		try (inputstream) {

		}
	}
	
	public void verify() 
			throws FileNotFoundException, IOException {

		InputStream inputstream = new FileInputStream("file.txt");
		
		try (inputstream) {

		}
	}
	
}
