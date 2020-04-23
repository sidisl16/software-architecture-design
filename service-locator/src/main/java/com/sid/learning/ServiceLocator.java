package com.sid.learning;

public class ServiceLocator {

	private static Cache cache = new Cache();

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		service = context.lookUp(jndiName);

		cache.addService(service);

		return service;

	}

}
