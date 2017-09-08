package calculator;

public class Calculate {

	public static int calculateM(int first, String operator, int second) {
		int result = 0;
		if (operator.equals("+")) {
			result = sum(first, second);
			System.out.println(result);
			System.out.println(result);
		} else if (operator.equals("-")) {
			result = sub(first, second);
			System.out.println(result);
		} else if (operator.equals("*")) {
			result = mul(first, second);
			System.out.println(result);
		} else if (operator.equals("/")) {
			result = div(first, second);
			System.out.println(result);
		} else {
			System.out.println("your input is not an operator");
		}

		return result;
	}

	static int sum(int first, int second) {
		return first + second;
	}

	static int sub(int first, int second) {
		return first - second;
	}

	static int mul(int first, int second) {
		return first * second;
	}

	static int div(int first, int second) {
		return first / second;
	}

	
	

}
