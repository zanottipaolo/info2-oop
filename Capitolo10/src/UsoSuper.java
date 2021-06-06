class PersonaSuper{
	String getName() {
		return "Nome Persona";
	}
}

class StudenteSuper extends PersonaSuper{
	String getName() {
		return "Nome Studente";
	}
	
	@Override
	public String toString() {
		return super.getName() + " - " + this.getName();
	}
}
public class UsoSuper {
	public static void main(String[] args) {
		StudenteSuper s1 = new StudenteSuper();
		System.out.println(s1.toString());
	} 
}