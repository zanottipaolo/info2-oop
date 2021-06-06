import java.util.Random;

class Prenotazione{
	private static final int COSTO_PER_PERSONA = 10;
	
	int costo(int numeroPersone) {
		return numeroPersone * COSTO_PER_PERSONA;
	}
}

class PrenotazioneDiGruppo extends Prenotazione{
	private static final int VENTI = 20;
	private static final int UNO  = 1;
	
	int costo(int numeroPersone) {
		return VENTI + numeroPersone * UNO;
	}
}

public class UsoOverride {
	static final Random rnd = new Random();
	
	public static void main(String[] args) {
		int numeroPersone = rnd.nextInt(32);
		Prenotazione p;
		
		System.out.println("Numero di persone: " + numeroPersone);
		
		if(numeroPersone > 7)
			p = new PrenotazioneDiGruppo();
		else
			p = new Prenotazione();
		
		System.out.println("Costo totale: " + p.costo(numeroPersone) + "€");
	}
}
