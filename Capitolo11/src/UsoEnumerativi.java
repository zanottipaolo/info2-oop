import java.util.Arrays;

enum GiorniDellaSettimana{
	LUN(-1), MAR(8), MER(8), GIO(8), VEN(8), SAB(10), DOM(20);
	
	private int qualita;
	
	GiorniDellaSettimana(int q) {
		qualita = q;
	}
	
	int getQualita() {
		return qualita;
	}
	
	/*
	@Override
	public String toString() {
		// Non supportato
		return switch(this) {
		case LUN -> "Lunedì";
		case MAR -> "Martedì";
		default -> super.toString();
		};
	}
	*/
	
	public int numueroOreLavorative(){
		switch(this) {
		case LUN: 
			return 10;
		case MAR: 
			return 12;
		case DOM: 
			return 0;
		default:
			return 8;
		}
	}
}

public class UsoEnumerativi {
	public static void main(String[] args) {
		GiorniDellaSettimana oggi = GiorniDellaSettimana.DOM;
		
		System.out.println(GiorniDellaSettimana.LUN.compareTo(oggi));
		System.out.println(Arrays.toString(GiorniDellaSettimana.values()));
		System.out.println(GiorniDellaSettimana.VEN.ordinal());
		System.out.println(GiorniDellaSettimana.LUN.numueroOreLavorative());
		System.out.println(GiorniDellaSettimana.DOM.getQualita());
	}
}
