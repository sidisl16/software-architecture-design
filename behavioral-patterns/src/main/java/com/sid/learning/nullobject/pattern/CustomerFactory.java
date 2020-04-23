package com.sid.learning.nullobject.pattern;

public class CustomerFactory {

	private Database database;

	public CustomerFactory() {
		database = new Database();
	}

	public AbstractCustomer getCustomer(String name) {
		if (checkCustomer(name)) {
			return new RealCustomer(name);
		}
		// not throwing null pointer exception instead returning null customer object
		return new NullCustomer();
	}

	private boolean checkCustomer(String name) {
		if (database.checkName(name)) {
			return true;
		}
		return false;
	}
}
