import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

class Persona{
	public String Sentence(){
		return "Io sono una persona";
	}
}

class Studente extends Persona {
	public String Sentence() {
		return "Io sono uno studente";
	}
}

class Lavoratore extends Persona{
	public String Sentence() {
		return "Io sono un lavoratore";
	}
}

public class UsoOverriding {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		Persona p = new Persona();
		out.println(p.Sentence());
		
		p = new Studente();
		out.println(p.Sentence());
		
		p = new Lavoratore();
		out.println(p.Sentence());
	}
}
