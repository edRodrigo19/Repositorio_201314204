package menu;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un n�mero");
		f=s.nextInt();
		int c=f;
		for(int contar=1; contar<=c; contar++){
			
			for(int espacios=0; espacios<=contar; espacios++){
				System.out.print("   ");
			}
	
			for(int aste=contar; aste<=c; aste++){
				System.out.print("     "+(f-c+1));
			}
			f++;
			System.out.println();
		}
		s.close();
	}

}
