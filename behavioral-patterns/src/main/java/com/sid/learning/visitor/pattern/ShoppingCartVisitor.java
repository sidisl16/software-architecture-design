package com.sid.learning.visitor.pattern;

public interface ShoppingCartVisitor {
	
	public double visit(Table table);
	public double visit(Chair chair);

}
