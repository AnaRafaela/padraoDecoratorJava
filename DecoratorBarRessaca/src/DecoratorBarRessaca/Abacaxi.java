package DecoratorBarRessaca;

public class Abacaxi extends IngredientesDecorator{
	Drink drink;
	
	public Abacaxi(Drink drink) {
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
			return drink.getDescription() + ", Abacaxi";
		}
	}

	@Override
	public double cost() {
		if(drink.getTipo() == "caipirinha") {
			return drink.cost() + 0.0;
		}
		return 1.50 + drink.cost();
	}

}
