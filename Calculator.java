package calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// data fields
		char operator;
		double num1, num2, result;

		int done = 1;

		// create scanner class for user input
		Scanner input = new Scanner(System.in);

		// ask user for operator
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);

		// ask user to enter first number
		System.out.println("Enter first number, for example: 432");
		num1 = input.nextDouble();

		// ask user to enter second number
		System.out.println("Enter second number, for example: 163");
		num2 = input.nextDouble();

		switch (operator) {

		// execute math with given input

		// addition
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		// subtraction
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		// multiplication
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		// division
		case '/':
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}
	}
}
