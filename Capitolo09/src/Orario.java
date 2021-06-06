public class Orario implements Comparable<Orario>{
	private final static int MIN_PER_ORA = 60;
	private final static int ORE_GIORNO = 24;
	
	private static String separatore = ":";
	private int ore, minuti;
	
	public Orario(int ore, int minuti) {
		this.minuti = minuti % MIN_PER_ORA;
		this.ore = (minuti / MIN_PER_ORA + ore) % ORE_GIORNO;
	}
	
	public Orario(String o) {
		this(Integer.parseInt(o.split(":")[0]), 
				Integer.parseInt(o.split(":")[1]));
	}
	
	@Override
	public String toString() {
		return (ore < 10 ? "0" + ore : ore) + separatore + (minuti < 10 ? "0" + minuti : minuti);
	}
	
	// Return 0 se this == 0
	// Return > 0 se this > o
	// Return < 0 se this < 0
	public int compareTo(Orario o) {
		if(this.ore == o.ore) {
			if(this.minuti == o.minuti)
				return 0;
			//else if(this.minuti < o.minuti)
			//	return -1;
			//else
			//	return 1;
			else
				return this.minuti - o.minuti;
		}
		else
		//else if(this.ore < o.ore)
		//	return -1;
		//else
		//	return 1;
			return this.ore - o.ore;
	}
	
	public static void setSeparatore(char sep) {
		separatore = Character.toString(sep);
	}
	
	public static void main(String[] args) {
		Orario o1 = new Orario("23:01");
		Orario o2 = new Orario("23:02");
		
		System.out.println(o1);
		System.out.println(o2);
		
		if(o1.compareTo(o2) > 0)
			System.out.println(o1 + " è maggiore di " + o2);
		else if(o1.compareTo(o2) == 0) {
			System.out.println(o1 + " e " + o2 + " sono la stessa ora");
		}
		else
			System.out.println(o2 + " è maggiore di " + o1);
	}
}
