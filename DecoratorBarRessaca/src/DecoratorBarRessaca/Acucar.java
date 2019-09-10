package DecoratorBarRessaca;

public class Acucar extends IngredientesDecorator{
	Drink drink;
	Caipirinha caipirinha;
	
	public Acucar(Drink drink) {
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
		}
		return drink.getDescription() + ", Açúcar";
	}

	@Override
	public double cost() {
		if(drink.getTipo() == "caipirinha") {
			return 0.0 + drink.cost();
		}
		return 0.10 + drink.cost();
	}

}
