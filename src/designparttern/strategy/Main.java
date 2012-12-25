package designparttern.strategy;

/**
 * This package of classed is used to illustrate 
 * the "Strategy" design pattern. Duck, whitch is the base
 * class of all ducks, has its behiviors abstracted by 
 * using interfaces. So we can change
 * the behivior of a sub-duck during runtime.
 * (DS-Strategy)
 * @author shang
 *
 */
public class Main {

	public Main(){}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		md.performFly();
		md.performQuack();
		//Here we can change the behivior of md
		//in runtime!!!
		md.setFlyBehivior(new FlyNoWay());
		md.setQuackBehivior(new Squeak());
		md.performFly();
		md.performQuack();

	}

}
