package com.company.statics;


class Animal{
	int y=500;
	static void eat()
	{
		System.out.println("Animal is eating");
		//eat(10,100);
	}
	static void eat(int x)
	{
		System.out.println("Animal is again eating "+x+" times");
	}
	
	void eat(int x,int y)
	{
		System.out.println("eating "+x+" "+y);
		eat();
	}
}
public class StaticDemo {
public static void main(String[] args) {
	Animal.eat();
	Animal.eat(5);
	Animal animal=new Animal();
	animal.eat(50, 60);
	//animal.eat();
}
}
