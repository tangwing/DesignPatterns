package designpattern.strategy;
/**
 * This is the base class for all ducks. The behivior of 
 * Duck is abstracted by using interfaces. So we can change
 * the behivior of a sub-duck during runtime.
 * (DS-Strategy)
 * @author shang
 *
 */
public class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	Duck()
	{
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	/**
	 * Set the fly behivior of current duck
	 * @param fb
	 */
	public void setFlyBehivior(FlyBehavior fb)
	{
		this.flyBehavior = fb;
	}
	
	public void setQuackBehivior(QuackBehavior qb)
	{
		this.quackBehavior = qb;
	}
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void performQuack()
	{
		quackBehavior.quack();
	}
}
