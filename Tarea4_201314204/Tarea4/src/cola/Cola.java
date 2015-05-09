package cola;
import java.util.*;
public class Cola {
	
// Cola con metodo de pila
	Stack<String> pila = new Stack<String>();{ // pila principal
			
				  pila.push("1");
				  pila.push("2");
				  pila.push("3");
				  pila.push("4");
				  pila.push("5");
				  pila.push("6");
		}
			
	Stack<Stack<String>> pila1 = new Stack<Stack<String>>();{ // pila auxiliar
				pila1.push(pila);
			}
	}
class MetodoPila {

	public static void main(String[] args) {
	
		Cola pila1 = new Cola();
		System.out.println("Cola"+" "+pila1.pila1.peek());
	}
}
