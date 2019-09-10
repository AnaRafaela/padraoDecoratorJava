package DecoratorBarRessaca;

public abstract class Drink {
	String description = "Rabo de galo";
	String tipo = "bebida";
			
	public String getDescription() {
		return description;
	}
	public String getTipo() {
		return tipo;
	}
	
	public abstract double cost();
	
}
