package menu;

public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horizontal=8,vertical=horizontal*2; 
		for(int contar=0;contar<=horizontal;contar++){ 
			
			for(int espacios=horizontal-1;espacios>=contar;espacios--)
			{
				System.out.print(" ");
			}
			for(int aste=0;aste<=(contar+contar);aste++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
		for(int contar=0;contar<=horizontal-1;contar++){ 
			
			for(int espacios=0;espacios<=contar;espacios++)
			{
				System.out.print(" ");
			}
			for(int aste=contar+2+contar;aste<=vertical;aste++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
	}

}
