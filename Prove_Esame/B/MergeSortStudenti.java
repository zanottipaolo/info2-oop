import java.util.Arrays;

class Studente260617 implements Comparable<Studente260617>{
	String nome;
	
	public Studente260617(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Studente260617 o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}


public class MergeSortStudenti {
	public static void sort(Studente260617[] studenti) {
		mergeSort(studenti, 0, studenti.length-1);
	}
	
	public static void mergeSort(Studente260617[] studenti, int min, int max) {
		if(min >= max)
			return;
		
		int media = (min+max)/2;
		mergeSort(studenti, min, media);
		mergeSort(studenti, media+1, max);
		merge(studenti, min, media, max);
	}
	
	public static void merge(Studente260617[] studenti, int min, int media, int max) {
		int sx = min;
		int dx = media + 1;
		int i = 0;
		Studente260617[] temp = new Studente260617[max-min+1];
		
		while(i < temp.length) {
			if(dx > max || (sx <= media && studenti[sx].nome.compareTo(studenti[dx].nome) < 0))
				temp[i++] = studenti[sx++];
			else
				temp[i++] = studenti[dx++];
		}
		
		for(i = 0; i < temp.length; i++) {
			studenti[min + i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		Studente260617[] studenti = {new Studente260617("Matteo"), new Studente260617("Cristian"), 
									new Studente260617("Simone"), new Studente260617("Federico")};
		
		System.out.println(Arrays.toString(studenti));
		
		sort(studenti);
		
		System.out.println(Arrays.toString(studenti));
	}
}
