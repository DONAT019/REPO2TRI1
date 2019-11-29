package packTri1U3;

public class PruebaNumComplejoU3 {
	public static void main (String[]args) {
		
		NumComplejoU3 c1=new NumComplejoU3();
		NumComplejoU3 c2=new NumComplejoU3();
		
		
		c1.cambia_Real(7.7);
		c1.cambia_Imag(9.6);
		c2.cambia_Real(8.5);
		c2.cambia_Imag(10.6);
		System.out.println(c1.real + " " + c1.imag);
		System.out.println(c2.real + " " + c2.imag);
		c1.sumar(c2);
		
		System.out.println(c1.real + " " + c1.imag);
		System.out.println(c2.real + " " + c2.imag);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		
		
	}

}
