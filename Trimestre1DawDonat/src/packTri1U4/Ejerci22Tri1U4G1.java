package packTri1U4;

import java.util.Scanner;

public class Ejerci22Tri1U4G1 {

	public static void main(String[] args) {
		Scanner brain = new Scanner(System.in);
	
		double precioTotal,pesoPaquete;
		
		precioTotal=brain.nextInt();
		
		pesoPaquete=brain.nextInt();
		
		System.out.println("Aplicar pesoPaquete");
		
		if (pesoPaquete <=2) {
				precioTotal=pesoPaquete * 2.5;
				System.out.println("El precio de tu paquete es:" + precioTotal);
		}
		 else if (pesoPaquete <=4) {
			precioTotal=pesoPaquete * 4.5;
			System.out.printf("El precio de tu paquete es: %f%n" , precioTotal);
			}
		
		 else if (pesoPaquete <=10) { 
			precioTotal=pesoPaquete * 7.5;
				System.out.println("El precio de tu paquete es:" + precioTotal);
			}
		
		 else if (pesoPaquete <=20) { 
			precioTotal=pesoPaquete * 10.5;
				System.out.printf("El precio de tu paquete es: %f%n",precioTotal);
			}
		else {
			System.out.println("Este paquete de mas de 20 kg no viaja...!!");
	}
		


	}
}




