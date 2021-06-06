class InvalidCodiceFiscaleException extends Exception{
	public InvalidCodiceFiscaleException() {
		super("Codice Fiscale errato!");	// Exception
	}
}


public class CodiceFiscale {
	CodiceFiscale(String codiceFiscale) throws InvalidCodiceFiscaleException{
		if(codiceFiscale.length() != 16) {
			throw new InvalidCodiceFiscaleException();
		}
	}
	public static void main(String[] args) {
		try{
			CodiceFiscale pf = new CodiceFiscale("AAA");
		}
		catch(InvalidCodiceFiscaleException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
