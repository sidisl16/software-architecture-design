package com.sid.learning;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> services;

	public Cache() {
		services = new ArrayList<>();
	}

	public Service getService(String jndiName) {
		for (Service service : services) {
			if (service.getName().equals(jndiName)) {
				return service;
			}
		}
		return null;
	}

	public void addService(Service service) {
		services.add(service);
	}
}
