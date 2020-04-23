package com.sid.learning.nullobject.pattern;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean checkCustomer() {
		return false;
	}

	@Override
	public String getCustomer() {
		return "No customer found with the given name found in the database...";
	}

}
