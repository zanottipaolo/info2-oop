class Persona implements Comparable<Persona>{
	private String nome;

	public Persona(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(Persona p) {
		return p.nome.compareTo(this.nome);
	}
	
	public String toString() {
		return this.nome;
	}
	
	public char iniziale() {
		return this.nome.charAt(0);
	}
}

class ListaPersone{
	class Nodo{
		Persona dato;
		Nodo nextNodo;
	}
	
	private Nodo head;
	
	public ListaPersone() {
		head = null;
	}
	
	public void insert(Persona c) {
		Nodo p = head, q = null;
		
		while(p != null && p.dato.compareTo(c) > 0) {
			q = p;
			p = p.nextNodo;
		}
		
		Nodo nuovoNodo = new Nodo();
		nuovoNodo.dato = c;
		nuovoNodo.nextNodo = p;
		
		if(q == null)
			head = nuovoNodo;
		else
			q.nextNodo = nuovoNodo;
	}
	
	public void print() {
		Nodo p = head;
		
		while(p != null) {
			System.out.println(p.dato);	// toString() è implicito
			p = p.nextNodo;
		}
	}
	
	public int countNomeIniziaconA() {
		int totale = 0;
		Nodo p = head;
		
		while(p != null) {
			if(p.dato.iniziale() == 'A') {
				totale++;
			}
			p = p.nextNodo;
					
		}
		return totale;
	}
}

public class ListaOrdinataPersone {
	public static void main(String[] args) {
		ListaPersone lista = new ListaPersone();
		
		lista.insert(new Persona("Paolo"));
		lista.insert(new Persona("Matteo"));
		lista.insert(new Persona("Alberto"));
		
		lista.print();
		
		System.out.println(lista.countNomeIniziaconA());
	}
}
