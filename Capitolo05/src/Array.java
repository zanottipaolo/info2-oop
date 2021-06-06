import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
	public static void main(String[] args) {
		String[] names = new String[5];
		ArrayList<String> citta = new ArrayList<>();
		
		for(int i=0; i<names.length; i++) {
			names[i] = "Ciao";
		}
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.print(Arrays.toString(names));
		
		citta.add("Roma");
		citta.add("Milano");
		citta.add("Firenze");
		citta.add("Bergamo");
		
		Collections.sort(citta);
		
		for(String c : citta) {
			System.out.println(c);
		}	
	}
}
