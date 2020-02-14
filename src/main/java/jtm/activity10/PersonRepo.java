package jtm.activity10;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonRepo extends Person {

	private List<Person> personList;
	// private JsonParser data;

	public PersonRepo() {
		init();
	}

	public void init() {

		try {
			Path pathToFile = Paths.get("src/main/resources/data.json");
			List<String> lines = Files.readAllLines(pathToFile);
			System.out.println(lines);

			String res = String.join("\n", lines);
			ObjectMapper mapper = new ObjectMapper();
			Person[] personArray = mapper.readValue(res, Person[].class);
			personList = Arrays.asList(personArray);
			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to
			// List below
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class DateComparator implements Comparator<Person> {

		public int compare(Person s1, Person s2) {
			return s1.getBirthDate().compareTo(s2.getBirthDate());
		}

	}

	public Person oldestPerson() {

		Collections.sort(personList, new DateComparator());

		return personList.get(0);

	}

	public Person youngestPerson() {
		Collections.sort(personList, new DateComparator());

		int lastNumber = personList.size();
		lastNumber--;

		return personList.get(lastNumber);
	}

	public String largestPopulation() {
	
		
		
		Set<Person> unique = new HashSet<>();
		for (Person getCountry : unique) {
		    System.out.println(getCountry + ": " + Collections.frequency(personList, getCountry));
		}
		
		return getCountry();
	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * Arrays.asList(personArray);
 */
