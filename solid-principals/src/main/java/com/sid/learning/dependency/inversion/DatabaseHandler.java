package com.sid.learning.dependency.inversion;

public class DatabaseHandler {

	private Database database;

	public DatabaseHandler(Database database) {
		this.database = database;
	}

	public void connect() {
		database.connect();
	}

	public void disconnect() {
		database.disconnect();
	}
}
