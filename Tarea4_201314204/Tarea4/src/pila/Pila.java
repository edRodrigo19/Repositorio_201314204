package pila;
import java.util.LinkedList;
import java.util.Queue;

// pila con metodo de cola
public class Pila {	
		
	Queue<Integer> cola = new LinkedList<Integer>();{//cola principal
		
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		cola.offer(5);
		cola.offer(6);
		cola.offer(7);
		
	}	
		Queue<Integer> cola1 = new LinkedList<Integer>();{ //cola auxiliar
			for(int x=1; x<=6; x++)
			{
				cola.poll();
				cola1.addAll(cola);
			}	
		}		
}

class MetodoCola {

	public static void main(String[] args) {
		
		Pila cola1 = new Pila();
		System.out.println("Dato"+" "+cola1.cola.peek());
		
		}
	}



