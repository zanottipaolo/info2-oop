public class FinallyExample {
	public static void main(String[] args) {
		try {
			System.out.println("Open Connection");
			System.out.println("Write Data " + (8 / (int)(Math.random() * 2)));
			System.out.println("Data Written");
		}
		catch(ArithmeticException ae) {
			System.err.println("Error");
			return;		// anche se c'è il return esegue comunque il finally
		}
		finally {
			System.out.println("Close Connection");
		}
	}
}
