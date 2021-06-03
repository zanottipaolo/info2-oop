import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_3 {
	
	public static void CountLettere(String sentence, ConsoleOutputManager out) {
		int contatore = 0;
		for(char i='a'; i<='z'; i++) {
			for(int j=0; j<sentence.length(); j++) {
				if(sentence.charAt(j) == i)
					contatore++;
			}
			
			if(contatore > 0) {
				out.println(i + " => " + contatore);
				contatore = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String sentence = null;
		
		sentence = in.readLine("Inserisci una frase: ");
		
		out.println();
		
		CountLettere(sentence.toLowerCase(), out);
	}
}
