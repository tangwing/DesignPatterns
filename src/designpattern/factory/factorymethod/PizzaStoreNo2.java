package designpattern.factory.factorymethod;

public class PizzaStoreNo2 extends PizzaStore{

	public Pizza createPizza(int id)
	{
		switch(id)
		{
			case 1:
				return new PizzaNo1();
			case 2:
				return new PizzaNo2(new IngredientFactoryNo2());
		}
		return null;
	}
}
