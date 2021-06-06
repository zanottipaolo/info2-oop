package orario;

public abstract class Ora implements Comparable <Ora> {
	
	/**
	 * 
	 * @return Restituisce l'ora (0 - 23)
	 */
	public abstract int getHH();
	
	/**
	 * 
	 * @return Restituisce i minuti (0 - 59)
	 */
	public abstract int getMM();
	
	
	@Override
	public int compareTo(Ora o) {
		int deltaHH = this.getHH() - o.getHH();
		return deltaHH == 0 ? this.getMM() - o.getMM() : this.getHH() - o.getHH();
		// Oppure questo che calcola i minuti da 00:00
		// return this.getHH()*60 + this.getMM() - o.getHH() * 60 + o.getMM();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ora) {
			Ora ora = (Ora) obj;
			return this.getHH() == ora.getHH() && this.getMM() == ora.getMM();
		}
		return false;
	}
}
