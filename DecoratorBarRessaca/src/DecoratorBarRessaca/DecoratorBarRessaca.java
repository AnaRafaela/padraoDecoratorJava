package DecoratorBarRessaca;

public class DecoratorBarRessaca {
	
	public static void main(String[] args) {
		//class main *o_o*
		Drink pedido1 = new Vodca();
		pedido1 = new Gelo(pedido1);
		pedido1 = new Limao(pedido1);
		pedido1 = new Morango(pedido1);
		pedido1 = new Adocante(pedido1);
		System.out.printf(pedido1.getDescription() + " = R$ %.2f \n" , pedido1.cost());
		
		Drink pedido2 = new Caipirinha();		
		pedido2 = new Adocante(pedido2);
		pedido2 = new Kiwi(pedido2);
		pedido2 = new Abacaxi(pedido2);
		System.out.printf(pedido2.getDescription() + " = R$ %.2f \n" , pedido2.cost());
		
		Drink pedido3 = new Cachaca();	
		pedido3 = new Gelo(pedido3);
		pedido3 = new Limao(pedido3);
		pedido3 = new Limao(pedido3);
		pedido3 = new Morango(pedido3);
		pedido3 = new Abacaxi(pedido3);
		pedido3 = new Adocante(pedido3);
		System.out.printf(pedido3.getTipo() + pedido3.getDescription() + " = R$ %.2f \n" , pedido3.cost());
		
		Drink pedido4 = new Caipirinha();	
		pedido4 = new Abacaxi(pedido4);
		pedido4 = new Abacaxi(pedido4);
		pedido4 = new Kiwi(pedido4);
		System.out.printf(pedido4.getDescription() + " = R$ %.2f \n" , pedido4.cost());
		
		Drink pedido5 = new Cachaca();
		pedido5 = new Gelo(pedido5);
		pedido5 = new Limao(pedido5);
		pedido5 = new Acucar(pedido5);
		System.out.printf(pedido5.getDescription() + " = R$ %.2f \n" , pedido5.cost());
		
	}

}
