package ua.nure.cpp.lect2.classes;

import java.util.Arrays;

public class Demo {

	// public
	// protected
	// default (PACKAGE PRIVETE)
	// private
	private int a = 123; // 0
	String aText = "aText"; // null
	public float f = 5.f; // 0.f
	protected String protectedText; // null

	public Demo() {
		protectedText = "protectedText";
	}

	public Demo(int a) {
		this();
		this.a = a;
	}
	
	public Demo(int a, String text) {
		this(a);
		aText = text;
	}

	class A {

	}

	void aMethod(Demo d) {
		d.a = 6;
	}

	void aMethod2(ua.nure.cpp.lect2.classes.One one) {
		one.f = 456.f;
	}

	class One {

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));

		Demo demo = new Demo();
		Demo demo1 = new Demo();
		Demo demo2 = new Demo(5);
		System.out.println(demo);
		System.out.println(demo1);
		System.out.println(demo2);
	}
}

class One {
	private int a = 123; // 0
	String aText = "aText"; // null
	public float f = 5.f; // 0.f
	protected String protectedText = "protectedText"; // null

}