package menu;
import static java.lang.Math.sqrt;

import java.util.Random;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int opcion=0;
				
		System.out.println("1. Nivel 1");
		System.out.println("2. Nivel 2");
	
	Scanner s =new Scanner(System.in);
	opcion = s.nextInt();
	
	
		switch(opcion)
		{
		case 1:
				opcion=0;
				System.out.println("1. Problema 1");
				System.out.println("2. Problema 2");
				System.out.println("3. Problema 3");
				System.out.println("4. Problema 4");
				System.out.println("5. Problema 5");
				opcion = s.nextInt();
				
				switch(opcion)
				{
				case 1:{	//Problema 1

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
						break;
				}// Fin del Problema 1	
				
				case 2:{// Inicio del Problema 2
					int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,prom=0;
					System.out.println("Ingrese 6 Notas");
						
					System.out.println("Ingrese la primera nota");
						num1=s.nextInt();  
					System.out.println("Ingrese la segunda nota");
						num2=s.nextInt();
					System.out.println("Ingrese la tercera nota");
						num3=s.nextInt();
					System.out.println("Ingrese la cuarta nota");
						num4=s.nextInt(); 
					System.out.println("Ingrese la quinta nota");
						num5=s.nextInt();
					System.out.println("Ingrese la sexta nota");
						num6=s.nextInt();
						prom=(num1+num2+num3+num4+num5+num6)/6;// calculo del promedio
						System.out.println("La Nota Promedio es "+prom);
							if(prom>=0 && prom<=59)
								System.out.println("Puntuaci�n E");
							else if(prom>=60 && prom<=69)
								System.out.println("Puntuaci�n D");
							else if(prom>=70 && prom<=79)
								System.out.println("Puntuaci�n C");
							else if(prom>=80 && prom<=89)
								System.out.println("Puntuaci�n B");
							else if(prom>=90 && prom<=100)
								System.out.println("Puntuaci�n A");
				}
				break;// Fin del Problema 2
				
				case 3:{// Inicio del Problema 3
					
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
				}
				
				break;//Fin del Problema 3
				
				case 4:{//Incio del Problema 4
					// TODO Auto-generated method stub
					String figura;
					double x=0;	
					System.out.println("Ingrese parametros a valuar");
					Scanner p = new Scanner(System.in);
						figura=p.next();
				
						x=Integer.parseInt(figura.substring(figura.indexOf(",")+1 ));
						
					if (figura.contains("u,")){
						System.out.println("Cuadrado");
						System.out.println("El �rea es "+(x*x));
						System.out.println("El perimetro es "+ (4*x));
					}	
					else if (figura.contains("t,")){
						System.out.println("Triangulo");
						System.out.println("El �rea es "+((Math.sqrt(3))/4*Math.pow(x, 2)));
						System.out.println("El perimetro es "+ (3*x));
						System.out.println("La altura es "+ ((Math.sqrt(3))/2)*x);
					}	
					else if(figura.contains("c,")){
						System.out.println("Circulo");
						System.out.println("El �rea es "+((Math.PI)*Math.pow(x, 2)));
						System.out.println("El perimetro es "+ (2*(Math.PI)*x));
						System.out.println("El Radio es "+ (x/2));
					}
					else{
						System.out.println("parametros invalidos");
						
					}
				}	
			
				break;// fin del problema 4
				
				case 5:{//inicio del problema 5
					// TODO Auto-generated method stub
					String fecha1, fecha2;
					int dia1=0, mes1=0, a�o1=0;
					int dia2=0, mes2=0, a�o2=0;
					
					System.out.println("Ingrese 2 fechas");
					fecha1=s.next();
					fecha2=s.next();
					
					dia1=Integer.parseInt(fecha1.substring(0,2));
					mes1=Integer.parseInt(fecha1.substring(3,5));
					a�o1=Integer.parseInt(fecha1.substring(6,10));
					
					dia2=Integer.parseInt(fecha2.substring(0,2));
					mes2=Integer.parseInt(fecha2.substring(3,5));
					a�o2=Integer.parseInt(fecha2.substring(6,10));
					
					if(fecha1.length()>10){
						System.out.println("Formato Invalido");
					}
						else if(dia1>30 || dia2>30){
						
					}
						else if (mes1>12 || mes2>12){		
						}
					if(fecha1.length()==10 && dia1>30 || dia2>30){
						System.out.println("Dia invalo");
					}
						else if(fecha1.length()==10 && mes1>12 || mes2>12){
							System.out.println("Mes Invalido");
						}
						else if(fecha1.length()==10){
						System.out.println("Los dias entre estas fechas son");
						System.out.println(Math.abs((360*a�o1-30*mes1-dia1)-(360*a�o2-30*mes2-dia2)));						
						}	
					}
				}
				break;// fin del problema 5
		
		case 2:
				opcion=0;
				System.out.println("6. Problema 6");
				System.out.println("7. Problema 7");
				System.out.println("8. Problema 8");
				System.out.println("9. Problema 9");
				System.out.println("10. Problema 10");
				System.out.println("11. Problema 11");
				System.out.println("12. Problema 12");
				System.out.println("13. Problema 13");
				System.out.println("14. Problema 14");
				System.out.println("15. Problema 15");
				opcion = s.nextInt();
				switch(opcion)
				{
				case 6:{// inicio del problema 6
					double num1=0, num2=0;
					String operador;
					operador = s.next();
					
					if(operador.contains("s")){
						num1=Double.parseDouble(operador.substring(0, operador.indexOf("s")));
						num2=Double.parseDouble(operador.substring(operador.indexOf("s")+1 ));
						System.out.println(num1+num2);
					}
						else if(operador.contains("r")){
							num1=Double.parseDouble(operador.substring(0, operador.indexOf("r")));
							num2=Double.parseDouble(operador.substring(operador.indexOf("r")+1 ));
						System.out.println(num1-num2);
						}
						else if(operador.contains("m")){
							num1=Double.parseDouble(operador.substring(0, operador.indexOf("m")));
							num2=Double.parseDouble(operador.substring(operador.indexOf("m")+1 ));
						System.out.println(num1*num2);
						}
						else if(operador.contains("d")){
							num1=Double.parseDouble(operador.substring(0, operador.indexOf("d")));
							num2=Double.parseDouble(operador.substring(operador.indexOf("d")+1 ));
						System.out.println(num1/num2);
						}
						else
						System.out.println("Sintax error");
				}
				break;// fin del problema 6
				
				case 7:{// inicio del problema 7
					int numero=0;
					Scanner n= new Scanner(System.in);
					System.out.println("Ingrese 1 n�mero entre 0 y 10");
					numero=n.nextInt();
				if(numero==1)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==2)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==3)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==4)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==5)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==6)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==7)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==8)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==9)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
					else if(numero==10)
						for(int i=1; i<11; i++)
							System.out.println(numero+"x"+i+"="+(numero*i));
				else
					System.out.println("El n�mero no esta entre 0 y 10");
				
					}
				break;// fin del problema 7
				
				case 8:{// inicio del problema 8
					int liminf=0, limsup=0, azar=0;
					Scanner n=new Scanner(System.in);
					System.out.println("Ingrese el n�mero del limite inferior");
					liminf=n.nextInt();
					System.out.println("Ingrese el n�mero del limite superior");
					limsup=n.nextInt();
					
					Random r = new Random();
					azar=r.nextInt((limsup+liminf+1)-liminf);
						System.out.println(azar);
						
						switch (azar){
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
				}
				break;// fin del problema 8
				
				case 9:{// inicio del problema 9
					int num=0;
					System.out.println("Ingrese un n�mero entre 0 y 3999");
					 do {
						 Scanner n=new Scanner(System.in);
							num=n.nextInt();
			      } while (num < 1 || num > 3999);
			      System.out.print("->" + " "+ convertirANumerosRomanos(num));
			      
			}
				
				break;// fin del problema 9
				
				case 10:{// inicio del problema 10
					int f=0;
					System.out.println("Ingrese un n�mero");
					f=s.nextInt();
					int c=f;
					for(int contar=1; contar<=c; contar++){ 
						
						for(int espacios=0; espacios<=contar; espacios++){
							System.out.print("  ");
						}
				
						for(int aste=contar; aste<=c; aste++){
							System.out.print("   "+(f-c+1));
						}
						f++;
						System.out.println();
					}
				}
		
				break;// fin del problema 10
				
				case 11:{
					Scanner r = new Scanner(System.in);

			        System.out.println("Ingrese 6 n�meros Romanos entre 0 y 100: ");
			        String romano1, romano2, romano3, romano4, romano5;
			        
			        romano1= r.next();
			      
			        char Rom[]= {' ','I','V','X','L','C'}; 
			        int valor[] = {0,1,5,10,50,100};
			        int ant=0, suma1=0, suma2=0, suma3=0, suma4=0, suma5=0;
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
			   }
			
				break;
				
				case 12:{// inicio del problema 12
					String texto;
					Scanner t = new Scanner(System.in);
					System.out.println("Ingrese un texto");
					texto = t.nextLine();
					
							for(int i=0; i<texto.length();i++)
								System.out.print("*");
				}
				break;// fin del problema 12
				
				case 13:{// inicio del problema 13
					int respuesta=0, comparar=0;
					Scanner sc=new Scanner(System.in);
					String letra1, letra2;
					System.out.println("ingrese cualquier letra del abecedario");
					letra1=sc.next();
					System.out.println("Intente adivinar la letra");
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
						 			System.out.println("HAZ ADIVINADO LA LETRA");		
						 			respuesta=2;		
						 		}
						}
				}
				break;// fin del problema 13
				
				case 14:{// inicio del problema 14
					int lado=0;
					System.out.println("Ingrese el numero de asteriscos que desea");
				Scanner n=new Scanner(System.in);
				lado=n.nextInt();
					
						for(int b=1; b<=lado; b++){
							
							for(int h=1; h<=lado; h++){
								if (h==1 || h==lado|| b==1|| b==lado){
								System.out.print(" *");
							}	
							else {
								System.out.print("  ");
								}
					}
							System.out.println();
						
						}
				}
				break;// fin del problema 14
				
				case 15:{// inicio del problema 15
					int primo=0, i=0, j=0, div=0,raiz=0, contador=0;
					Scanner n=new Scanner(System.in);
					System.out.println("Ingrese un n�mero");
					primo=n.nextInt();
					
					for (i=2;i<=primo;i++) { 
						div=0; 
						raiz=(int)sqrt(i);
						for (j=1;j<=raiz;j++) { 
							if (i%j==0)
								div++;
							}
						if (div<=1) 
							contador++;	
					}
							System.out.println ("Hay " + (contador)+ " n�meros primos entre 1 y " + primo );
				}
				break;// fin del problema 15
				}
			}
	}
public static String convertirANumerosRomanos(int numero) {// parte del problema 9
	int uni=0, dec=0, cen=0, mil=0;
	String rom = "";
	mil = numero / 1000;
    cen = numero / 100 % 10;
    dec = numero / 10 % 10;
    uni = numero % 10;
      for (int i = 1; i <= mil; i++) {
             rom = rom + "M";
      }		    
      if (cen == 9) { 
          rom = rom + "CM";
      } else if (cen >= 5) {
                     rom = rom + "D";
                     for (int i = 6; i <= cen; i++) {
                            rom = rom + "C";
                     }
      } else if (cen == 4) {
                      rom = rom + "CD";
      } else {
                  for (int i = 1; i <= cen; i++) {
                         rom = rom + "C";
                  }
      }		   
      if (dec == 9) { 
           rom = rom + "XC";
      } else if (dec >= 5) {
                      rom = rom + "L";
                      for (int i = 6; i <= dec; i++) {
                            rom = rom + "X";
                      }
      } else if (dec == 4) {
                      rom = rom + "XL";
      } else {
                    for (int i = 1; i <= dec; i++) {
                           rom = rom + "X";
                    }
      }
      if (uni == 9) { 
           rom = rom + "IX";
      } else if (uni >= 5) {
                      rom = rom + "V";
                      for (int i = 6; i <= uni; i++) {
                             rom = rom + "I";
                      }
      } else if (uni == 4) {
                      rom = rom + "IV";
      } else {
                  for (int i = 1; i <= uni; i++) {
                         rom = rom + "I";
                  }
      }
      return rom;
}
}