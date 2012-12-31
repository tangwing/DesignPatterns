package designpattern.factory.factorymethod;

public class Pizza {

	protected String name = "origin pizza";
	protected Dough dough = new Dough();
	protected Sauce sauce = new Sauce();
	public void cook()
	{
		System.out.println("Cook \""+name+"\" using: Dough = "+
				dough.toString()+";Sauce = "+sauce.toString());
	}

}
