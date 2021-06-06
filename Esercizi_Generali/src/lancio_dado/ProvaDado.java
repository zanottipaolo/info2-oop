package lancio_dado;

public class ProvaDado {
	public static void main(String[] args) {
		Dado dadoNormale = new Dado();
		Dado dadoTruccato = new DadoTruccato();
		Dado dadoMemoria = new DadoConMemoria();
		int n = 1000, somma1 = 0, somma2 = 0, somma3 = 0;
		
		for(int i=0; i<n; i++) {
			somma1 += dadoNormale.lancia();
			somma2 += dadoTruccato.lancia();
			somma3 += dadoMemoria.lancia();
		}
		
		System.out.println("******************");
		System.out.println("Dado normale");
		System.out.println((double)(somma1)/n);
		System.out.println("******************");
		System.out.println("Dado truccato");
		System.out.println((double)(somma2)/n);
		System.out.println("******************");
		System.out.println("Dado con memoria");
		System.out.println((double)(somma3)/n);
	}
}
