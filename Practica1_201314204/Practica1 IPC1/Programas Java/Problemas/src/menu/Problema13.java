package menu;

import java.util.Scanner;

public class Problema13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int respuesta=0, comparar=0;
		Scanner sc=new Scanner(System.in);
		String letra1, letra2;
		System.out.println("ingrese cualquier letra del abecedario");
		
		letra1=sc.next();
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\nIntente adivinar");
		
			while (respuesta==0){
				letra2=sc.next();
				comparar=letra1.compareTo(letra2);
				
			if (comparar<0 ){
				System.out.println("ANTES");
			}
			else if (comparar>0){
		 		System.out.println("DESPUES");
				}	
			 		if (comparar==0){
			 			System.out.println("HAZ ADIVINADO");		
			 			respuesta=2;		
			 		}
			}
		sc.close();
	}

}
