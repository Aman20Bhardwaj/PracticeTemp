package MyPracticeJava;

class Car {

	String name = "";
	private static int speed = 0;
	
	protected int speedUp() {
		speed+=2;		
		return speed;
	}
	
	int getSpeed() {
		return speed;
	}
}

class Swift extends Car{
	int speed = 0;
	protected int speedUp() {
		speed = getSpeed() + 1;
		return getSpeed();		
	}
}
		

public class client{
	public static void main(String[] args) {
		Car car = new Swift();
		car.speedUp();
		car = new Swift();
		car.speedUp();
		car = new Swift();
		car.speedUp();
		System.out.println(car.getSpeed());
	}
}