package com.sid.learning.command.pattern;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switcher {

	private List<Command> commands;

	public Switcher() {
		commands = new ArrayList<>();
	}

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void executeCommands() {
		commands.forEach(command -> command.execute());
	}

}
