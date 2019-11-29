package packTri1U3;

public class CRacional {
	
	int numerador;
	int denominador;
	
	void asignarDatos(int num, int den) {
		numerador=num;
		if (den==0) den=1;    //el denominador no puede ser 0//
		denominador=den;
	}


	public CRacional() {}
	//Constructor//
	
	public CRacional (int num, int den) {
	this.num=num;
	this.den=den;
	
	
}
	
	
	void visualizarRacional() {
		System.out.println(numerador + "/" + denominador);
	}
	
	
	
	
	
	
	public static void main(String[]args)
	
}

		r1.asignarDatos(2, 5);
		
		r1.visualizarRacional();
		
		}
	}


