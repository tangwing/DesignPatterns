package designpattern.factory.factorymethod;

public class Dough {

	public String name = "default dough";
	public Dough(String n){name = n;}
	public Dough(){}
	public String toString()
	{
		return name;
	}
}
