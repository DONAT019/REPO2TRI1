package packTri1U3;

public class IndividuoU3 {
	
	public String dni;
	public String nombre;
	public String fechaNacimiento;
	
	//con static permite dejar un valor guardado fijo para diferentes objetos, y solo ocupa una memoria//
	public static int Poblacion;
	
	public IndividuoU3() {}
	
			//Constructor//
	
	public IndividuoU3 (String dni, String nombre, int fechaNacimiento){
	
		this.dni= dni;
		this.nombre= nombre;
		this.fechaNacimiento=fechaNacimiento;
		Poblacion++;
}

  public static int getPoblacion() {
	  return Poblacion;
  }
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
		

}
