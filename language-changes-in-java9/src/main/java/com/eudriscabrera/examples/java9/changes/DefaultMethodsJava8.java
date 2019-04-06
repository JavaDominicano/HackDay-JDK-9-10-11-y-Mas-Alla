
package com.eudriscabrera.examples.java9.changes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ecabrerar
 *
 */
public interface DefaultMethodsJava8 {

	default int hasWonWoldSeries(List<Team> teams) {
		return sum(teams.stream()
				         .filter(t -> t.isHasWonWoldSeries())
				         .collect(Collectors.toList()));
	}
	
    default int hasNotWonWoldSeries(List<Team> teams) {
    	return sum(teams.stream()
    			        .filter(t -> !t.isHasWonWoldSeries())
    			        .collect(Collectors.toList()));
	}
	
    default int sum(List<Team> teams) {
        return (int) Stream.of(teams).count();
    }
}
