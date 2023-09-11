package ua.nure.cpp.lect2.classes;

import java.lang.reflect.Field;

public class NestedDemo {
	private int a = 7;

	static class Nested {

	}
	class Inner {
		void print() {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Nested dn = new Nested();
		NestedDemo nd = new NestedDemo();
		Inner inner = nd.new Inner();
		inner.print();
		
		/*
		 * 1. load class --> create an instance of 
		 * 2. 
		 */
		
		
		Class<Inner> ic = Inner.class;
		Class<?> icv = inner.getClass();
		for (Field field : ic.getDeclaredFields()) {
			System.out.println(field);
		}
		for (Field field : Nested.class.getDeclaredFields()) {
			System.out.println(field);
		}
	}
}
