import prog.utili.Frazione;

public class ProvaFrazione {
	public static void main(String[] args) {
		Frazione f = new Frazione (2, 3);
		Frazione g = new Frazione (1,3);
		Frazione somma = f.piu(g);
		
		System.out.println(somma);
	}
}
