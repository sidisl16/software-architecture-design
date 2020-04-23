package com.sid.learning.controller;

import java.util.List;

import com.sid.learning.model.Database;
import com.sid.learning.model.Person;
import com.sid.learning.view.MainFrame;

public class Controller {

	private Database database;
	private MainFrame mainFrame;

	public Controller(MainFrame mainFrame) {
		database = new Database();
		this.mainFrame = mainFrame;
	}

	public void addPerson(String personName, String personOccupation) {
		Person person = new Person(personName, personOccupation);
		database.addPerson(person);
	}

	public void refreshScreen() {
		List<Person> personList = this.database.getAllPerson();
		this.mainFrame.clearText();

		personList.forEach(person -> this.mainFrame.refreshTextArea(person.getName(), person.getOccupation()));
	}

}
