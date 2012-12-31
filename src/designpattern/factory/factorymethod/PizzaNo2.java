package designpattern.factory.factorymethod;

public class PizzaNo2 extends Pizza{

	//String name = "pizza no.2";
	public PizzaNo2() {
		name = "pizza no.2";
	}
	public PizzaNo2(IngredientFactory i)
	{
		 name = "pizza no.2";
		dough = i.createDough();
		sauce = i.createSauce();
	}
}
