class Persona18062020 implements Comparable<Persona18062020>{
	String nome;
	
	public Persona18062020(String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	@Override
	public int compareTo(Persona18062020 o) {
		return this.nome.compareTo(o.nome);
	}
}

class AlberoPersone{
	class NodoAlbero{
		Persona18062020 dato;
		AlberoPersone sx, dx;
	}
	
	NodoAlbero radice;
	
	public AlberoPersone() {
		radice = null;
	}
	
	public void insert(Persona18062020 persona) {
		if(radice == null){
			radice = new NodoAlbero();
			radice.dato = persona;
			radice.sx = new AlberoPersone();
			radice.dx = new AlberoPersone();
		}
		else {
			if(radice.dato.compareTo(persona) > 0)
				radice.sx.insert(persona);
			else
				radice.dx.insert(persona);
		}
	}
	
	public void print() {
		if(radice == null)
			return;
		
		radice.sx.print();
		System.out.println(radice.dato);
		radice.dx.print();
	}
	
	public int countPiero() {
		if(radice == null)
			return 0;
		
		int conteggio = 0;
		
		if(radice.dato.nome.compareTo("Piero") == 0)
			conteggio++;
		if(radice.dato.nome.compareTo("Piero") >= 0)
			conteggio += radice.sx.countPiero();
		if(radice.dato.nome.compareTo("Piero") <= 0)
			conteggio += radice.dx.countPiero();
		
		return conteggio;
	}
}

public class AlberoBinarioPersona {
	public static void main(String[] args) {
		AlberoPersone albero = new AlberoPersone();
		
		albero.insert(new Persona18062020("Matteo"));
		albero.insert(new Persona18062020("Piero"));
		albero.insert(new Persona18062020("Cristian"));
		albero.insert(new Persona18062020("Simone"));
		albero.insert(new Persona18062020("Piero"));
		
		albero.print();
		
		System.out.println();
		
		System.out.println("Numero di Piero: " + albero.countPiero());
	}
}
