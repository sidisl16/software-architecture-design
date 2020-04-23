package com.sid.learning.dependency.inversion;

public class MySqldatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connecting mysql database...");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnecting mysql database...");
	}

}
