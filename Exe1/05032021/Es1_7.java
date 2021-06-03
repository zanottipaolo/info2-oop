import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_7 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String sentence = null, spazio_lungo = null;
		int len = 0;
		
		sentence = in.readLine("Inserisci una frase: ");
		len = sentence.length();
		spazio_lungo = sentence.replaceAll(".", " ");
		
		out.println();
		
		out.println("**" + sentence.replaceAll(".", "*") + "**");
		out.println("*" + "  " + spazio_lungo.substring(1, len-1) + "  " + "*");
		out.println("*" + " " + sentence + " " + "*");
		out.println("*" + "  " + spazio_lungo.substring(1, len-1) + "  " + "*");
		out.println("**" + sentence.replaceAll(".", "*") + "**");
	}
}
