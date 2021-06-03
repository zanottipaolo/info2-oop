import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_C {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		double n1, n2, somma;
		
		n1 = in.readDouble("Inserisci il primo numero: ");
		n2 = in.readDouble("Inserisci il secondo numero: ");
		
		somma = n1 + n2;
		
		out.println("La somma e': " + somma);
		
		//Oppure
		out.print("La somma e': " + (n1+n2));
	}

}
