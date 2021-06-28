import java.util.Arrays;

class Studente2606173 implements Comparable<Studente2606173>{
	String nome;
	
	public Studente2606173(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Studente2606173 o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}

public class FindMaxStudenti {
	static Studente2606173 findMax(Studente2606173[] studenti) {
		Studente2606173 massimo = null;
		
		for(int i = 0; i < studenti.length-1; i++) {
			if(studenti[i].compareTo(studenti[i+1]) > 0)
				massimo = studenti[i];
		}
		
		return massimo;
	}
	
	public static void main(String[] args) {
		Studente2606173[] studenti = new Studente2606173[] {new Studente2606173("Matteo"), new Studente2606173("Simone"), 
				new Studente2606173("Cristian")};
		
		System.out.println(Arrays.toString(studenti));
		System.out.println(findMax(studenti));
	}
}
