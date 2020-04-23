package com.sid.learning;

public class InitialContext {

	public Service lookUp(String jndiName) {
		switch (jndiName) {
		case DatabaseService.NAME:
			return new DatabaseService();
		case MessagingService.NAME:
			return new MessagingService();
		default:
			return null;
		}
	}
}
