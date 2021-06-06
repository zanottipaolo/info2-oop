class Persona{
	public Persona() {
		// Prima stampa questo
		System.out.println("Ciao, sono una persona!");
	}
}

class Studente extends Persona{
	public Studente() {
		// Poi questo
		System.out.println("Ciao, sono uno studente!");
	}
}
public class EsempiCostruttore {
	public static void main(String[] args) {
		Studente s1 = new Studente();
	}
}
