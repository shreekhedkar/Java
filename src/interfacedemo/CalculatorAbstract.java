package interfacedemo;

public abstract class CalculatorAbstract {

	public void addition(int a, int b) {

		System.out.println("Addition is :" + (a + b));
	}

	public abstract void print();

	public void addition(int a, int b, int c) {

		System.out.println("Addition is :" + (a + b + c));
	}
}
