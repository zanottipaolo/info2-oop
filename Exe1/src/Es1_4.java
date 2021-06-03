import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es1_4 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		Frazione f1, f2;
		int num1, num2, den1, den2;
		
		num1 = in.readInt("Inserisci il primo numeratore: ");

		do {
			den1 = in.readInt("Inserisci il primo denominatore: ");
		}while(den1 == 0);
		
		f1 = new Frazione(num1, den1); 
		
		num2 = in.readInt("Inserisci il secondo numeratore: ");

		do {
			den2 = in.readInt("Inserisci il secondo denominatore: ");
		}while(den2 == 0);
		
		f2 = new Frazione(num2, den2); 
		
		out.println("Somma: " + f1.piu(f2));
		out.println("Differenza: " + f1.meno(f2));
		out.println("Prodotto: " + f1.per(f2));
		out.println("Divisione: " + f1.diviso(f2));
	}
}
