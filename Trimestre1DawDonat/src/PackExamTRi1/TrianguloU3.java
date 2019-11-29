package PackExamTRi1;
import java.util.Scanner;
public class TrianguloU3 {

	public static void main(String[] args) {
		
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Write L1:");
		 double L1=sc.nextDouble();
	
		 System.out.println("Write L2:");
		 double L2=sc.nextDouble();
		 
		 System.out.println("Write L3:");
		 double L3=sc.nextDouble();
		 
		 double sp= (L1+L2+L3);
		 double area=Math.sqrt(sp*(sp-L1)*(sp-L2)*(sp-L3));
		 System.out.println("El área de este triangulo es:" + area);
		 System.out .println("La superficie de este triangulo es:"+ sp);

	}

}
