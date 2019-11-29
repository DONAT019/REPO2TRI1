/*
    Crea una clase Geometria que tenga dos funciones que puedan ser utilizadas sin crear el objeto con new. Dichas funciones son:
2
volumenCilindro -> retorna el volumen de un cilindro  (Pi* r ^2 *h)

longitudCircunferencia -> retorna la longitud de la circunferencia (2 * Pi* r)

Todos los datos son double.*/

package PackExamTRi1;

	//clase Geometria U3
public class GeometriaU3 {
	
	//Atributos
	public static double h, r;
	
	
	//Construntor por defecto, que lleva la clase al declararla, 
	public GeometriaU3() {}
	
	//Constructor que se debe escribir si queremos crear en un class Mai, algún objeto.
	public GeometriaU3(double h, double r){
		this.h = h;
		this.r = r;
	
}
	//Metodos o funciones(formulas)
	public static double volumenCilindro() {
		return Math.PI* Math.pow(r, 2)* h;
	}

	public static double longitudCircunferencia() {
		return  2 * Math.PI * r;

	}
}





