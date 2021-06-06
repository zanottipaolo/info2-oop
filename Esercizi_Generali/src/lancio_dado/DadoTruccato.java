package lancio_dado;

public class DadoTruccato extends Dado {
	private int minLanci = 0;
	
	@Override
	protected int lancia() {
		int dado;
		
		do {
			dado = super.lancia();
		} while(dado == 6 && minLanci > 0);
		
		if(dado == 6)
			minLanci = 10;
		else
			minLanci--;
		return dado;
	}
}
