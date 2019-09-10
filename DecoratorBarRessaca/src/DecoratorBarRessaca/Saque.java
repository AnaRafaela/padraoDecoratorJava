package DecoratorBarRessaca;

public class Saque extends Drink{
	
	public Saque() {
		description = "Saquê";
		tipo = "saquerinha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3.00;
	}

}
