package PackExamTRi1;

public class CirculoU3 {
	
	//Atributos//
	public static final double PI= 3.141592;
	
	
	//Miembro Dato//
	public double radio;
	
	//Constructores: aquí son dos según enunciado//

		public CirculoU3( double radio) {
		 this.radio=radio;
			
		}
		
		public CirculoU3() {
		 radio = 2;		
		}
		//constructor copia//
		public CirculoU3(CirculoU3 p) {
			this.radio= p.radio;
			
		}
		
		//Metodos//
		
		public double CalcularSuperficie() {
			return   Math.pow(radio, 2)* Math.PI;
			
			// return (radio , 2) * Pi//
		}

			//Get(que devuelve algo) and Set(que deja reemplazar nuevos valores para los calculos//
		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}

		public static double getPi() {
			return PI;
		}
		
		
}
		
		
