package designpattern.factory.factoryclass;

public class PizzaStoreNo1 extends PizzaStore{

	public Pizza createPizza(int id)
	{
		switch(id)
		{
			case 1:
				return new PizzaNo1OfPizzaStore1();
			case 2:
				return new PizzaNo2();
		}
		return null;
	}
}
