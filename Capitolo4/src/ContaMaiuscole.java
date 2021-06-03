import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ContaMaiuscole {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String frase = in.readLine("Inserisci una frase: ");
		int minuscole = 0, maiuscole = 0;
		char carattere;
		
		for(int i=0; i<frase.length(); i++) {
			carattere = frase.charAt(i);
			
			if(Character.isLowerCase(carattere))
				minuscole++;
			else
				maiuscole++;
		}
		
		out.println("Il numero di minuscole è: " + minuscole);
		out.println("Il numero di maiuscole è: " + maiuscole);

	}
}