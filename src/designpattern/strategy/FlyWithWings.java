package designpattern.strategy;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I fly with my wings!!");
	}
	
}