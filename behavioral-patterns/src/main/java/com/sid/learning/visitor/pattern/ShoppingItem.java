package com.sid.learning.visitor.pattern;

public interface ShoppingItem {
	
	public double accept(ShoppingCartVisitor visitor);
}
