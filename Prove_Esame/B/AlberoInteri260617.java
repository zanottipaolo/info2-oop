class AlberoInteri{
	class NodoAlbero260617{
		int dato;
		AlberoInteri sx, dx;
	}
	
	NodoAlbero260617 radice;
	
	public AlberoInteri() {
		radice = null;
	}
	
	public void inserimento(int dato) {
		if(radice == null) {
			radice = new NodoAlbero260617();
			radice.dato = dato;
			radice.sx = new AlberoInteri();
			radice.dx = new AlberoInteri();
		}
		else {
			if(dato < radice.dato)
				radice.sx.inserimento(dato);
			else
				radice.dx.inserimento(dato);
		}
	}
	
	public boolean find(int dato) {
		if(radice == null)
			return false;
		
		if(radice.dato == dato)
			return true;
		else {
			if(dato <= radice.dato)
				return radice.sx.find(dato);
			else
				return radice.dx.find(dato);
		}
	}
	
	public void print() {
		if(radice == null)
			return;
		
		radice.sx.print();
		System.out.println(radice.dato);
		radice.dx.print();
	}
	
	public int numero_nodi() {		
		if(radice == null)
			return 0;
		
		return 1 + radice.sx.numero_nodi() + radice.dx.numero_nodi();
	}
	
	public int numero_foglie() {
		if(radice.sx.radice == null && radice.dx.radice == null)
			return 1;
		
		int foglie = 0;
		
		if(radice.sx.radice != null)
			foglie += radice.sx.numero_foglie();
		if(radice.dx.radice != null)
			foglie += radice.dx.numero_foglie();
		
		return foglie;
	}
}

public class AlberoInteri260617 {
	public static void main(String[] args) {
		AlberoInteri albero = new AlberoInteri();
		
		albero.inserimento(5);
		albero.inserimento(3);
		albero.inserimento(6);
		albero.inserimento(2);
		albero.inserimento(1);
		
		albero.print();
		
		System.out.println();
		
		System.out.println(albero.find(3));
		System.out.println(albero.find(0));
		
		System.out.println();
		
		System.out.println(albero.numero_nodi());
		System.out.println(albero.numero_foglie());
	}
}
