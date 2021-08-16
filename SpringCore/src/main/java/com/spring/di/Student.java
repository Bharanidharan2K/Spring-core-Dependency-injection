package com.spring.di;

public class Student {

	private MathCheat mathcheat;

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheat() {
		mathcheat.mathCheat();
	}
}
