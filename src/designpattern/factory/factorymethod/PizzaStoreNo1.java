package designpattern.factory.factorymethod;

public class PizzaStoreNo1 extends PizzaStore{

	public Pizza createPizza(int id)
	{
		switch(id)
		{
			case 1:
				return new PizzaNo1(new IngredientFactoryNo1());
			case 2:
				return new PizzaNo2();
		}
		return null;
	}
}
