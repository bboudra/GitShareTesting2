package shareCalculator;

import java.util.Scanner;

public class ShareCalculator {

	private int num1;
	private int num2;
	
	public void setter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the first number that you wish to multiply");
		num1 = sc.nextInt();
		System.out.println("please enter the second number that you wish to multiply");
		num2 = sc.nextInt();
		sc.close();
	}

	public int simple() {
		int j = num1;
		int i = num2;
		int result = i * j;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) { // notice the very important
												// Difference here between the
												// original commit and the one
												// that i am currently using you
												// may notice they aren't even
												// the same program.
		System.out.println("This is a basic calculator");
		ShareCalculator c1 = new ShareCalculator();
		c1.setter();
		int result = c1.simple();
		System.out.println("this is the result being printed from the main "
				+ result);
	}
	
}