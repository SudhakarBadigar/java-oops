package widening;
//auto widening
public class Wide1 {
	
	int a = 10;
	byte b = 101;
	double d =a;
	short s = b;
	public static void main(String[] args) {
		Wide1 w = new Wide1();
		System.out.println(w.a);
		System.out.println(w.d);
		System.out.println(w.b);
		System.out.println(w.s);
	}
	

}
