package com.sid.learning.nullobject.pattern;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<String> customernames;

	public Database() {
		customernames = new ArrayList<>();
		customernames.add("Joe");
		customernames.add("Jimmy");
		customernames.add("Michael");
		customernames.add("Sarah");
		customernames.add("Antony");
	}

	public boolean checkName(String name) {
		return customernames.stream().anyMatch(customerName -> customerName.equals(name));
	}
}
