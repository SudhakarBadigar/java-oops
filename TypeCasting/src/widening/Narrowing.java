package widening;

public class Narrowing {
	double d = 10.4;
	int i = (int)d;
	
//	float f = 3.4f;
//	int k = f;
	int k =10;
	float f = k;
	public static void main(String[] args) {
		Narrowing n = new Narrowing();
		System.out.println(n.d);
		System.out.println(n.i);
				
	}

}
