package DecoratorBarRessaca;

public class Adocante extends IngredientesDecorator{
	Drink drink;
	
	public Adocante(Drink drink) {
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
			return drink.getDescription() + ", Adoçante";
		}
	}

	@Override
	public double cost() {
		if(drink.getTipo() == "caipirinha") {
			return 0.0 + drink.cost();
		}
		return 0.10 + drink.cost();
	}

}
