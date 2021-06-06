import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class RipetiParola {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String word;
		
		out.print("Ciao, inserisci una parola: ");
		word = in.readLine();
		out.print("Hai inserito: ");
		out.println(word);
	}

}
