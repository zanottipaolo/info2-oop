import javax.management.RuntimeErrorException;

public class Coda<E> {
	class NodoCoda{
		E dato;
		NodoCoda nextNodo;
	}
	
	NodoCoda primo, ultimo;
	
	public Coda() {
		primo = ultimo = null;
	}
	
	public void aggiungi(E e) {
		NodoCoda nuovoNodo = new NodoCoda();
		nuovoNodo.dato = e;
		nuovoNodo.nextNodo = null;
		
		if(ultimo != null)
			ultimo.nextNodo = nuovoNodo;
		else	// Coda vuota
			primo = nuovoNodo;
		
		ultimo = nuovoNodo;
	}
	
	public E preleva() {
		if(primo == null)
			throw new RuntimeException("Coda vuota");
		
		E result = primo.dato;
		primo = primo.nextNodo;
		
		if(primo == null)	// Se rimane vuota dopo le operazioni precedenti
			ultimo = null;
		return result;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(NodoCoda i = primo; i != null; i = i.nextNodo) {
			result += i.dato.toString() + ";";
		}
		return result += "]";
	}
	
	public static void main(String[] args) {
		Coda<String> elements = new Coda<String>();
		elements.aggiungi("Libro");
		System.out.println(elements);
		elements.aggiungi("Tavolo");
		System.out.println(elements);
		elements.aggiungi("PC");
		System.out.println(elements);
		System.out.println("*******");
		System.out.println(elements.preleva());
		System.out.println(elements.preleva());
		System.out.println(elements.preleva());
	}
}
