class FrazioneEcc {
	private int num, den;
	
	public FrazioneEcc(int num, int den) {
		if(den == 0) {
			System.err.println("ERROR: Divisione per 0 non ammmessa");
			ArithmeticException ae = new ArithmeticException();
			throw ae;		// fr2 non viene creato
		}
		
		this.num = num;
		this.den = den;
	}
	
	@Override
	public String toString() {
		return num + "/" + den;
	}
}

public class DelegaEccNonControllata {
	public static void main(String[] args) {
		FrazioneEcc fr1 = new FrazioneEcc(5, 4);
		System.out.println(fr1);
		FrazioneEcc fr2 = new FrazioneEcc(9, 0);
		System.out.println(fr2);
	}
}
