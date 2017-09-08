package calculator;

import java.util.Scanner;

public class Input {

	public static int getFirstValue(Scanner sc) {
		System.out.println("input first number");
		int first = sc.nextInt();
		System.out.println(first);
		return first;
	}

	public static String getOperator(Scanner sc) {
		System.out.println("select an operator, +,-,*,/");
		String operator = sc.next();
		System.out.println(operator);
		return operator;
	}

	public static int getSecondValue(Scanner sc) {
		System.out.println("input second number");
		int second = sc.nextInt();
		System.out.println(second);
		return second;
	}
	
}
