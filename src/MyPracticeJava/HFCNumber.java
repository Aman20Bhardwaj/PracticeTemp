/*Greatest common divisor
The greatest common divisor (GCD) of two or more numbers is the greatest common factor number that divides them, exactly. It is also called the highest common factor (HCF). 
For example, the greatest common factor of 15 and 10 is 5, since both the numbers can be divided by 5.

Python program to find H.C.F of two numbers*/

package MyPracticeJava;

public class HFCNumber {

	void findHCF(int a, int b) {
		int hcf = 0;
		int smallNum = 0;
		if (a > b) {
			smallNum = b;
		} else {
			smallNum = a;
		}

		for (int index = 1; index <= smallNum + 1; index++) {
			if ((a % index == 0) && (b % index == 0)) {
				hcf = index;
			}
		}
		System.out.print(hcf);
	}

	public static void main(String[] args) {
		new HFCNumber().findHCF(34, 21);
	}
}
