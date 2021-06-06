import java.util.ArrayList;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class MaxArea {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		ArrayList<Figura> figureCreate = new ArrayList<>();
		Figura maxFigura = null;
		
		for(int i=0; i<20; i++) {
			Figura daInserire = figuraACaso();
			
			if(daInserire != null) {
				figureCreate.add(daInserire);
				out.println("Figura inserita: " + daInserire.getClass().getSimpleName() + " " + daInserire);
			}
			else
				System.err.println("Not a valid data");
		}
		maxFigura = getAreaMax(figureCreate);
		out.println("La figura con l'area massima è: " + maxFigura.getClass().getSimpleName() + " " + maxFigura);
	}

	static Figura figuraACaso() {
		Figura daInserire = null;
		// Random va da 0 a 1 escluso.
		// *3 va da 0 a 3 escluso
		// +1 va da 1 a 4 escluso
		// (int) per prendere solo la parte intera, quindi 1,2,3
		int sceltaFigura = (int)(Math.random() * 3 + 1);
		
		switch(sceltaFigura) {
		case 1:
			int base = (int)(Math.random() * 5 + 1);
			int altezza = (int)(Math.random() * 5 + 1);
			
			daInserire = new Rettangolo(base, altezza);
			break;
		case 2:
			int lato = (int)(Math.random() * 5 + 1);
			
			daInserire  = new Quadrato(lato);
			break;
		case 3:
			int raggio = (int)(Math.random() * 5 + 1);
			
			daInserire = new Cerchio(raggio);
			break;
		}
		return daInserire;
	}
	
	static Figura getAreaMax(ArrayList<Figura> figureImportate) {
		Figura areaMassimaTemp = figureImportate.get(0);
		
		for(Figura n : figureImportate) {
			if(n.getArea() > areaMassimaTemp.getArea())
				areaMassimaTemp = n;
		}
		return areaMassimaTemp;
	}
}
