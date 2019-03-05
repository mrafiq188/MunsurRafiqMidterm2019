package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> stateOfUSA = new ArrayList<>() ;
		stateOfUSA.add("NY");
		stateOfUSA.add("VA");
		stateOfUSA.add("NJ");
		System.out.println("State of USA ->> "+ stateOfUSA);
		System.out.println(" ");

		List<String> capitalOfStates = new ArrayList<>() ;
		capitalOfStates.add("Albany");
		capitalOfStates.add("Richmond");
		capitalOfStates.add("Trenton");
		System.out.println("The capital of  ->> "+ capitalOfStates);
		System.out.println(" ");


		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("USA", stateOfUSA);
		map.put("Capital", capitalOfStates);


		for (Map.Entry entry: map.entrySet()){
			System.out.println(entry.getKey()+"->>"+ entry.getValue());
		}
		System.out.println(" ");
		System.out.println("Using Iterator below ");
		Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String, List<String>> entry = iterator.next();
			System.out.println(entry.getKey() +"-->"+entry.getValue());
		}
	}

}
