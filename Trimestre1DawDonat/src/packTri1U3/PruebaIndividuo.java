package packTri1U3;

public class PruebaIndividuo {

	public static void main(String[] args) {
		
		//con new creamos el objeto y le damos vida//
		
		IndividuoU3 i2=new IndividuoU3("1111111F", "Jose", 43);
		
		System.out.println(IndividuoU3.getPoblacion());
		
		IndividuoU3 i1=new  IndividuoU3("112233a", "Daniel", 30);
		
		System.out.println(i1.dni);
		i1.setDni("7777777D");
		System.out.println(i1.nombre);
	

	}

}
