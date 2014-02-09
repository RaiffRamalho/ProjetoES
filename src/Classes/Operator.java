package Classes;

import java.util.HashMap;

public class Operator {

	private int result;

	public Operator(int a, int b, int operator) {
		if (operator == 0) {
			this.result = a + b;

		} else if (operator == 1) {
			this.result = a - b;

		} else if (operator == 2) {
			this.result = a * b;

		} else if (operator == 3) {
			if (a % b == 0) {
				this.result = a / b;

			} else {
				this.result = a + b;

			}
		}
	}

	public int getResult() {
		return result;
	}

}
