package PackExamTRi1;

public class PizzaU3 {
	
	//Declaración de variables//
	
	public int totalPedido=0;
	public int totalServicio=0;
	
	public String tamanyo;
	public String tipo;
	public String pedido;
	
	
	
	//Constructores//
	public PizzaU3(String tamanyo, String tipo, String pedido) {
		
	this.tamanyo=tamanyo;
	this.tipo=tipo;
	this.pedido = pedido;
	this.totalPedido++;
	
	}

		
		
	//Get and Set//

	public int getTotalPedido() {
		return totalPedido;
	}



	public void setTotalPedido(int totalPedido) {
		this.totalPedido = totalPedido;
	}



	public int getTotalServicio() {
		return totalServicio;
	}



	public void setTotalServicio(int totalServicio) {
		this.totalServicio = totalServicio;
	}



	public String getTamanyo() {
		return tamanyo;
	}



	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getPedido() {
		return pedido;
	}



	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	
	

}
