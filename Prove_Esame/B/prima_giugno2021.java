class Item implements Comparable<Item>{
	int costo;
	
	public Item(int costo) {
		this.costo = costo;
	}
	
	@Override
	public int compareTo(Item o) {
		return this.costo - o.costo;
	}
	
	@Override
	public String toString() {
		return costo + "€";
	}
}

class AlberoItem{
	class NodoAlbero{
		Item dato;
		AlberoItem sx, dx;
	}
	
	NodoAlbero radice;
	
	public AlberoItem() {
		radice = null;
	}
	
	public void insert(Item i) {
		if(radice == null) {
			radice = new NodoAlbero();
			radice.dato = i;
			radice.sx = new AlberoItem();
			radice.dx = new AlberoItem();
		}
		else if(radice.dato.compareTo(i) > 0)
			radice.sx.insert(i);
		else
			radice.dx.insert(i);
	}
	
	public void print() {
		if(radice == null)
			return;
		else {
			radice.sx.print();
			System.out.println(radice.dato);
			radice.dx.print();
		}
	}
	
	public int countGreatherthan(int X) {
		if(radice == null)
			return 0;
		
		int count = 0;
		
		if(radice.dato.costo > X)
			count = 1 + radice.sx.countGreatherthan(X) + radice.dx.countGreatherthan(X);
		else
			count = radice.sx.countGreatherthan(X) + radice.dx.countGreatherthan(X);
		
		// Oppure
		// count = radice.sx.countGreatherthan(X) + radice.dx.countGreatherthan(X) + (radice.dato.costo > X ? 1 : 0);
		
		return count;
	}
}

public class prima_giugno2021 {
	public static void main(String[] args) {
		int[] costi = {10, 0, 100, 5, 9, 10, 200, 50};
		AlberoItem albero = new AlberoItem();
		
		Item i1 = new Item(costi[0]);
		albero.insert(i1);
		Item i2 = new Item(costi[1]);
		albero.insert(i2);
		Item i3 = new Item(costi[2]);
		albero.insert(i3);
		Item i4 = new Item(costi[3]);
		albero.insert(i4);
		Item i5 = new Item(costi[4]);
		albero.insert(i5);
		Item i6 = new Item(costi[5]);
		albero.insert(i6);
		Item i7 = new Item(costi[6]);
		albero.insert(i7);
		Item i8 = new Item(costi[7]);
		albero.insert(i8);
		
		albero.print();
		
		System.out.println();
		
		System.out.println(albero.countGreatherthan(0));
		System.out.println(albero.countGreatherthan(30));
		System.out.println(albero.countGreatherthan(300));
	}

}
