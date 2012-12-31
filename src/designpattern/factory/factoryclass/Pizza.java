package designpattern.factory.factoryclass;

public class Pizza {

	protected String name = "origin pizza";
	
	public void prepare()
	{
		System.out.println("Prepare \""+name+"\".");
	}
	
	public void cook()
	{
		System.out.println("Cook \""+name+"\".");
	}
	
	public void delivery()
	{
		System.out.println("Delivery \""+name+"\".");
	}
}
