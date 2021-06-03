import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_8 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		int n = 0;
		
		n = in.readInt("Inserisci il numero N: ");
		
		out.println();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				out.print(i*j + "\t");
			}
			out.println();
		}
	}
}
