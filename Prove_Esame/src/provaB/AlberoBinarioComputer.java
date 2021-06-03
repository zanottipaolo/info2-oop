package provaB;
class Computer implements Comparable<Computer>{
	private int costo;
	
	public Computer(int costo) {
		this.costo = costo;
	}
	
	public int compareTo(Computer c) {
		return c.costo - this.costo;
	}
	
	public String toString() {
		return Integer.toString(costo);
	}
}

class AlberoComputer{
	class Nodo{
		Computer dato;
		AlberoComputer sx, dx; 
	}
	
	Nodo radice;
	
	public AlberoComputer() {
		radice = null;
	}
	
	public void insert(Computer c) {
		if(radice == null) {
			radice = new Nodo();
			radice.sx = new AlberoComputer();
			radice.dx = new AlberoComputer();
			radice.dato = c;
		}
		else {
			if(radice.dato.compareTo(c) < 0)
				radice.sx.insert(c);
			else
				radice.dx.insert(c);
		}
	}
	
	public void print() {
		if(radice == null)
			return;
		
		radice.sx.print();
		System.out.println(radice.dato); // implicito toString
		
		radice.dx.print();
	}
	
	public Computer getMax() {
		if(radice.dx.radice == null)
			return radice.dato;
		else
			return radice.dx.getMax();
	}
}

public class AlberoBinarioComputer {
	public static void main(String[] args) {
		AlberoComputer albero = new AlberoComputer();
		
		albero.insert(new Computer(5));
		albero.insert(new Computer(100));
		albero.insert(new Computer(4));
		albero.insert(new Computer(7));
		
		albero.print();
		
		System.out.println(albero.getMax());
	}
}
