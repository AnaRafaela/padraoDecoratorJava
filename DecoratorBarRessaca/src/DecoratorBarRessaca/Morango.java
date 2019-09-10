package DecoratorBarRessaca;

public class Morango extends IngredientesDecorator{
	Drink drink;
	
	public Morango(Drink drink) {
		this.drink = drink;
	}
	@Override
	public String getTipo() {
		return drink.getTipo();
	}

	@Override
	public String getDescription() {
		if(drink.tipo == "caipirinha") {
			return drink.getDescription();
		}else {
			return drink.getDescription() + ", Morango";
		}
	}

	@Override
	public double cost() {
		if(drink.tipo == "caipirinha") {
			return 0.0 + drink.cost();
		}
		return 1.50 + drink.cost();
	}

}
