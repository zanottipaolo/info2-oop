import java.util.Arrays;

class Studente2606172 implements Comparable<Studente2606172>{
	String nome;
	
	public Studente2606172(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Studente2606172 o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}

public class MergeSortStudenti2 {
	public static void sort(Studente2606172[] studenti) {
		mergeSort(studenti, 0, studenti.length-1);
	}
	
	public static void mergeSort(Studente2606172[] studenti, int min, int max) {
		if(min >= max)
			return;
		
		int media = (min + max) / 2;
		mergeSort(studenti, min, media);
		mergeSort(studenti, media + 1, max);
		merge(studenti, min, media, max);
	}
	
	public static void merge(Studente2606172[] studenti, int min, int media, int max) {
		int sx = min;
		int dx = media + 1;
		int i = 0;
		Studente2606172[] temp = new Studente2606172[max-min+1];
		
		while(i < temp.length) {
			if(dx > max || (sx <= media && studenti[sx].compareTo(studenti[dx]) < 0))
				temp[i++] = studenti[sx++];
			else
				temp[i++] = studenti[dx++];
		}
		
		for(i = 0; i < temp.length; i++) {
			studenti[min+i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		Studente2606172[] studenti = new Studente2606172[] {new Studente2606172("Simone"), new Studente2606172("Matteo"),
				new Studente2606172("Federico"), new Studente2606172("Cristian")};
		
		System.out.println(Arrays.toString(studenti));
		
		sort(studenti);
		
		System.out.println(Arrays.toString(studenti));
	}
}
