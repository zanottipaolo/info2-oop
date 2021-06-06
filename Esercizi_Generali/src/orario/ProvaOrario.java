package orario;

import java.util.Collections;
import java.util.Vector;

public class ProvaOrario {
	public static void main(String[] args) {
		Ora ora1 = new OraHM(16, 41);
		Ora ora2 = new OraHM(14, 00);
		Ora ora3 = new OraHM(8, 47);
		
		Ora ora4sec = new OraSec(7260);
		
		Vector<Ora> orari = new Vector<Ora>();
		orari.add(ora1);
		orari.add(ora2);
		orari.add(ora3);
		
		orari.add(ora4sec);
		
		System.out.println(orari);
		Collections.sort(orari);
		System.out.println("Ordino...");
		System.out.println(orari);
	}
}
