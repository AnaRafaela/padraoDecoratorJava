package DecoratorBarRessaca;

public class Limao extends IngredientesDecorator{
	Drink drink;
	
	public Limao(Drink drink) {
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
			return drink.getDescription() + ", Limão";
		}
	}

	@Override
	public double cost() {
		if(drink.getTipo() == "caipirinha") {
			return drink.cost() + 0.0;
		}
		return 0.70 + drink.cost();
	}

}
