package task2;

public class Lorry extends Car implements Moveable, Stopable {

	@Override
	void open() {
		System.out.println("Car is open");
	}

	public void move(){
		System.out.println("Car is moving");
	}
	public void stop(){
		System.out.println("Car is stop");
	}
}
