import java.util.Arrays;

class Auto implements Comparable<Auto>{
	String targa;
	
	public Auto(String targa) {
		this.targa = targa;
	}
	
	@Override
	public int compareTo(Auto o) {
		return this.targa.compareTo(o.targa);
	}
	
	@Override
	public String toString() {
		return targa;
	}
}

public class BubbleSortAuto {
	public static void BubbleSort(Auto[] automobili) {
		boolean flagScambiato;
		Auto temp;
		
		do {
			flagScambiato = false;
			
			for(int i = 0; i < automobili.length-1; i++) {
				if(automobili[i].compareTo(automobili[i+1]) > 0) {
					temp = automobili[i];
					automobili[i] = automobili[i+1];
					automobili[i+1] = temp;
					
					flagScambiato = true;
				}
			}
		}while(flagScambiato);
	}
	
	public static void main(String[] args) {
		Auto[] automobili = new Auto[] {new Auto("TTFYGU"), new Auto("ETFYGU"), new Auto("ATFYGU")};
		
		System.out.println(Arrays.toString(automobili));
		
		BubbleSort(automobili);
		
		System.out.println(Arrays.toString(automobili));
	}
}
