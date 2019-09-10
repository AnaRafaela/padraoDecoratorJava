package DecoratorBarRessaca;

public class Kiwi extends IngredientesDecorator{
	Drink drink;
	
	public Kiwi(Drink drink) {
		this.drink = drink;
	}
	@Override
	public String getTipo() {
		return drink.getTipo();
	}

	@Override
	public String getDescription() {
		if(drink.getTipo() == "caipirinha") {
			return drink.getDescription();
		}else {
			return drink.getDescription() + ", Kiwi";
		}
	}

	@Override
	public double cost() {
		if(drink.getTipo() == "caipirinha") {
			return 0.0 + drink.cost();
		}
		return 2.30 + drink.cost();
	}

}
