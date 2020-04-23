package com.sid.learning.dependency.inversion;

public class OracleDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Connecting Oracle database...");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnecting Oracle database...");
	}

}
