package shareCalculator;

import java.util.Scanner;

public class ShareCalculator {

	private int num1;
	private int num2;

	public void setter() {
		Scanner sc = new Scanner(System.in);
		System.out
		.println("please enter the first number that you wish to operate on");
		num1 = sc.nextInt();
		System.out
		.println("please enter the second number that you wish to operate on");
		num2 = sc.nextInt();
	}
	public int selectOption()
	{
		
		int option= 0;
		System.out.println("Please select the number of the operation that you wish to reform\n"
				+ "1 to add\n"
				+ "2 to subtract\n"
				+ "3 to mutliply\n"
				+ "4 to divide");
		Scanner sC = new Scanner(System.in);
		option = sC.nextInt();
		sC.close();
		return option;
	}
	public double add()
	{
		int i = num1;
		int j = num2;
		double result = i+j;
		return result;
	}
	
	public double subtract()
	{
		int i = num1;
		int j = num2;
		double result = i-j;
		return result;
	}
	public double multiply() {
		int j = num1;
		int i = num2;
		double result = i * j;
		System.out.println(result);
		return result;
	}

	public double divide() {
		double j = num1;
		double i = num2;
		double result = j/i; // this divides  num1 by num2, choice of variable names can bee a little misleading
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
		int optionChosen = c1.selectOption();
		double result = 0;
		
		switch(optionChosen)
		{
		case 1:
			result = c1.add();
			break;
		case 2:
			result = c1.subtract();
			break;
		case 3:
			result = c1.multiply();
			break;
		case 4:
			result = c1.divide();
		}
		System.out
		.println("The result of your operation is... (drum roll) " + result);
	}

}