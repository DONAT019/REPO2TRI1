package PackExamTRi1;

public class RectanguloU3 {
	
	//Atributos//
	public double base;
	public double altura;
	public double area;
	public double perimetro;
	
	//"Miembro Dato" No hay en este ejercicio//
	
	//Constructor//
	public RectanguloU3( double base, double altura) {
		this.base= base;
		this.altura=altura;
	}
	public RectanguloU3() {
	}
	
	public RectanguloU3(RectanguloU3 R) {
		this.base= R.base;
		this.altura= R.altura;
	}
	
	
	//Método//
	public double getPerimetro() {
	return (base + base) + (altura + altura);
	}
	 public double getArea() {
	return  base * altura;
	 }
	 
	
	 //Get and Set//
	
	 public double getbase() {
			return base;
		}

		public void setbase(double base) {
			this.base= base;
		}
		
		public double getaltura() {
			return altura;
		}

		public void setaltura(double altura) {
			this.altura= altura;
		}
		 public double getarea() {
			 return area;
		 }
		public double getperimetro() {
			return perimetro;
		}
		
		
}


		//Get and Set con  botton derecho source y generate set an get es ora opcion//




