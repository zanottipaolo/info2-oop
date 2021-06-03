import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Perimetro {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		Rettangolo r;
		char scelta = in.readChar("R --> Rettangolo; Q --> Quadrato: ");
		
		switch(scelta) {
		case 'R':
			double b = in.readDouble("Inserisci la base: ");
			double h = in.readDouble("Inserisci l'altezza: ");
			r = new Rettangolo(b, h);
			out.println("Il perimetro del " + r.getClass().getSimpleName() + " è: " + r.getPerimetro());
			break;
		case'Q':
			double l = in.readDouble("Inserisci il lato: ");
			r = new Quadrato(l);
			out.println("Il perimetro del " + r.getClass().getSimpleName() + " è: " + r.getPerimetro());
			break;
		default:
			System.err.println("Error Input Data");
			return;
		}
		
		System.out.println(r.toString());
	}
}
