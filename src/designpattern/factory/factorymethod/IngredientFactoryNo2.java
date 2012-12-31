package designpattern.factory.factorymethod;

public class IngredientFactoryNo2 implements IngredientFactory{

	public Dough createDough()
	{
		return new Dough("dough from factory No2");
	}
	public Sauce createSauce()
	{
		return new Sauce("sauce from factory No2");
	}
	//...many other ingredients
}
