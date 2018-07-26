package course;

public class Program4 {

	public static void main(String[] args) {

		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10.0 / 8.0;
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);

		double n5 = 10;
		double n6 = 30;
		String s = "ABC";
		System.out.println("------------------------");
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(s);
		System.out.println("------------------------");
		
		n5 *= 2;
		n6 += n5;
		s += "DEF";
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(s);
		System.out.println("------------------------");
		
		int A = 10;
		int B = A++;
		System.out.println(A);
		System.out.println(B);
		int C = 10;
		int D = ++C;
		System.out.println(C);
		System.out.println(D);		
		
	}

}
