package DecoratorBarRessaca;

public class Vodca extends Drink{
	
	public Vodca() {
		description = "Vodca";
		tipo = "caipiroska";
	}

	@Override
	public double cost() {
		return 3.00;
	}
	
}
