
public class AlberoBinario <E extends Comparable<E>>{
	class NodoAlbero{
		E dato;
		AlberoBinario sx, dx;
	}
	
	NodoAlbero radice;
	
	public AlberoBinario() {
		radice = null;
	}
	
	void inserisci(E e) {
		if(radice == null) {
			radice = new NodoAlbero();
			radice.dato = e;
			radice.sx = new AlberoBinario<E>();
			radice.dx = new AlberoBinario<E>();
		}
		else {
			if(radice.dato.compareTo(e) > 0)
				radice.sx.inserisci(e);
			else
				radice.dx.inserisci(e);
		}
		
	}
	
	void stampaInOrdine() {
		if(radice == null)
			return;
		radice.sx.stampaInOrdine();
		System.out.print(radice.dato + " ");
		radice.dx.stampaInOrdine();
	}
	
	boolean trova(E e) {
		if(radice == null)
			return false;
		if(radice.dato.compareTo(e) == 0)
			return true;
		else if(radice.dato.compareTo(e) > 0)
			return radice.sx.trova(e);
		else
			return radice.dx.trova(e);
	}
	
	int contaFoglie() {
		if(radice.sx.radice == null && radice.dx.radice == null)
			return 1;
		int numeroFoglie = 0;
		
		if(radice.sx.radice != null)
			numeroFoglie += radice.sx.contaFoglie();
		if (radice.dx.radice != null)
			numeroFoglie += radice.dx.contaFoglie();
		
		return numeroFoglie;
	}
	
	/*
	 countPiero  -->  altro esercizio
	 
	 int countPiero(){
	 	if(radice == null)
	 		return 0;
	 	int count = 0;
	 	if(radice.p.compareTo("Piero") == 0)
	 		count++;
	 	if(radice.p.compareTo("Piero") >= 0)
	 		count += radice.sx.countPiero();
	 	if(radice.p.compareTo("Piero") <= 0)
	 		count += radice.dx.countPiero();
	 	
	 	return count;
	 
	 */
	
	public static void main(String[] args) {
		AlberoBinario<Integer> albero = new AlberoBinario<Integer>();
		
		albero.inserisci(5);
		albero.inserisci(10);
		albero.inserisci(2);
		albero.inserisci(21);
		albero.inserisci(8);
		
		albero.stampaInOrdine();
		System.out.println();
		System.out.print(albero.contaFoglie());
	}
}
