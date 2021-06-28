class Studente2606175 implements Comparable<Studente2606175>{
	String nome;
	
	public Studente2606175(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Studente2606175 o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}

public class RicercaBinariaStudenti {
	public static Studente2606175 find(String nome, Studente2606175[] studenti) {		
		int sx = 0, dx = studenti.length-1;
		
		do {
			int media = (sx + dx) / 2;
			
			if(nome.compareTo(studenti[media].nome) == 0)
				return studenti[media]; 
			else if(nome.compareTo(studenti[media].nome) > 0)
				sx = media + 1;
			else
				dx = media - 1;
		}while(sx <= dx);
		
		return null;
	}
	
	public static void main(String[] args) {
		Studente2606175[] studenti = new Studente2606175[] {new Studente2606175("Cristian"), new Studente2606175("Matteo"),
				new Studente2606175("Simone")};
		
		System.out.println(find("Simone", studenti));
	}
}
