package lancio_dado;

import java.util.Random;

public class Dado {
	protected static Random rnd = new Random();
	
	/**
	 * 
	 * @return Restituisce una faccia del dado
	 */
	protected int lancia() {
		return rnd.nextInt(6) + 1; // da 1 a 6 incluso
	}
}
