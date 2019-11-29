package PackExamTRi1;

public class PersonaPruebaU3 {

	public static void main(String[] args) {
													
												//Método con Set y Get
		PersonaU3 Alum3= new PersonaU3("Paula Baez", 31, 160);
		 System.out.println( Alum3.getNombre()+ ""
		 		+ " " + Alum3.getEdad()+ " "+ Alum3.getAltura());*/
	
		 PersonaU3 Alum2= new PersonaU3("Daniel Alvarez", 22, 190);
		 System.out.println( Alum2.getNombre()+ ""
		 		+ " " + Alum2.getEdad()+ " "+ Alum2.getAltura());
		 										
		 			//Métodos consultaNombre y cambiaNombre//
		 
		 	PersonaU3 Alum1= new PersonaU3("Paula Baez", 31, 160);
		 	System.out.println( Alum1.consultaNombre());
		 	Alum1.cambiaNombre("Manuel Lozano");
		 	System.out.println(Alum1.consultaNombre());
		 
		 PersonaU3 Alum2=new PersonaU3(Alum1); //Prueba método copia
		 System.out.println(Alum2.consultaNombre()){
			 
		 }
	
	}
}
