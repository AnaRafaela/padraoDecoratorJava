package DecoratorBarRessaca;

public class Caipirinha extends Cachaca{
	
	public Caipirinha() {
		description = "Caipirinha: Cachaça, açúcar, limão e gelo \"--Atenção: este drink não pode ser modificado--\"";
		tipo = "caipirinha";
	}
	@Override
	public double cost() {
		return 4.0 ;
	}

}
