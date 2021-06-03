class ListaPari100{
	class Nodo{
		int dato;
		Nodo nextNodo;
	}
	
	private Nodo nodo_primo, nodo_ultimo;
	
	
	public ListaPari100() {
		nodo_primo = null; 
		nodo_ultimo = null;
	}
	
	public void insert(int numero) {
		Nodo nuovoNodo = new Nodo();
		nuovoNodo.dato = numero;
		nuovoNodo.nextNodo = null;
		
		if(nodo_ultimo == null)
			nodo_primo = nuovoNodo;
		else {
			nodo_ultimo.nextNodo = nuovoNodo;
		}
		
		nodo_ultimo = nuovoNodo;
	}
	
	public int somma() {
		int totale = 0;
		Nodo p = nodo_primo;
		while(p != null) {
			totale += p.dato;
			p = p.nextNodo;
		}
		return totale;
	}
	
	public void print() {
		Nodo p = nodo_primo;
		
		while(p != null) {
			System.out.println(p.dato);
			p = p.nextNodo;
		}
	}
}

public class ListaNumeriPari {
	public static void main(String[] args) {
		ListaPari100 lista = new ListaPari100();
		
		for(int i=2; i<=100; i+=2) {
			lista.insert(i);
		}
		
		lista.print();
		
		System.out.println(lista.somma());
	}
}
