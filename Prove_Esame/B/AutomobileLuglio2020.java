import java.util.Arrays;
import java.util.List;

class AutomobileSort implements Comparable<AutomobileSort>{
	private int km;
	
	public AutomobileSort(int km) {
		this.km = km;
	}
	
	public int compareTo(AutomobileSort o) {
		return this.km - o.km;
	}
	
	static void ordinaAuto(List<AutomobileSort> list) {
		// Bubble sort
		AutomobileSort temp;
		boolean flagScambiato;
		
		do {
			flagScambiato = false;
			for(int i=0; i<list.size()-1; i++) {
				if(list.get(i).compareTo(list.get(i+1)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
					
					flagScambiato = true;
				}
			}
		}while(flagScambiato);
	}
	
	@Override
	public String toString() {
		return "auto " + km;
	}
	
	static public AutomobileSort trovaAutoPiuVecchia(List<AutomobileSort> list) {
		AutomobileSort tempMax = null;
		
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i).compareTo(list.get(i+1)) < 0)
				tempMax = list.get(i+1);
		}
		return tempMax;
		
		// oppure ordina e poi prendi l'ultima
	}
	
	static public AutomobileSort trovaAutoConKm(List<AutomobileSort> list, int km) {
		int SX = 0, DX = list.size()-1, media = 0;
		
		// ordino
		ordinaAuto(list);
		
		do {
			media = (SX+DX) / 2;
			
			if(list.get(media).km == km)
				return list.get(media);
			else if(list.get(media).km < km)
				SX = media +1;
			else
				DX = media -1;
		}while(SX <= DX);
		return null;
	}
}

public class AutomobileLuglio2020 {
	public static void main(String[] args) {
		AutomobileSort Giulietta = new AutomobileSort(100000);
		AutomobileSort A3 = new AutomobileSort(150000);
		AutomobileSort Serie1 = new AutomobileSort(70000);
		AutomobileSort ClasseA = new AutomobileSort(85000);
		
		List<AutomobileSort> mieAuto = Arrays.asList(Giulietta, A3, Serie1, ClasseA);
		System.out.println(mieAuto.toString());
		System.out.println("Ordino la lista");
		
		// lo facciamo già nella ricerca binaria
		AutomobileSort.ordinaAuto(mieAuto);
		
		System.out.println(mieAuto.toString());
		System.out.println("Macchina con più km: " + AutomobileSort.trovaAutoPiuVecchia(mieAuto));
		System.out.println(AutomobileSort.trovaAutoConKm(mieAuto, 100000));
	}
}
