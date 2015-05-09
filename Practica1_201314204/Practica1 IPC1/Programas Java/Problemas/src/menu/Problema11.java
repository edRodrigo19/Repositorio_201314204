package menu;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner r = new Scanner(System.in);

	        System.out.println("Ingrese 6 números Romanos entre 0 y 100: ");
	        String romano1, romano2, romano3, romano4, romano5;
	        
	        romano1= r.next();
	      
	        char Rom[]= {' ','I','V','X','L','C'}; 
	        int valor[] = {0,1,5,10,50,100};
	        int suma1=0, suma2=0, suma3=0, suma4=0, suma5=0;
	        int ant1=0, ant2=0, ant3=0, ant4=0, ant5=0;  
	        char letra = ' ';
	        
	        for(int i = 0; i < romano1.length(); i++){
	                letra = romano1.charAt(i);
	                
	                for(int j = 0; j < Rom.length; j++){
	                    if(letra == Rom[j]){             
	                                suma1 = suma1 + valor [j]; 
	                                
	                            if( ant1 < valor[j]){ 
	                                    suma1 = suma1 - ant1*2 ; 
	                                    ant1 = valor[j]; 
	                                    
	                            }else {
	                        ant1 = valor[j];    
	                            	}
	                    }              

	                }

	        }
	        					
	        				romano2= r.next();
	        			        for(int i = 0; i < romano2.length(); i++){
	        			                letra = romano2.charAt(i);
	        			                
	        			                for(int j = 0; j < Rom.length; j++){
	        			                    if(letra == Rom[j]){            
	        			                                suma2 = suma2 + valor [j]; 
	        			                                
	        			                            if( ant2 < valor[j]){ 
	        			                                    suma2 = suma2 - ant2*2 ; 
	        			                                    ant2 = valor[j]; 
	        			                                    
	        			                            }else {
	        			                        ant2 = valor[j];       
	        			                            	}
	        			                    }              

	        			                }

	        			        }
	        			        
	        			        romano3= r.next();
	        			        for(int i = 0; i < romano3.length(); i++){
	        			                letra = romano3.charAt(i);
	        			                
	        			                for(int j = 0; j < Rom.length; j++){
	        			                    if(letra == Rom[j]){          
	        			                                suma3 = suma3 + valor [j]; 
	        			                                
	        			                            if( ant3 < valor[j]){ 
	        			                                    suma3 = suma3 - ant3*2 ; 
	        			                                    ant3 = valor[j];    			                               
	        			                            }else {
	        			                        ant3 = valor[j];         
	        			                            	}
	        			                    }              

	        			                }

	        			        }
	        			        
	        			        romano4= r.next();
	        			        for(int i = 0; i < romano4.length(); i++){
	        			                letra = romano4.charAt(i);
	        			                
	        			                for(int j = 0; j < Rom.length; j++){
	        			                    if(letra == Rom[j]){       
	        			                                suma4 = suma4 + valor [j]; 
	        			                                
	        			                            if( ant4 < valor[j]){ 
	        			                                    suma4 = suma4 - ant4*2 ;
	        			                                    ant4 = valor[j];
	        			                                    
	        			                            }else {
	        			                        ant4 = valor[j];    
	        			                            	}
	        			                    }              

	        			                }

	        			        }
	        			        
	        			        romano5= r.next();
	        			        for(int i = 0; i < romano5.length(); i++){
	        			                letra = romano5.charAt(i);
	        			                
	        			                for(int j = 0; j < Rom.length; j++){
	        			                    if(letra == Rom[j]){             
	        			                                suma5 = suma5 + valor [j]; 
	        			                                
	        			                            if( ant5 < valor[j]){ 
	        			                                    suma5 = suma5 - ant5*2 ; 
	        			                                    ant5 = valor[j]; 
	        			                                    
	        			                            }else {
	        			                        ant5 = valor[j];
	        			                            	}
	        			                    }              

	        			                }

	        			        }
	        			        
	        			        if(suma1<suma2 && suma1<suma3 && suma1<suma4 && suma1<suma5)
	        			        {
	    			        		System.out.println( romano1+ " es el menor");
	        			        }
	    			        else if(suma2<suma1 && suma2<suma3 && suma2<suma4 && suma2<suma5)
	    			        {
				        		System.out.println( romano2+ " es el menor");
	    			        }
	    			        else if(suma3<suma2 && suma3<suma1 && suma3<suma4 && suma3<suma5)
	    			        {
				        		System.out.println( romano3+ " es el menor");
	    			        }
	    			        else if(suma4<suma1 && suma4<suma2 && suma4<suma3 && suma4<suma5)
	    			        {
				        		System.out.println( romano4+ " es el menor");
	    			        }
	    			        else if(suma5<suma1 && suma5<suma2 && suma5<suma3 && suma5<suma4)
	    			        {
				        		System.out.println( romano5+ " es el menor");
	    			        }
	        			        
	        			        if(suma1>suma2 && suma1>suma3 && suma1>suma4 && suma1>suma5)
	        			        {
	        			        		System.out.println( romano1+ " es el mayor");
	        			        }
	        			        else if(suma2>suma1 && suma2>suma3 && suma2>suma4 && suma2>suma5)
	        			        {
	    			        		System.out.println( romano2+ " es el mayor");
	        			        }
	        			        else if(suma3>suma2 && suma3>suma1 && suma3>suma4 && suma3>suma5)
	        			        {
	    			        		System.out.println( romano3+ " es el mayor");
	        			        }
	        			        else if(suma4>suma1 && suma4>suma2 && suma4>suma3 && suma4>suma5)
	        			        {
	    			        		System.out.println( romano4+ " es el mayor");
	        			        }
	        			        else if(suma5>suma1 && suma5>suma2 && suma5>suma3 && suma5>suma4)
	        			        {
	    			        		System.out.println( romano5+ " es el mayor");
	        			        }
	        			        
	        			        switch (suma1){
	        					case (0):	
	        						System.out.println("CERO");
	        						break;
	        			
	        					case (1):	
	        						System.out.println("UNO");
	        						break;
	        					case (2):	
	        						System.out.println("DOS");
	        						break;
	        					case (3):	
	        						System.out.println("TRES");
	        						break;
	        					case (4):	
	        						System.out.println("CUATRO");
	        						break;
	        					case (5):	
	        						System.out.println("CINCO");
	        						break;
	        					case (6):	
	        						System.out.println("SEIS");
	        						break;
	        					case (7):	
	        						System.out.println("SIETE");
	        						break;
	        					case (8):	
	        						System.out.println("OCHO");
	        						break;
	        					case (9):	
	        						System.out.println("NUEVE");
	        						break;
	        					case (10):	
	        						System.out.println("DIEZ");
	        						break;
	        					case (11):	
	        						System.out.println("ONCE");
	        						break;
	        					case (12):	
	        						System.out.println("DOCE");
	        						break;
	        					case (13):	
	        						System.out.println("TRECE");
	        						break;
	        					case (14):	
	        						System.out.println("CATORCE");
	        						break;
	        					case (15):	
	        						System.out.println("QUINCE");
	        						break;
	        					case (16):	
	        						System.out.println("DIESISEIS");
	        						break;
	        					case (17):	
	        						System.out.println("DIESISIETE");
	        						break;
	        					case (18):	
	        						System.out.println("DIESIOCHO");
	        						break;
	        					case (19):	
	        						System.out.println("DIESINUEVE");
	        						break;
	        					case (20):	
	        						System.out.println("VEINTE");
	        						break;
	        					case (21):	
	        						System.out.println("VEINTIUNO");
	        						break;
	        					case (22):	
	        						System.out.println("VEINTIDOS");
	        						break;
	        					case (23):	
	        						System.out.println("VEINTITRES");
	        						break;
	        					case (24):	
	        						System.out.println("VEINTICUATRO");
	        						break;
	        					case (25):	
	        						System.out.println("VEINTICINCO");
	        						break;
	        					case (26):	
	        						System.out.println("VEINTISEIS");
	        						break;
	        					case (27):	
	        						System.out.println("VEINTISIETE");
	        						break;
	        					case (28):	
	        						System.out.println("VEINTIOCHO");
	        						break;
	        					case (29):	
	        						System.out.println("VEINTINUEVE");
	        						break;
	        					case (30):	
	        						System.out.println("TREINTA");
	        						break;
	        					case (31):	
	        						System.out.println("TREINTA Y UNO");
	        						break;
	        					case (32):	
	        						System.out.println("TREINTA Y DOS");
	        						break;
	        					case (33):	
	        						System.out.println("TREINTA Y TRES");
	        						break;
	        					case (34):	
	        						System.out.println("TREINTA Y CUATRO");
	        						break;
	        					case (35):	
	        						System.out.println("TREINTA Y CINCO");
	        						break;
	        					case (36):	
	        						System.out.println("TREINTA Y SEIS");
	        						break;
	        					case (37):	
	        						System.out.println("TREINTA Y SIETE");
	        						break;
	        					case (38):	
	        						System.out.println("TREINTA Y OCHO");
	        						break;
	        					case (39):	
	        						System.out.println("TREINTA Y NUEVE");
	        						break;
	        					case (40):	
	        						System.out.println("CUARENTA");
	        						break;
	        					case (41):	
	        						System.out.println("CUARENTA Y UNO");
	        						break;
	        					case (42):	
	        						System.out.println("CUARENTA Y DOS");
	        						break;
	        					case (43):	
	        						System.out.println("CUARENTA Y TRES");
	        						break;
	        					case (44):	
	        						System.out.println("CUARENTA Y CUATRO");
	        						break;
	        					case (45):	
	        						System.out.println("CUARENTA Y CINCO");
	        						break;
	        					case (46):	
	        						System.out.println("CUARENTA Y SEIS");
	        						break;
	        					case (47):	
	        						System.out.println("CUARENTA Y SIETE");
	        						break;
	        					case (48):	
	        						System.out.println("CUARENTA Y OCHO");
	        						break;
	        					case (49):	
	        						System.out.println("CUARENTA Y NUEVE");
	        						break;
	        					case (50):	
	        						System.out.println("CINCUENTA");
	        						break;
	        					case (51):	
	        						System.out.println("CINCUENTA Y UNO");
	        						break;
	        					case (52):	
	        						System.out.println("CINCUENTA Y DOS");
	        						break;
	        					case (53):	
	        						System.out.println("CINCUENTA Y TRES");
	        						break;
	        					case (54):	
	        						System.out.println("CINCUENTA Y CUATRO");
	        						break;
	        					case (55):	
	        						System.out.println("CINCUENTA Y CINCO");
	        						break;
	        					case (56):	
	        						System.out.println("CINCUENTA Y SEIS");
	        						break;
	        					case (57):	
	        						System.out.println("CINCUENTA Y SIETE");
	        						break;
	        					case (58):	
	        						System.out.println("CINCUENTA Y OCHO");
	        						break;
	        					case (59):	
	        						System.out.println("CINCUENTA Y NUEVE");
	        						break;
	        					case (60):	
	        						System.out.println("SESENTA");
	        						break;
	        					case (61):	
	        						System.out.println("SESENTA Y UNO");
	        						break;
	        					case (62):	
	        						System.out.println("SESENTA Y DOS");
	        						break;
	        					case (63):	
	        						System.out.println("SESENTA Y TRES");
	        						break;
	        					case (64):	
	        						System.out.println("SESENTA Y CUATRO");
	        						break;
	        					case (65):	
	        						System.out.println("SESENTA Y CINCO");
	        						break;
	        					case (66):	
	        						System.out.println("SESENTA Y SEIS");
	        						break;
	        					case (67):	
	        						System.out.println("SESENTA Y SIETE");
	        						break;
	        					case (68):	
	        						System.out.println("SESENTA Y OCHO");
	        						break;
	        					case (69):	
	        						System.out.println("SESENTA Y NUEVE");
	        						break;
	        					case (70):	
	        						System.out.println("SETENTA");
	        						break;
	        					case (71):	
	        						System.out.println("SETENTA Y UNO");
	        						break;
	        					case (72):	
	        						System.out.println("SETENTA Y DOS");
	        						break;
	        					case (73):	
	        						System.out.println("SETENTA Y TRES");
	        						break;
	        					case (74):	
	        						System.out.println("SETENTA Y CUATRO");
	        						break;
	        					case (75):	
	        						System.out.println("SETENTA Y CINCO");
	        						break;
	        					case (76):	
	        						System.out.println("SETENTA Y SEIS");
	        						break;
	        					case (77):	
	        						System.out.println("SETENTA Y SIETE");
	        						break;
	        					case (78):	
	        						System.out.println("SETENTA Y OCHO");
	        						break;
	        					case (79):	
	        						System.out.println("SETENTA Y NUEVE");
	        						break;
	        					case (80):	
	        						System.out.println("OCHENTA");
	        						break;
	        					case (81):	
	        						System.out.println("OCHENTA Y UNO");
	        						break;
	        					case (82):	
	        						System.out.println("OCHENTA Y DOS");
	        						break;
	        					case (83):	
	        						System.out.println("OCHENTA Y TRES");
	        						break;
	        					case (84):	
	        						System.out.println("OCHENTA Y CUATRO");
	        						break;
	        					case (85):	
	        						System.out.println("OCHENTA Y CINCO");
	        						break;
	        					case (86):	
	        						System.out.println("OCHENTA Y SEIS");
	        						break;
	        					case (87):	
	        						System.out.println("OCHENTA Y SIETE");
	        						break;
	        					case (88):	
	        						System.out.println("OCHENTA Y OCHO");
	        						break;
	        					case (89):	
	        						System.out.println("OCHENTA Y NUEVE");
	        						break;
	        					case (90):	
	        						System.out.println("NOVENTA");
	        						break;
	        					case (91):	
	        						System.out.println("NOVENTA Y UNO");
	        						break;
	        					case (92):	
	        						System.out.println("NOVENTA Y DOS");
	        						break;
	        					case (93):	
	        						System.out.println("NOVENTA Y TRES");
	        						break;
	        					case (94):	
	        						System.out.println("NOVENTA Y CUATRO");
	        						break;
	        					case (95):	
	        						System.out.println("NOVENTA Y CINCO");
	        						break;
	        					case (96):	
	        						System.out.println("NOVENTA Y SEIS");
	        						break;
	        					case (97):	
	        						System.out.println("NOVENTA Y SIETE");
	        						break;
	        					case (98):	
	        						System.out.println("NOVENTA Y OCHO");
	        						break;
	        					case (99):	
	        						System.out.println("NOVENTA Y NUEVE");
	        						break;
	        					case (100):	
	        						System.out.println("CIEN");
	        						break;
	        					}
	        					r.close();
	        			
	
	
	switch (suma2){
	case (0):	
		System.out.println("CERO");
		break;

	case (1):	
		System.out.println("UNO");
		break;
	case (2):	
		System.out.println("DOS");
		break;
	case (3):	
		System.out.println("TRES");
		break;
	case (4):	
		System.out.println("CUATRO");
		break;
	case (5):	
		System.out.println("CINCO");
		break;
	case (6):	
		System.out.println("SEIS");
		break;
	case (7):	
		System.out.println("SIETE");
		break;
	case (8):	
		System.out.println("OCHO");
		break;
	case (9):	
		System.out.println("NUEVE");
		break;
	case (10):	
		System.out.println("DIEZ");
		break;
	case (11):	
		System.out.println("ONCE");
		break;
	case (12):	
		System.out.println("DOCE");
		break;
	case (13):	
		System.out.println("TRECE");
		break;
	case (14):	
		System.out.println("CATORCE");
		break;
	case (15):	
		System.out.println("QUINCE");
		break;
	case (16):	
		System.out.println("DIESISEIS");
		break;
	case (17):	
		System.out.println("DIESISIETE");
		break;
	case (18):	
		System.out.println("DIESIOCHO");
		break;
	case (19):	
		System.out.println("DIESINUEVE");
		break;
	case (20):	
		System.out.println("VEINTE");
		break;
	case (21):	
		System.out.println("VEINTIUNO");
		break;
	case (22):	
		System.out.println("VEINTIDOS");
		break;
	case (23):	
		System.out.println("VEINTITRES");
		break;
	case (24):	
		System.out.println("VEINTICUATRO");
		break;
	case (25):	
		System.out.println("VEINTICINCO");
		break;
	case (26):	
		System.out.println("VEINTISEIS");
		break;
	case (27):	
		System.out.println("VEINTISIETE");
		break;
	case (28):	
		System.out.println("VEINTIOCHO");
		break;
	case (29):	
		System.out.println("VEINTINUEVE");
		break;
	case (30):	
		System.out.println("TREINTA");
		break;
	case (31):	
		System.out.println("TREINTA Y UNO");
		break;
	case (32):	
		System.out.println("TREINTA Y DOS");
		break;
	case (33):	
		System.out.println("TREINTA Y TRES");
		break;
	case (34):	
		System.out.println("TREINTA Y CUATRO");
		break;
	case (35):	
		System.out.println("TREINTA Y CINCO");
		break;
	case (36):	
		System.out.println("TREINTA Y SEIS");
		break;
	case (37):	
		System.out.println("TREINTA Y SIETE");
		break;
	case (38):	
		System.out.println("TREINTA Y OCHO");
		break;
	case (39):	
		System.out.println("TREINTA Y NUEVE");
		break;
	case (40):	
		System.out.println("CUARENTA");
		break;
	case (41):	
		System.out.println("CUARENTA Y UNO");
		break;
	case (42):	
		System.out.println("CUARENTA Y DOS");
		break;
	case (43):	
		System.out.println("CUARENTA Y TRES");
		break;
	case (44):	
		System.out.println("CUARENTA Y CUATRO");
		break;
	case (45):	
		System.out.println("CUARENTA Y CINCO");
		break;
	case (46):	
		System.out.println("CUARENTA Y SEIS");
		break;
	case (47):	
		System.out.println("CUARENTA Y SIETE");
		break;
	case (48):	
		System.out.println("CUARENTA Y OCHO");
		break;
	case (49):	
		System.out.println("CUARENTA Y NUEVE");
		break;
	case (50):	
		System.out.println("CINCUENTA");
		break;
	case (51):	
		System.out.println("CINCUENTA Y UNO");
		break;
	case (52):	
		System.out.println("CINCUENTA Y DOS");
		break;
	case (53):	
		System.out.println("CINCUENTA Y TRES");
		break;
	case (54):	
		System.out.println("CINCUENTA Y CUATRO");
		break;
	case (55):	
		System.out.println("CINCUENTA Y CINCO");
		break;
	case (56):	
		System.out.println("CINCUENTA Y SEIS");
		break;
	case (57):	
		System.out.println("CINCUENTA Y SIETE");
		break;
	case (58):	
		System.out.println("CINCUENTA Y OCHO");
		break;
	case (59):	
		System.out.println("CINCUENTA Y NUEVE");
		break;
	case (60):	
		System.out.println("SESENTA");
		break;
	case (61):	
		System.out.println("SESENTA Y UNO");
		break;
	case (62):	
		System.out.println("SESENTA Y DOS");
		break;
	case (63):	
		System.out.println("SESENTA Y TRES");
		break;
	case (64):	
		System.out.println("SESENTA Y CUATRO");
		break;
	case (65):	
		System.out.println("SESENTA Y CINCO");
		break;
	case (66):	
		System.out.println("SESENTA Y SEIS");
		break;
	case (67):	
		System.out.println("SESENTA Y SIETE");
		break;
	case (68):	
		System.out.println("SESENTA Y OCHO");
		break;
	case (69):	
		System.out.println("SESENTA Y NUEVE");
		break;
	case (70):	
		System.out.println("SETENTA");
		break;
	case (71):	
		System.out.println("SETENTA Y UNO");
		break;
	case (72):	
		System.out.println("SETENTA Y DOS");
		break;
	case (73):	
		System.out.println("SETENTA Y TRES");
		break;
	case (74):	
		System.out.println("SETENTA Y CUATRO");
		break;
	case (75):	
		System.out.println("SETENTA Y CINCO");
		break;
	case (76):	
		System.out.println("SETENTA Y SEIS");
		break;
	case (77):	
		System.out.println("SETENTA Y SIETE");
		break;
	case (78):	
		System.out.println("SETENTA Y OCHO");
		break;
	case (79):	
		System.out.println("SETENTA Y NUEVE");
		break;
	case (80):	
		System.out.println("OCHENTA");
		break;
	case (81):	
		System.out.println("OCHENTA Y UNO");
		break;
	case (82):	
		System.out.println("OCHENTA Y DOS");
		break;
	case (83):	
		System.out.println("OCHENTA Y TRES");
		break;
	case (84):	
		System.out.println("OCHENTA Y CUATRO");
		break;
	case (85):	
		System.out.println("OCHENTA Y CINCO");
		break;
	case (86):	
		System.out.println("OCHENTA Y SEIS");
		break;
	case (87):	
		System.out.println("OCHENTA Y SIETE");
		break;
	case (88):	
		System.out.println("OCHENTA Y OCHO");
		break;
	case (89):	
		System.out.println("OCHENTA Y NUEVE");
		break;
	case (90):	
		System.out.println("NOVENTA");
		break;
	case (91):	
		System.out.println("NOVENTA Y UNO");
		break;
	case (92):	
		System.out.println("NOVENTA Y DOS");
		break;
	case (93):	
		System.out.println("NOVENTA Y TRES");
		break;
	case (94):	
		System.out.println("NOVENTA Y CUATRO");
		break;
	case (95):	
		System.out.println("NOVENTA Y CINCO");
		break;
	case (96):	
		System.out.println("NOVENTA Y SEIS");
		break;
	case (97):	
		System.out.println("NOVENTA Y SIETE");
		break;
	case (98):	
		System.out.println("NOVENTA Y OCHO");
		break;
	case (99):	
		System.out.println("NOVENTA Y NUEVE");
		break;
	case (100):	
		System.out.println("CIEN");
		break;
	}
	r.close();
	
	switch (suma1){
	case (0):	
		System.out.println("CERO");
		break;

	case (1):	
		System.out.println("UNO");
		break;
	case (2):	
		System.out.println("DOS");
		break;
	case (3):	
		System.out.println("TRES");
		break;
	case (4):	
		System.out.println("CUATRO");
		break;
	case (5):	
		System.out.println("CINCO");
		break;
	case (6):	
		System.out.println("SEIS");
		break;
	case (7):	
		System.out.println("SIETE");
		break;
	case (8):	
		System.out.println("OCHO");
		break;
	case (9):	
		System.out.println("NUEVE");
		break;
	case (10):	
		System.out.println("DIEZ");
		break;
	case (11):	
		System.out.println("ONCE");
		break;
	case (12):	
		System.out.println("DOCE");
		break;
	case (13):	
		System.out.println("TRECE");
		break;
	case (14):	
		System.out.println("CATORCE");
		break;
	case (15):	
		System.out.println("QUINCE");
		break;
	case (16):	
		System.out.println("DIESISEIS");
		break;
	case (17):	
		System.out.println("DIESISIETE");
		break;
	case (18):	
		System.out.println("DIESIOCHO");
		break;
	case (19):	
		System.out.println("DIESINUEVE");
		break;
	case (20):	
		System.out.println("VEINTE");
		break;
	case (21):	
		System.out.println("VEINTIUNO");
		break;
	case (22):	
		System.out.println("VEINTIDOS");
		break;
	case (23):	
		System.out.println("VEINTITRES");
		break;
	case (24):	
		System.out.println("VEINTICUATRO");
		break;
	case (25):	
		System.out.println("VEINTICINCO");
		break;
	case (26):	
		System.out.println("VEINTISEIS");
		break;
	case (27):	
		System.out.println("VEINTISIETE");
		break;
	case (28):	
		System.out.println("VEINTIOCHO");
		break;
	case (29):	
		System.out.println("VEINTINUEVE");
		break;
	case (30):	
		System.out.println("TREINTA");
		break;
	case (31):	
		System.out.println("TREINTA Y UNO");
		break;
	case (32):	
		System.out.println("TREINTA Y DOS");
		break;
	case (33):	
		System.out.println("TREINTA Y TRES");
		break;
	case (34):	
		System.out.println("TREINTA Y CUATRO");
		break;
	case (35):	
		System.out.println("TREINTA Y CINCO");
		break;
	case (36):	
		System.out.println("TREINTA Y SEIS");
		break;
	case (37):	
		System.out.println("TREINTA Y SIETE");
		break;
	case (38):	
		System.out.println("TREINTA Y OCHO");
		break;
	case (39):	
		System.out.println("TREINTA Y NUEVE");
		break;
	case (40):	
		System.out.println("CUARENTA");
		break;
	case (41):	
		System.out.println("CUARENTA Y UNO");
		break;
	case (42):	
		System.out.println("CUARENTA Y DOS");
		break;
	case (43):	
		System.out.println("CUARENTA Y TRES");
		break;
	case (44):	
		System.out.println("CUARENTA Y CUATRO");
		break;
	case (45):	
		System.out.println("CUARENTA Y CINCO");
		break;
	case (46):	
		System.out.println("CUARENTA Y SEIS");
		break;
	case (47):	
		System.out.println("CUARENTA Y SIETE");
		break;
	case (48):	
		System.out.println("CUARENTA Y OCHO");
		break;
	case (49):	
		System.out.println("CUARENTA Y NUEVE");
		break;
	case (50):	
		System.out.println("CINCUENTA");
		break;
	case (51):	
		System.out.println("CINCUENTA Y UNO");
		break;
	case (52):	
		System.out.println("CINCUENTA Y DOS");
		break;
	case (53):	
		System.out.println("CINCUENTA Y TRES");
		break;
	case (54):	
		System.out.println("CINCUENTA Y CUATRO");
		break;
	case (55):	
		System.out.println("CINCUENTA Y CINCO");
		break;
	case (56):	
		System.out.println("CINCUENTA Y SEIS");
		break;
	case (57):	
		System.out.println("CINCUENTA Y SIETE");
		break;
	case (58):	
		System.out.println("CINCUENTA Y OCHO");
		break;
	case (59):	
		System.out.println("CINCUENTA Y NUEVE");
		break;
	case (60):	
		System.out.println("SESENTA");
		break;
	case (61):	
		System.out.println("SESENTA Y UNO");
		break;
	case (62):	
		System.out.println("SESENTA Y DOS");
		break;
	case (63):	
		System.out.println("SESENTA Y TRES");
		break;
	case (64):	
		System.out.println("SESENTA Y CUATRO");
		break;
	case (65):	
		System.out.println("SESENTA Y CINCO");
		break;
	case (66):	
		System.out.println("SESENTA Y SEIS");
		break;
	case (67):	
		System.out.println("SESENTA Y SIETE");
		break;
	case (68):	
		System.out.println("SESENTA Y OCHO");
		break;
	case (69):	
		System.out.println("SESENTA Y NUEVE");
		break;
	case (70):	
		System.out.println("SETENTA");
		break;
	case (71):	
		System.out.println("SETENTA Y UNO");
		break;
	case (72):	
		System.out.println("SETENTA Y DOS");
		break;
	case (73):	
		System.out.println("SETENTA Y TRES");
		break;
	case (74):	
		System.out.println("SETENTA Y CUATRO");
		break;
	case (75):	
		System.out.println("SETENTA Y CINCO");
		break;
	case (76):	
		System.out.println("SETENTA Y SEIS");
		break;
	case (77):	
		System.out.println("SETENTA Y SIETE");
		break;
	case (78):	
		System.out.println("SETENTA Y OCHO");
		break;
	case (79):	
		System.out.println("SETENTA Y NUEVE");
		break;
	case (80):	
		System.out.println("OCHENTA");
		break;
	case (81):	
		System.out.println("OCHENTA Y UNO");
		break;
	case (82):	
		System.out.println("OCHENTA Y DOS");
		break;
	case (83):	
		System.out.println("OCHENTA Y TRES");
		break;
	case (84):	
		System.out.println("OCHENTA Y CUATRO");
		break;
	case (85):	
		System.out.println("OCHENTA Y CINCO");
		break;
	case (86):	
		System.out.println("OCHENTA Y SEIS");
		break;
	case (87):	
		System.out.println("OCHENTA Y SIETE");
		break;
	case (88):	
		System.out.println("OCHENTA Y OCHO");
		break;
	case (89):	
		System.out.println("OCHENTA Y NUEVE");
		break;
	case (90):	
		System.out.println("NOVENTA");
		break;
	case (91):	
		System.out.println("NOVENTA Y UNO");
		break;
	case (92):	
		System.out.println("NOVENTA Y DOS");
		break;
	case (93):	
		System.out.println("NOVENTA Y TRES");
		break;
	case (94):	
		System.out.println("NOVENTA Y CUATRO");
		break;
	case (95):	
		System.out.println("NOVENTA Y CINCO");
		break;
	case (96):	
		System.out.println("NOVENTA Y SEIS");
		break;
	case (97):	
		System.out.println("NOVENTA Y SIETE");
		break;
	case (98):	
		System.out.println("NOVENTA Y OCHO");
		break;
	case (99):	
		System.out.println("NOVENTA Y NUEVE");
		break;
	case (100):	
		System.out.println("CIEN");
		break;
	}
	r.close();
}
	
}
	        			        
	   
