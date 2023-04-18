package javaBean;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getAge());
		p.setAge(25);
		int age = p.getAge();
		System.out.println(age);
	}

}
