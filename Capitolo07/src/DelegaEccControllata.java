import java.io.IOException;

class FrazioneEccContro {
	private int num, den;
	
	public FrazioneEccContro(int num, int den) throws IOException {
		if(den == 0) {
			// IOException e = new IOException();
			// throw e;
			// ancora meglio sarebbe:
			throw new IOException();
		}
		this.num = num;
		this.den = den;
	}
	
	@Override
	public String toString() {
		return num + "/" + den;
	}
}

public class DelegaEccControllata {
	public static void main(String[] args) {
		FrazioneEccContro f1;
		FrazioneEccContro f2;
		try {
			f1 = new FrazioneEccContro(7, 3);
			System.out.println(f1);
			f2 = new FrazioneEccContro(1, 0);
			System.out.println(f2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
}
