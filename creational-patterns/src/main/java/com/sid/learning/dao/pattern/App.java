package com.sid.learning.dao.pattern;

public class App {

	/**
	 * 
	 * Data access object (DTO)
	 * 
	 */
	public static void main(String[] args) {
		Database database = new Database();

		database.addPerson(new Person("Joe", 27));
		database.addPerson(new Person("John", 29));
		Person person = new Person("Adam", 29);
		database.addPerson(person);

		database.getAllPerson().forEach(c -> System.out.println(c));

		database.removePerson(person);

		database.getAllPerson().forEach(c -> System.out.println(c));

	}
}
