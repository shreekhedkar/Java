package interfacedemo;

public class InterfaceImpl {

	public static void main(String[] args) {

		CalculatorAbstract abstractCalc = new SimpleCalculator();
		abstractCalc.addition(10, 10);

	}

}