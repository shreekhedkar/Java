package shree;

import tushar.Calculator;

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator calculator1 = new Calculator();
		// calculator1.add();
		Calculator calculator2 = new Calculator(10, 20, 30, 40, 50);

		calculator2.add(10, 20);

		Calculator.bye();
		// System.out.println(calculator.number1);

//		calculator.number1 = 10;
//		calculator.number2 = 20;
//		calculator.number3 = 20;
//		calculator.number4 = 20;
//		calculator.number5 = 20;

//		System.out.println(calculator.number1);
//		System.out.println(calculator.number2);

//		calculator.addition(10, 20);
	}
}
