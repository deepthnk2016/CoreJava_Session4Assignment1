package com.acadgild;

/**
 * 
 * @author Deepak Subclass extending the parent class Concatenate Method
 *         operConcatenate is over-ridden in this subclass
 */

public class ConcatenateSubClass extends Concatenate {

	private String operName;

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	int operConcatenate(int a, int b) {
		int result = 0;
		switch (this.operName) {
		// If operation is addition then call the parent class method
		case "A":
			result = super.operConcatenate(a, b);
			break;
		case "S":
			result = a - b;
			break;
		case "M":
			result = a * b;
			break;
		case "D":
			result = a / b;
			break;
		}
		return result;
	}

}
