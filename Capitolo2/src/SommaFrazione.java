import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class SommaFrazione {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		Frazione f, g, somma;
		int num1, den1;
		
		out.println("Inserisci il primo numeratore: ");
		num1 = in.readInt();
		out.println("Inserisci il primo denominatore: ");
		den1 = in.readInt();
		f = new Frazione (num1, den1);
		
		g = new Frazione (in.readInt("Inserisci il secondo numeratore: "), 
				in.readInt("Inserisci il secondo denominatore: "));
		
		somma = f.piu(g);
		String risultato = somma.toString();
		out.print("La somma delle due frazioni e': ");
		out.println(risultato);
		
		//Oppure
		out.println(somma.toString());
		
		// O direttamente (Java aggiunge il .toString())
		out.println(somma);
		
	}
}
