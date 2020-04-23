package com.sid.learning.dependency.inversion;

public class AppClientCode {

	/**
	 * 
	 * Dependency Inversion principle
	 * 
	 * First we create low level modules e.g. Bluetooth communication, xml parser,
	 * database connection.
	 * 
	 * Second we implement high level module that heavily rely on low level module
	 * 
	 * THIS IS INTITUTION BUT ITS NOT GOOD
	 * 
	 * What if we want to change or replace low level module, we also have to change
	 * high level module
	 * 
	 * e.g. Connect mysql instead of oracle, or store file in xml instead of csv
	 * 
	 * Conclusion -> High level module should not dependent on low level module
	 * directly. There should be always abstraction layer between them.
	 * 
	 * LOW LEVEL MODULE <-----> ABSTRACTION LAYER (ABSTRACT CLASSES/INTERFACES)
	 * <-----> HIGH LEVEL MODULE
	 *
	 * Notes:
	 *
	 * 1. Creating an object with new keyword result in tightly coupled to another
	 * class 2. DI helps us to create loosely coupled modules 3. Modules should
	 * depend on abstraction
	 *
	 * Solutions: 1. Using Design pattern -> factory, template or strategy pattern
	 * 2. Using service locator pattern 3. using dependency injection
	 * 
	 */
	public static void main(String[] args) {

		// Strategy pattern
		DatabaseHandler mysqlhandler = new DatabaseHandler(new MySqldatabase());
		mysqlhandler.connect();
		mysqlhandler.disconnect();

		DatabaseHandler oraclehandler = new DatabaseHandler(new OracleDatabase());
		oraclehandler.connect();
		oraclehandler.disconnect();

	}

}
