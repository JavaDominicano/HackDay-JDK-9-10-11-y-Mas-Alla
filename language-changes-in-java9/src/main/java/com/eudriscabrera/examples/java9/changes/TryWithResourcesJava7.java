package com.eudriscabrera.examples.java9.changes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ecabrerar
 *
 */
public class TryWithResourcesJava7 {

	public void process(InputStream inputstream) 
			throws FileNotFoundException, IOException {

		try (InputStream inputStream = inputstream) {

		}
	}

	public void verify() 
			throws FileNotFoundException, IOException {

		try (InputStream inputstream = new FileInputStream("file.txt")) {

		}
	}
}
