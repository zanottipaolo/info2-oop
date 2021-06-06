import java.util.Arrays;

public class BubbleSort {
	public void sortInt(int[] a) {
		boolean flagScambiato;
		int temp;
		
		do {
			flagScambiato = false;
			for(int i=0; i<a.length-1; i++) {
				if(a[i] > a[i+1]) {
					// Allora scambia
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					
					System.out.println("Scambio " + a[i] + " con " + a[i+1]);
					System.out.println(Arrays.toString(a));
					
					flagScambiato = true;
				}
			}
		}while(flagScambiato);
	}
	
	public void sortString(String[] s) {
		boolean flagScambiato;
		String temp;
		
		do {
			flagScambiato = false;
			for(int i=0; i<s.length-1; i++) {
				if(s[i].compareTo(s[i+1]) > 0) {
					// allora fai lo scambio
					temp = s[i];
					s[i] = s[i+1];
					s[i+1] = temp;
					
					flagScambiato = true;
					
					System.out.println("Scambio " + s[i] + " con " + s[i+1]);
					System.out.println(Arrays.toString(s));
				}
			}
		}while(flagScambiato);
	}
	
	<T extends Comparable<T>> void sortGenerico(T[] t) {
		boolean flagScambiato;
		T temp;
		
		do {
			flagScambiato = false;
			for(int i=0; i<t.length-1; i++) {
				if(t[i].compareTo(t[i+1]) > 0) {
					temp = t[i];
					t[i] = t[i+1];
					t[i+1] = temp;
					
					flagScambiato = true;
					
					System.out.println("Scambio " + t[i] + " con " + t[i+1]);
					System.out.println(Arrays.toString(t));
				}
			}
		}while(flagScambiato);
	}
	
	public static void main(String[] args) {
		BubbleSort alg = new BubbleSort();
		int[] a = {5, 1, 8, 7, 10};
		String[] s = {"Ciao", "Algebra", "Tavolo", "Mela"};
		Integer[] i = {486, 200, 48949, 47};
		
		System.out.println(Arrays.toString(a));
		System.out.println("Ordino l'array...");
		alg.sortInt(a);
		//System.out.println(Arrays.toString(a));
		System.out.println("*******************");
		System.out.println(Arrays.toString(s));
		System.out.println("Ordino l'array...");
		alg.sortString(s);
		// System.out.println(Arrays.toString(s));
		System.out.println("*******************");
		System.out.println(Arrays.toString(i));
		System.out.println("Ordino l'array...");
		alg.sortGenerico(i);
		// System.out.println(Arrays.toString(s));
	}
}
