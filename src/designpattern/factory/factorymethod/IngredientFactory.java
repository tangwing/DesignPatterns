package designpattern.factory.factorymethod;
/**
 * This is the abstract factory to produce ingredients
 */
public interface IngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	//...many other ingredients
}
