package designpattern.factory.factoryclass;

public class PizzaStoreNo2 extends PizzaStore{

	public Pizza createPizza(int id)
	{
		switch(id)
		{
			case 1:
				return new PizzaNo1();
			case 2:
				return new PizzaNo2OfPizzaStore2();
		}
		return null;
	}
}
