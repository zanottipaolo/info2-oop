class Rettangolo{
	private int base, altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
}

class Quadrato extends Rettangolo{
	public Quadrato(int l) {
		super(l, l);
	}
	
	public Quadrato() {
		this(0);
	}
}

public class EstensioneClasse {
	public static void main(String[] args) {
		Quadrato q1 = new Quadrato(5);
		Quadrato q2 = new Quadrato();
	}
}
