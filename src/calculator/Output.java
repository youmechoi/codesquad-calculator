package calculator;



import java.util.Scanner;

import calculator.Calculate;
import calculator.Input;

public class Output {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = Input.getFirstValue(sc);

		while (true) {
			String operator = Input.getOperator(sc);

			if (operator.equals("quit")) {
				break;
			}
			int second = Input.getSecondValue(sc);

			result = Calculate.calculateM(result, operator, second);
		}
		sc.close();
	}

}

