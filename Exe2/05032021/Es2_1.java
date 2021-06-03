import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_1 {
	
	public static boolean IsVocale(char lettera) {
		boolean check = false;
		
		switch(lettera) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			check = true;
			break;
		}
		
		return check;
	}
	
	public static StringBuffer NoVocale(String sentence) {
		StringBuffer frase_no_vocali = new StringBuffer();
		
		for(int i=0; i<sentence.length(); i++) {
			if(!IsVocale(sentence.charAt(i))) {
				frase_no_vocali.append(sentence.charAt(i));
			}		
		}
		
		return frase_no_vocali;
	}
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String sentence = null;
		
		sentence = in.readLine("Inserisci una frase: ");
		
		out.println();
		out.println(NoVocale(sentence.toLowerCase()));
	}
}
