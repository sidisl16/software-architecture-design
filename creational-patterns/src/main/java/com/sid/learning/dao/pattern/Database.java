package com.sid.learning.dao.pattern;

import java.util.ArrayList;
import java.util.List;

public class Database implements PersonDao {

	private List<Person> personList;

	public Database() {
		this.personList = new ArrayList<>();
	}

	@Override
	public void addPerson(Person person) {
		personList.add(person);
	}

	@Override
	public void removePerson(Person person) {
		personList.remove(person);
	}

	@Override
	public List<Person> getAllPerson() {
		return personList;
	}

}
