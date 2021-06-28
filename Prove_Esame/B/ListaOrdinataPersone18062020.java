class Persona18062020_due implements Comparable<Persona18062020_due>{
	private String nome;
	
	public Persona18062020_due(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	@Override
	public int compareTo(Persona18062020_due o) {
		return this.nome.compareTo(o.nome);
	}
}

class ListaPersone18062020{
	class NodoLista18062020{
		Persona18062020_due dato;
		NodoLista18062020 next;
	}
	
	NodoLista18062020 head;
	
	public ListaPersone18062020() {
		head = null;
	}
	
	public void insert(Persona18062020_due o) {
		NodoLista18062020 p = head, q = null;
		
		while(p != null && p.dato.compareTo(o) > 0) {
			q = p;
			p = p.next;
		}
		
		NodoLista18062020 nuovoNodo = new NodoLista18062020();
		nuovoNodo.dato = o;
		nuovoNodo.next = p;
		
		if(q == null) {
			head = nuovoNodo;
		}
		else
			q.next = nuovoNodo;
	}
	
	public void print() {
		for(NodoLista18062020 p = head; p!=null; p=p.next) {
			System.out.println(p.dato);
		}
	}
	
	public int countPiero() {
		int count = 0;
		for(NodoLista18062020 p = head; p!=null; p=p.next) {
			if(p.dato.toString() == "Piero")
				count++;
		}
		
		return count;
	}
}

public class ListaOrdinataPersone18062020 {
	public static void main(String[] args) {
		ListaPersone18062020 lista = new ListaPersone18062020();
		
		lista.insert(new Persona18062020_due("Matteo"));
		lista.insert(new Persona18062020_due("Piero"));
		lista.insert(new Persona18062020_due("Simone"));
		lista.insert(new Persona18062020_due("Cristian"));
		lista.insert(new Persona18062020_due("Piero"));
		
		lista.print();
		
		System.out.println();
		
		System.out.println(lista.countPiero());	
	}
}
