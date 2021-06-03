import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_B {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		String sentence = null;
		
		sentence = in.readLine("Inserisci una stringa: ");
		out.print("Hai inserito: ");
		out.println(sentence);
		
		//Oppure
		out.println(in.readLine("Inserisci una stringa: "));
	}

}
