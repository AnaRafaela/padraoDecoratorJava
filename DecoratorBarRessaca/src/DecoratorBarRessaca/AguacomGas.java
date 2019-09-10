package DecoratorBarRessaca;

public class AguacomGas extends Drink{
	
	public AguacomGas() {
		description = "Água com gás";
		tipo = "semAlcool";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3.00;
	}

}
