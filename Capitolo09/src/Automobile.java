public class Automobile {
	String targa;
	static int numeroAuto = 0;
	
	public Automobile(){
		numeroAuto++;
		targa = "AAA" + numeroAuto;
	}
	
	public static void main(String[] args) {
		Automobile a1 = new Automobile();
		Automobile a2 = new Automobile();
		Automobile a3 = new Automobile();
		
		System.out.println(a1.targa);
		System.out.println(a2.targa);
		System.out.println(a3.targa);
	}
}
