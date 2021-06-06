import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Cast {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		Rettangolo r;
		double x = in.readInt("Inserisci base: ");
		double y = in.readInt("Inserisci altezza: ");
		
		if(x == y) 
			r = new Quadrato(x);
		else
			r = new Rettangolo(x, y);
		
		if(r instanceof Quadrato)
			//Senza il CAST r ha solo i metodi di Rettangolo e non di Quadrato
			out.println("Lato: " + ((Quadrato)r).getLato());
	}
}
