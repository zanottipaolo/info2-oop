import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_9 {
	
	public static String RemoveSpace(String sentence) {
		String sentence_no_space = null;
		
		sentence_no_space = sentence.trim().toLowerCase();
		
		return sentence_no_space;
	}
	
	public static boolean IsPalindrome(String sentence) {
		boolean check = false;
		int len = sentence.length();
		
		for(int i=0; i<len; i++) {
			if(sentence.charAt(i) == sentence.charAt(len-1-i))
				check = true;
			else
				check = false;
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String sentence = null;
		
		sentence = RemoveSpace(in.readLine("Inserisci una frase: "));
		
		out.println();
		
		if(IsPalindrome(sentence))
			out.println("La frase '" + sentence + "' e' palindroma");
		else
			out.println("La frase non e' palindroma");
	}
}
