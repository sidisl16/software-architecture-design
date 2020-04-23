package com.sid.learning.visitor.pattern;

import java.util.ArrayList;
import java.util.List;

public class App {
	/**
	 * 
	 * Visitor pattern -> Separating algorithm from an object structure on which it
	 * operates
	 * 
	 * A practical approach is the ability to add new operations to existing object
	 * structure without modifying those structure
	 * 
	 * We can solve open closed principle with this pattern
	 * 
	 * IMPORTANT: We can extract common operation into a unique class
	 * 
	 * For example : webshop application
	 * 
	 */
	public static void main(String[] args) {

		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table("Desk", 35));
		items.add(new Table("Desk1", 40));
		items.add(new Chair("Chair1", 20));
		items.add(new Chair("Chair2", 35));
		
		ShoppingCart cart = new ShoppingCart();
		
		double sum = 0;
		
		for(ShoppingItem item:items) {
			sum = sum + item.accept(cart);
		}
		
		System.out.println("Total: "+"\u20B9"+sum);
	}
}
