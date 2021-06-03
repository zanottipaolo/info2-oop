import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es1_5 {
	public static void main (String[] arg){
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		Frazione f = new Frazione(0, 1);
		Frazione somma = new Frazione(0, 1);
		Frazione media = new Frazione(0, 1);
		Frazione num_tot;
		int num, den, contatore = 0;
		
		do {
			num = in.readInt("Inserisci il numeratore: ");
			den = in.readInt("Inserisci il denominatore: ");
			f = new Frazione(num, den);
			somma = somma.piu(f);
			out.println(somma);
			contatore++;
			out.println(contatore);
		}while(in.readSiNo("Vuoi continuare?"));
		
		num_tot = new Frazione(contatore, 1);
		
		media = somma.diviso(num_tot);
		
		out.println("La media delle frazione e': " + media);
	}
}
