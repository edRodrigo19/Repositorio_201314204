package menu;
import java.util.Scanner;
public class Problema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String hora;
		int h=0; 
		int m=0;
		
			System.out.println("Ingrese hora en formato 00:00 exactamente 5 caracteres");
			hora=s.next();
			
			h=Integer.parseInt(hora.substring(0, hora.indexOf(":")));
			m=Integer.parseInt(hora.substring(hora.indexOf(":")+1 ));
			
		if(hora.length()==5){
			
			if(h==0){
				System.out.println(String.format("%02d",(h+12))+":"+ (String.format("%02d",m))+ " AM"); 
			}
			else if(h==12){
				System.out.println(String.format("%02d",h)+":"+(String.format("%02d",m))+ " PM");
			}
			else if(h>=0 && h<12){
				System.out.println(String.format("%02d",h)+":"+(String.format("%02d",m))+ " AM"); 
			}
			else if(h>=24 || m>60){
				System.out.println("Hora invalida"); 
			}
			else{
				System.out.println(String.format("%02d",(h-12))+":"+(String.format("%02d",m))+ " PM");
				} 
			}	
		else 
			System.out.println("No se ingresaron los 5 caracteres");
		s.close();
	}

}
