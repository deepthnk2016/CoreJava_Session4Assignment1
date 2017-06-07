package com.acadgild;

public class MyDemo {

	public static void main(String[] args) {
		ConcatenateSubClass c = new ConcatenateSubClass();
		int a, b, intResult;
		String firstString, secondString, concatResult;

		a = 5;
		b = 10;

		// This will call the over-ridden method in Concatenate subclass
		// which in turn will call the base method in the Concatenate class
		// (parent)
		c.setOperName("A");
		intResult = c.operConcatenate(a, b);
		System.out.println("Result of Addition = " + intResult);

		// This will call the over-ridden method in Concatenate subclass
		c.setOperName("M");
		intResult = c.operConcatenate(a, b);
		System.out.println("Result of Multiplication = " + intResult);

		// This will call the overloaded method operConcatenate of base class
		firstString = "Deepak";
		secondString = "Ray";
		concatResult = c.operConcatenate(firstString, secondString);
		System.out.println("Result of String operation = " + concatResult);

	}

}
