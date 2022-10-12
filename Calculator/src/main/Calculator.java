package main;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Input num1 value : ");
		num1=scan.nextInt();
		System.out.println("Input num2 value : ");
		num2=scan.nextInt();
		
		int Sum,Subtract,Multiply,Divide;
		Sum=num1+num2;
		Subtract=num1-num2;
		Multiply=num1*num2;
		Divide=num1/num2;		
		
		System.out.println("Sum : "+Sum);
		System.out.println("Subtract : "+Subtract);
		System.out.println("Multiply: "+Multiply);
		System.out.println("Divide : "+Divide);
		
		scan.close();
	}

	public Object Sum(int a, int b) {
		return a + b;
	}

	public Object Subtract(int a, int b) {
		return a - b;
	}

	public Object Multiply(int a, int b) {
		return a * b;
	}

	public Object Divide(int a, int b) {
		return a / b;
	}
}