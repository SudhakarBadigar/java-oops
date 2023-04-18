package javaBean;
public class Outer {
    private int x;
    static String name = "pro";

    // Inner class
    public class Inner {
        public void foo() {
            System.out.println("x is " + x);
        }
    }

    // Constructor
    public Outer(int x) {
        this.x = x;
    }
    
    //nested class
    public static class Nested{
    	void pro(){
    		System.out.println(Outer.name);
    	}
    	
    	
    }
    

    public void bar() {
        // Create an instance of the inner class
        Inner inner = new Inner();
        inner.foo();
    }

    public static void main(String[] args) {
        Outer outer = new Outer(42);
        outer.bar();
        Nested n = new Nested();
        n.pro();
    }
}
