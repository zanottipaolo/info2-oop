class Studente implements Comparable<Studente>{
	private String matricola;
	
	public Studente(String matricola) {
		this.matricola = matricola;
	}
	
	public int compareTo(Studente confronto) {
		return this.matricola.compareTo(confronto.matricola);
	}
	
	@Override
	public String toString() {
		return matricola;
	}
}

class AlberoStudenti{
	class Nodo{
		Studente dato;
		AlberoStudenti sx, dx;
	}
	
	Nodo radice;
	
	public AlberoStudenti(){
		radice = null;
	}
	
	public void insert(Studente daInserire) {
		if(radice == null) {
			radice = new Nodo();
			radice.sx = new AlberoStudenti();	// Sotto-albero SX
			radice.dx = new AlberoStudenti();	// Sotto-albero DX
			radice.dato = daInserire;			// Assegno
		}
		else {
			if(radice.dato.compareTo(daInserire) > 0) {
				radice.sx.insert(daInserire);
			}
			else
				radice.dx.insert(daInserire);
		}
	}
	
	public boolean find(String cercaMatricola) {
		int confronto = radice.dato.toString().compareTo(cercaMatricola);
		
		if(radice == null)
			return false;
		if(confronto == 0)
			return true;
		else if(confronto > 0)
			return radice.sx.find(cercaMatricola);
		else
			return radice.dx.find(cercaMatricola);
	}
	
	public void print() {
		if (radice == null)
			return;
		else {
			radice.sx.print();
			System.out.println(radice.dato);
			radice.dx.print();
		}
	}
}

public class AlberoBinarioStudente {
	public static void main(String[] args) {
		AlberoStudenti albero = new AlberoStudenti();
		albero.insert(new Studente("vygbuh"));
		albero.insert(new Studente("gbh"));
		albero.insert(new Studente("h jbkn57"));
		
		albero.print();
		
		System.out.println(albero.find("gbh"));
	}
}
