package javaBean;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.getID());
		e.setID("1DA14MCA32");
		String ID = e.getID();
		System.out.println(ID);

		
	}

}
