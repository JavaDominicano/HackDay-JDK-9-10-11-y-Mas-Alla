
package com.eudriscabrera.examples.java9.changes;

import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

/**
 * @author ecabrerar
 *
 */
public class CollectionFactoryMethods {

	
	
	public static void main(String[] args) {  
		
		List<String> teamsMLB = List.of("Astros", 
				                  "Cardinals", 
				                  "Red Sox",
				                   "Orioles",
				                   "Mets");
		
		
		//teamsMLB.add("Mets");
		
		
		Map<String, Integer> lastTimeWonWorldSeries = Map.of(
				"Astros", 2017,
				"Cubs", 2016,
				"Royals", 2015);
		
	
		Map<String, Integer> lastTimeWonWS = Map.ofEntries(
				entry("Astros", 2017),
				entry("Cubs", 2016),
				entry("Royals", 2015),
				entry("Giants", 2016));
		
	}

}
