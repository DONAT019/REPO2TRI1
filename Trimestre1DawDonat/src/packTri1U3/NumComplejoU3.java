package packTri1U3;

public class NumComplejoU3 {
	
	double real;
	double imag;
	
	//Este de abajo es el constructor//
	public NumComplejoU3() {
		real = 0.0d;
		imag = 0.0d;
		
	}
	//
	public NumComplejoU3(double real, double imag) {
		this.real= real;
		this.imag= imag;

}
	//Getters//
		public double consulta_Real() {
		return real;
	
	}
	
	 	public double consulta_Img() {
	 		return imag;
	 		
	 	}
	 	//Setters//
	 	public void cambia_Real(double real) {
	 		this.real=real;
	 	}
	 	
	 	public void cambia_Imag(double imag) {
	 		this.imag = imag;
	 	}
	 	
	 	
	 	//   Devuelve un string, toString es el nombre del método, str es el alias de una variable que yo designo //
	 	// Aqui concatena real mas un strin="+"//
	 	
	 	public String toString() {
	 		String str= real + " + "+ imag + "i";
	 		return str;
	 	}
	 	
	 	public void sumar(NumComplejoU3 b) {
	 		this.real =this.real + b.real;
	 		this.imag =this.imag + b.imag;   // Esto equivale con + a esta formula:   this.imag += b.imag;   //
	 	}
		public double getReal() {
			return real;
		}
		public void setReal(double real) {
			this.real = real;
		}
		public double getImag() {
			return imag;
		}
		public void setImag(double imag) {
			this.imag = imag;
		}
	
	
	
	}





