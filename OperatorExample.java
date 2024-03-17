package programmus.beginner;

public class OperatorExample {

	public static void main(String[] args) {
		int x = -5;
		int y = +11;
		int z = -11;
		
		int a = ++z;
		System.out.println(a);
		System.out.println(z);
		
		int b = z++;
		System.out.println(b);
		System.out.println(z);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		
		num1 += 10;
		System.out.println(num1);
		
		System.out.println(num1 -= 5);
		System.out.println(num1);
	}

}
