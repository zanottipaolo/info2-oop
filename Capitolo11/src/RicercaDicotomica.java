import java.util.Arrays;
import java.util.Scanner;

public class RicercaDicotomica <T extends Comparable<T>> {
	public boolean ricercaBinaria(T[] t, T valore) {
		// Ordino l'array
		new BubbleSort().sortGenerico(t);
		int SX = 0, DX = t.length-1;
		
		do {
			int media = (SX + DX) / 2;
			if(valore.compareTo(t[media]) == 0)
				return true;
			else if(valore.compareTo(t[media]) > 0)
				SX = media + 1;
			else
				DX = media - 1; 
			
			System.out.print(".");	// per vedere il numero di iterazioni eseguite
		}while(SX <= DX);
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RicercaDicotomica<Integer> ricerca = new RicercaDicotomica<Integer>();
		Integer[] t = {5, 4, 3, 46165, 7, 20, 2};
		
		System.out.println(Arrays.toString(t));
		System.out.print("Che valore vuoi cercare? ");
		String daCercare = in.nextLine();
		System.out.println("Sto cercando il valore: " + daCercare + ". Prima però ordino l'array...");
		if(ricerca.ricercaBinaria(t, Integer.parseInt(daCercare)))
			System.out.println("Trovato!");
		else
			System.out.println("Non trovato");
	}
}
