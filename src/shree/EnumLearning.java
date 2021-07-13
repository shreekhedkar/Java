package shree;

import java.util.Arrays;

enum Fruits {

	MANGO(1), APPLE(3), BANANA(4);

	private int value;

	Fruits(int value) {
		this.value = value;
	}

}

public class EnumLearning {

	public static void main(String[] args) {

		Fruits fruit = Fruits.BANANA;
		System.out.println(fruit.ordinal());
		System.out.println(Fruits.valueOf("APPLE"));
		// System.out.println(fruit.getValue());
		System.out.println(Arrays.toString(Fruits.values()));
	}

}