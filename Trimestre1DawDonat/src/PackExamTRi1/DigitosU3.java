package PackExamTRi1;

import java.util.Scanner;

public class DigitosU3 {

	public static void main(String[] args) {
		
		System.out.println("Introducir  número:");
		Scanner intronum= new Scanner(System.in);
		long num= intronum.nextLong();
		
		int numpar=0;
		int numimpar=0;
		long dig;
		
		while (num>0) {
			dig= num % 10;
			
			if(dig % 2==0)numpar++;
			else numimpar++;
			num=num/10;
		}
				
		System.out.printf("Número de pares %d, Números de impares %d\n",
				numpar, numimpar);
		

	}

}
