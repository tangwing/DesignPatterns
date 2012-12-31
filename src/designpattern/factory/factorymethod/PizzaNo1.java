package designpattern.factory.factorymethod;

public class PizzaNo1 extends Pizza{

	//String name = "pizza no.1";
	public PizzaNo1() {
		name = "pizza no.1";
	}
	
	
	public PizzaNo1(IngredientFactory i)
	{
		name = "pizza no.1";
		dough = i.createDough();
		sauce = i.createSauce();
	}
}
