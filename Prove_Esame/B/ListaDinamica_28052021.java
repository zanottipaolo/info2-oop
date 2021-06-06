class Lista <T extends Comparable<? super T>> {
	class Nodo{
		T dato;
		Nodo nextNodo;
	}
	
	Nodo head;
	int count;
	
	public Lista(){
		head = null;
		count = 0;
	}
	
	public void inserisci(T daInserire) {
		Nodo p = head;
		Nodo q = null;
		
		while(p != null && daInserire.compareTo(p.dato) > 0) {
			q = p;
			p = p.nextNodo;
		}
		
		Nodo nuovoNodo = new Nodo();
		nuovoNodo.dato = daInserire;
		nuovoNodo.nextNodo = p;
		
		if(q == null) {
			head = nuovoNodo;
		}
		else
			q.nextNodo = nuovoNodo;
		
		count++;
	}
	
	public void cancella(T daCancellare) {
		Nodo p = head;
		Nodo q = null;
		
		while(p != null && daCancellare.compareTo(p.dato) < 0) {
			q = p;
			p = p.nextNodo;
		}
		
		if(p.dato.compareTo(daCancellare) == 0) {
			if(q == null)
				head = p.nextNodo;
			else
				q.nextNodo = p.nextNodo;
		}
	}
	
	public int countLessThan(T daContare) {
		Nodo p = head;
		int count = 0;
		
		while(p != null) {
			if(p.dato.compareTo(daContare) < 0)
				count++;
			p = p.nextNodo;
		}
		return count;
	}
	
	public void print() {
		Nodo p = head;
		while(p != null) {
			System.out.print("[" + p.dato +  "] ");
			p = p.nextNodo;
		}
	}
}

public class ListaDinamica_28052021 {
	public static void main(String[] args) {
		Lista<String> list = new Lista<String>();
		list.inserisci("Ciao");
		list.inserisci("Cristian Livella");
		list.inserisci("Andrea");
		list.inserisci("tygubhnijmok");
		
		list.print();
		
		list.cancella("Andrea");
		
		System.out.println();
		
		list.print();
		
		System.out.println(list.countLessThan("Matteo"));
	}
}
