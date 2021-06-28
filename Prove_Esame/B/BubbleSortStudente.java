import java.util.Arrays;

class Studente2606174 implements Comparable<Studente2606174>{
	String nome;
	
	public Studente2606174(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Studente2606174 o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
public class BubbleSortStudente {
	// Bubble Sort
	public static void sort(Studente2606174[] studenti) {
		boolean flagScambiato;
		Studente2606174 temp;
		
		do {
			flagScambiato = false;
			
			for(int i = 0; i < studenti.length - 1; i++) {
				if(studenti[i].compareTo(studenti[i+1]) > 0) {
					temp = studenti[i];
					studenti[i] = studenti[i+1];
					studenti[i+1] = temp;
					
					flagScambiato = true;
				}
			}
		}while(flagScambiato);
	}
	
	public static void main(String[] args) {
		Studente2606174[] studenti = new Studente2606174[] {new Studente2606174("Simone"), new Studente2606174("Cristian"),
				new Studente2606174("Matteo")};
		
		System.out.println(Arrays.toString(studenti));
		
		sort(studenti);
		
		System.out.println(Arrays.toString(studenti));
	}
}
