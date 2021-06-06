package orario;

public class OraHM extends Ora{
	private int ora, minuti;
	
	public OraHM(int ora, int minuti){
		if(ora < 0 || ora > 23 || minuti < 0 ||  minuti > 59)
			throw new RuntimeException();
		
		this.ora = ora;
		this.minuti = minuti;
	}
	
	@Override
	public int getHH() {
		return ora;
	}
	
	@Override
	public int getMM() {
		return minuti;
	}
	
	@Override
	public String toString() {
		return "OraHM[" + ora + ":" + minuti + "]";
		// oppure
		// return String.format("OraHM[%2d:%2d]", ora, minuti);
	}
}
