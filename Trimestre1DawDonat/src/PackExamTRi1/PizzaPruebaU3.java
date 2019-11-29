package PackExamTRi1;

public class PizzaPruebaU3 {

	public static void main(String[] args) {
		PizzaU3 C1= new PizzaU3 ("grande", "margarita", null);
		System.out.println(C1.getTamanyo() + " " + C1.getTipo() + " " + C1.getTotalPedido());
		System.out.println(C1.getTamanyo() + " " + C1.getTipo() + " " + C1.getTotalServicio());
		
		PizzaU3 C2= new PizzaU3("mediana", "pecado mortal", null);
		System.out.println(C2.getTamanyo() +  " " + C2.getTipo() + " " + C2.getTotalPedido());
		PizzaU3 C3=new PizzaU3("pequeña", "mexicana", null);
		System.out.println(C3.getTamanyo() + " " + C3.getTipo() + " " + C3.getTotalPedido());

	}

}
