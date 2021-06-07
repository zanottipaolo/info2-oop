import java.util.EmptyStackException;

public class Stack_Dyn <E> {
	class NodoStack{
		E dato;
		NodoStack nextNodo;
	}
	
	NodoStack cima;
	
	public Stack_Dyn() {
		cima = null;
	}
	
	public void push(E e) {
		NodoStack nuovoElemento = new NodoStack();
		nuovoElemento.dato = e;
		
		nuovoElemento.nextNodo = cima;
		cima = nuovoElemento;
	}
	
	public E pop() {
		if(cima == null)
			throw new EmptyStackException();
		
		E primoElemento = cima.dato;
		cima = cima.nextNodo;
		
		return primoElemento;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(NodoStack i = cima; i!=null; i=i.nextNodo) {
			result += i.dato.toString() + ",";
		}
		return result + "]";	
	}
	
	public static void main(String[] args) {
		Stack_Dyn<String> pila = new Stack_Dyn<String>();
		pila.push("Libro");
		System.out.println(pila);
		pila.push("Tavolo");
		System.out.println(pila);
		pila.push("PC");
		System.out.println(pila);
		System.out.println("*******");
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
	}
}
