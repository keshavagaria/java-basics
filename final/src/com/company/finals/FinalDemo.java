package com.company.finals;

class Animal{
	final int x=500;
	final int y;      //blank final variable
	static final int z;   //static blank final variable
	
	static {
		z=500;
		System.out.println("static blank final variable initialized in static block with value "+z);
	}
	public Animal()
	{
		y=50;
		//z=100;
		System.out.println("final variable y is initialized in constructor with value "+y);
	}
	final void eat()
	{
		//x=600;
		System.out.println("animal is eating");
	}
	final void eat(int x)
	{
		System.out.println("Animal is eating "+x+" times");
	}
	
}
public class FinalDemo {
	public static void main(String[] args) {
Animal a=new Animal();
a.eat();
a.eat(2);
	}
}
