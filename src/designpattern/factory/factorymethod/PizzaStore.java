package designpattern.factory.factorymethod;

public class PizzaStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PizzaStore ps = new PizzaStore();
		ps.orderPizza(1);
		ps.orderPizza(2);
		//We don't need to modify orderPizza, when
		//there are some new kinds of pizza.
		ps = new PizzaStoreNo1();
		ps.orderPizza(1);
		
		ps = new PizzaStoreNo2();
		ps.orderPizza(2);
	}
	
	public void orderPizza(int id)
	{
		Pizza p = createPizza(id);
		p.cook();
	}
	
	public Pizza createPizza(int id)
	{
		switch(id)
		{
			case 1:
				return new PizzaNo1();
			case 2:
				return new PizzaNo2();
		}
		return null;
	}

}
