package lancio_dado;

public class DadoConMemoria extends Dado{
	int v1 = 0, v2 = 0;
	
	@Override
	protected int lancia() {
		int dado;
		
		do {
			dado = super.lancia();
		}while(dado == v1 || dado == v2);
		
		v1 = v2; v2 = dado;
		return dado;
	}
}
