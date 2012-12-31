package designpattern.factory.factorymethod;

public class Sauce {
	public String name = "default sauce";
	public Sauce(){}
	public Sauce(String n){name = n;}
	public String toString()
	{
		return name;
	}
}
