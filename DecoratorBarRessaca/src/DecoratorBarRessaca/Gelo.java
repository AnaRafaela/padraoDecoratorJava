package DecoratorBarRessaca;

public class Gelo extends IngredientesDecorator{
	Drink drink;
	
	public Gelo(Drink drink) {
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
			return drink.getDescription() + ", Gelo";
		}
	}

	@Override
	public double cost() {
		if(drink.getTipo() == "caipirinha") {
			return 0.0 + drink.cost();
		}
		return 0.2 + drink.cost();
	}
	

}
