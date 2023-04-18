package com;

public class Person {

	public int age=25;
	public Person(){
		//walk();
		System.out.println("person constructor");
	}
	public void walk(){
		System.out.println("person walk method");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.walk();
		System.out.println(p.age);
		
	}
}
