package orario;

import javax.management.RuntimeErrorException;

public class OraSec extends Ora {
	private static final int SECONDI_IN_UN_ORA = 3600;
	private int secondi;
	
	public OraSec(int secondi) {
		if(secondi < 0 || secondi > 86399)
			throw new RuntimeException();
		this.secondi = secondi;
	}
	
	@Override
	public int getHH() {
		return secondi / SECONDI_IN_UN_ORA;
	}
	
	@Override
	public int getMM() {
		// Per avere il formato hh:mm
		return secondi % SECONDI_IN_UN_ORA / 60;
	}
	
	public int getSec() {
		return (secondi % SECONDI_IN_UN_ORA) % 60;
	}
	
	@Override
	public String toString() {
		return "OraHM[" + getHH() + ":" + getMM() + ":" + getSec() + "]";
		// oppure
		// return String.format("OraHM[%2d:%2d]", getHH(), getMM());
	}
}
