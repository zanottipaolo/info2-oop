import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class InteriStringhe {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int somma = 0;
		String numero = "";
		
		for(;;) {
			numero = in.readLine("Inserisci un numero(per uscire 'Exit'): ");
			if(numero.equals("Exit"))
				break;
			somma += Integer.parseInt(numero);
		}
		out.println(somma);
	}
}
