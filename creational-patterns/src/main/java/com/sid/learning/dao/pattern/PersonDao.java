package com.sid.learning.dao.pattern;

import java.util.List;

public interface PersonDao {

	public void addPerson(Person person);

	public void removePerson(Person person);

	public List<Person> getAllPerson();
}
