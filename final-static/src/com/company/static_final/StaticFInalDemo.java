package com.company.static_final;

class Animal{
	
	static {
		System.out.println("i always run first");
	}
	static final void eat()
	{
		System.out.println("ANimal is eating");
	}
	
	static final void eat(int x)
	{
		System.out.println("Animal is eating "+x+" times");
	}
}
public class StaticFInalDemo {
	static {
		System.out.println("static block before main");
	}
public static void main(String[] args) {
	Animal.eat();
	Animal.eat(20);
}
}
