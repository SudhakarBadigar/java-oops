package javaBean;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("initial marks: " + s.getMarks());
		//scan.nextInt();	
		System.out.println("please enter the marks");

		s.setMarks(scan.nextInt());
		System.out.println("Marks obtained : "+s.getMarks());
	}


}
