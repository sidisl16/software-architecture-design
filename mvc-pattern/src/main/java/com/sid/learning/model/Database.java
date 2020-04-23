package com.sid.learning.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<Person> personList;

	public Database() {
		personList = new ArrayList<>();
	}

	public void addPerson(Person person) {
		personList.add(person);
	}

	public void removePerson(Person person) {
		personList.remove(person);
	}

	public List<Person> getAllPerson() {
		return personList;
	}
}
