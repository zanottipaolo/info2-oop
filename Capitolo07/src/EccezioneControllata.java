import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EccezioneControllata {
	public static void main(String[] args) {
		try {
			leggiFile();
		}
		catch (FileNotFoundException e){
			System.out.println("File non trovato, riprova...");
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
		finally {
			System.out.println("Fine lettura file");
		}
	}
	
	// con 'Throws' specifico che l'eccezione verrà gestita dal main in questo caso
	public static void leggiFile() throws FileNotFoundException, IOException{
		FileReader file = new FileReader("prova.txt");
		file.close();
	}
}
