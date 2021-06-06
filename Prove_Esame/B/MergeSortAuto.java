import java.util.Arrays;

class Automobile implements Comparable<Automobile>{
	private String targa;
	
	public Automobile(String targa) {
		this.targa = targa;
	}
	
	public int compareTo(Automobile confronto) {
		return this.targa.compareTo(confronto.targa);
	}
	
	@Override
	public String toString() {
		return targa;
	}
}

public class MergeSortAuto {
	public static void sort(Automobile[] auto) {
		mergeSort(auto, 0, auto.length-1);
	}
	
	public static void mergeSort(Automobile[] auto, int min, int max) {
		if(min >= max)
			return;
		
		int media = (min + max)/2;
		mergeSort(auto, min, media);
		mergeSort(auto, media+1, max);
		merge(auto, min, media, max);
	}
	
	public static void merge(Automobile[] auto, int min, int media, int max) {
		int sx = min;
		int dx = media + 1;
		int i = 0;
		Automobile[] temp = new Automobile[max-min+1];
		
		while(i < temp.length) {
			if(dx > max || (sx <= media && auto[sx].compareTo(auto[dx]) < 0))
				temp[i++] = auto[sx++];
			else
				temp[i++] = auto[dx++];
		}
		
		for(i = 0; i<temp.length; i++) {
			auto[min+i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		Automobile[] auto = new Automobile[]{new Automobile("JMYRM"), new Automobile("GWGEGVER"), new Automobile("AGREGE")};
		System.out.println(Arrays.toString(auto));
		sort(auto);
		System.out.println(Arrays.toString(auto));
	}
}
