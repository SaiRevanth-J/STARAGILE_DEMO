package Solar_Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int num1, int num2){
		return num1+num2;
	}
	public static int substraction(int num1, int num2){
		return	num1-num2;
	} 
	public static int multiplication(int num1, int num2){
		return	num1*num2;
	}
	public static double division(double num1, double num2){
		if (num2 ==0) {
			throw new IllegalArgumentException("Number cannot be divided by 0");
			
				} 
		return	num1/num2;
	}

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = scan.nextInt();
	
	System.out.println("The Addition is :" + Calculator.add(firstNumber,secondNumber));
	System.out.println("The Substraction is :" + Calculator.substraction(firstNumber,secondNumber));
	System.out.println("The Multiplication is :" + Calculator.multiplication(firstNumber,secondNumber));
	System.out.println("The Divison is :" + Calculator.division(firstNumber,secondNumber));
	
	
	

}

}