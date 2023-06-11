package MyPracticeJava;

public class inheritanceExam {
	public static void main(String[] args) {
	Base base = new Derived();
	System.out.println(base.getValue());
	}
}

class Base {
	int value=0;
	
	Base() {
		addValue();
	}
	
	void addValue() {
		value+=10;
	}
	
	int getValue() {
		return value;
	}
}
					
class Derived extends Base {
	Derived() {
		addValue() ;
	}
	
	void addValue() {
		value+=10;
	}
}
