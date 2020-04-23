package com.sid.learning.nullobject.pattern;

public class RealCustomer extends AbstractCustomer {

	private String customerName;

	public RealCustomer(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public boolean checkCustomer() {
		return Boolean.TRUE;
	}

	@Override
	public String getCustomer() {
		return this.customerName;
	}

}
