/**
 * 
 */
package com.eudriscabrera.examples.java9.changes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ecabrerar
 *
 */
public class StreamNewMethods {

	
	public static void main(String[] args) {  
		
		List<Team> teams = new ArrayList<Team>();
		
		teams.stream()
        .dropWhile(t -> t.isHasWonWoldSeries())
        .collect(Collectors.toList());
		
		
		teams.stream()
        .takeWhile(t -> t.isHasWonWoldSeries())
        .collect(Collectors.toList());
		
		
		
		
		
	}
}
