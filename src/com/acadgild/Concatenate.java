package com.acadgild;

/**
 * 
 * @author Deepak Parent class Method operConcatenate is overloaded here Its
 *         overloaded to perform addition opertion on integers and string types
 */
public class Concatenate {

	// Operating on integer type
	int operConcatenate(int a, int b) {
		int result = a + b;

		return result;
	}

	// Operating on String type
	String operConcatenate(String a, String b) {
		String result = a + " " + b;
		return result;
	}

}
