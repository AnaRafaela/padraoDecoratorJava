package DecoratorBarRessaca;

public class Cachaca extends Drink{
	
	public Cachaca() {
		description = "Cachaça";
		tipo = "caipira";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3.00;
	}

}
