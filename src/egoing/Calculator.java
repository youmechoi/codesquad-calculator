package egoing;

abstract class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	int _sum() {
		return this.left + this.right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}

}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum :" + _sum());
	}

	public void avg() {
		System.out.println("+ sum :" + (_sum() / 2));
	}
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum :" + (this.left + this.right));
	}

	public void avg() {
		System.out.println("- sum :" + ((this.left + this.right) / 2));
	}

}


