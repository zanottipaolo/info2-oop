import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_6 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String sentence = null;
		
		sentence = in.readLine("Inserisci la frase: ");
		
		out.println();
		
		out.println(sentence.replaceAll(".", "*"));
		out.println(sentence);
		out.println(sentence.replaceAll(".", "*"));
	}
}
