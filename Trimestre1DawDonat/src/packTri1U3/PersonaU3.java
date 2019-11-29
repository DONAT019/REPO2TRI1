package packTri1U3;

public class PersonaU3 {
	//atributos//
		String nombre;
		int edad;
		float altura;
		
		
		//método o función//
		String consulta_Nombre() { 
			return nombre;
		}
		void cambia_Nombre(String nom) {
			nombre=nom;
		}
	}
	 //constructor//
	public PersonaU3(String nom) {
	nombre=nom;
	}

	public PersonaU3() {}

	public PersonaU3(String nom, int ed , float alt) {
	nombre=nom;
	edad=ed;
	altura=alt;  //this. se utiliza para evitar asignar alias ej:nom, ed,  de esta forma sería this.edad=edad;//

