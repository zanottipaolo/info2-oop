import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Nazione implements Comparable<Nazione>{
	private String name;
	private long population;
	
	public Nazione(String name, long population) {
		this.name = name;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return name + " - " + population;
	}
	
	public int compareTo(Nazione o) {
		return this.name.compareToIgnoreCase(o.name);
	}
	
	public long getPopulation() {
		return population;
	}
}

class ComparatorePerPopolazione implements Comparator<Nazione>{
	public int compare(Nazione o1, Nazione o2) {
		// return (int) (o1.getPopulation() - o1.getPopulation());
		return Long.compare(o1.getPopulation(), o2.getPopulation());
	}
}

public class Comparable_Comparator {
	public static void main(String[] args) {
		ArrayList<Nazione> onu = new ArrayList<>();
		Nazione italia = new Nazione("Italia", 60000003);
		Nazione usa = new Nazione("USA", 60000001);
		Nazione francia = new Nazione("Francia", 60000000);
		Nazione germania = new Nazione("Germania", 60000003);
		
		onu.add(italia);
		onu.add(usa);
		onu.add(francia);
		onu.add(germania);
		
		System.out.println(onu);
		
		System.out.println("Ordino");
		
		Collections.sort(onu);
		
		System.out.println(onu);
		
		System.out.println("Ordino per popolazione");
		
		Collections.sort(onu, new ComparatorePerPopolazione());
		
		System.out.println(onu);
	}
}
