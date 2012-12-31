package designpattern.factory.factorymethod;

public class IngredientFactoryNo1 implements IngredientFactory{

	public Dough createDough()
	{
		return new Dough("dough from factory No1");
	}
	public Sauce createSauce()
	{
		return new Sauce("sauce from factory No1");
	}
	//...many other ingredients
}
