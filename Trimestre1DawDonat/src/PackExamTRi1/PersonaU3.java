package PackExamTRi1;

public class PersonaU3 {
	
							//Declaración variables
	 public String nombre;
	 public int edad;
	 public long altura;
	 
	 							//Constructor

	 public PersonaU3(String nombre, int edad, long altura) {
		 this.nombre=nombre;
		 this.edad=edad;
		 this.altura=altura;
	 }
	 
	 							//Constructor copia
	 
	 public PersonaU3(PersonaU3 p) {
		 this.nombre=p.nombre;
		 this.edad=p.edad;
		 this.altura=p.altura;
	 }
	 
	 
	 	                      //Método-función
	 
	 public String consultaNombre() {
		 return nombre;
	 }

	 	public void cambiaNombre(String nombre) {
	 		this.nombre=nombre;
	 	
	 		
	 	}
	 							//Get and Set
	 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getAltura() {
		return altura;
	}

	public void setAltura(long altura) {
		this.altura = altura;
	}

	 
	 
	

}


