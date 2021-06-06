public class Frazione {
	// CAMPI
	private long numeratore, denominatore;
	
	// COSTRUTTORI
	public Frazione(long numeratore, long denominatore) {
		// Per semplificare
		long mcd = getMCD(numeratore, denominatore);
		
		this.numeratore = numeratore/mcd;
		this.denominatore = denominatore/mcd;
	}
	
	public Frazione(long numeratore) {
		this(numeratore, 1);
	}
	
	public Frazione() {
		this(0);
	}
	
	// METODI
	public Frazione piu(Frazione a) {
		long nuovoNumeratore, nuovoDenominatore;
		
		nuovoNumeratore = (this.numeratore * a.denominatore) + (this.denominatore * a.numeratore);
		nuovoDenominatore = this.denominatore * a.denominatore;
		
		return new Frazione(nuovoNumeratore, nuovoDenominatore);
	}
	
	public Frazione per(Frazione a) {
		long nuovoNumeratore, nuovoDenominatore;
		
		nuovoNumeratore = this.numeratore * a.numeratore;
		nuovoDenominatore = this.denominatore * a.denominatore;
		
		return new Frazione(nuovoNumeratore, nuovoDenominatore);
	}
	
	static public long getMCD(long a, long b) {
		// Algoritmo di Euclide
		long resto;
		
		do {
			resto = a%b;
			a = b;
			b = resto;
		}while(resto != 0);
		
		return a;
	}
	
	public String toString() {
		return numeratore + "/" + denominatore;
	}
	
	public boolean equals(Frazione a) {
		return this.numeratore == a.numeratore && this.denominatore == a.denominatore;
	}
	
	/* Questo sarebbe il metodo originale
	 
	@Override
	public boolean equals(Object obj) {
		// Se sono identici è sicuramente equals
		if(this == obj)
			return true;
		if(obj instanceof Frazione) {
			Frazione f = (Frazione) obj;
			return this.numeratore == f.numeratore && this.denominatore == f.denominatore;
			// oppure anche -> return equals((Frazione) obj);
		}
		return false;
	}*/
	
	public static void main(String[] args) {
		Frazione prima = new Frazione(1, 2);
		System.out.println(prima);	//toString è implicito
		
		Frazione seconda = new Frazione(-1, -2);
		System.out.println(seconda);
		
		if(prima.equals(seconda))
			System.out.println("Le due frazioni sono uguali!");
		else
			System.out.println("Le due frazioni sono diverse");
	}
}
