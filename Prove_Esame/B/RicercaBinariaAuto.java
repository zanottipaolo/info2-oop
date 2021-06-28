import java.util.Arrays;

class Auto260617 implements Comparable<Auto260617>{
	String targa;
	
	public Auto260617(String targa) {
		this.targa = targa;
	}
	
	@Override
	public int compareTo(Auto260617 o) {
		return this.targa.compareTo(o.targa);
	}
	
	@Override
	public String toString() {
		return targa;
	}
}

public class RicercaBinariaAuto {
	public static Auto260617 find(Auto260617[] auto, String targa) {
		int sx = 0, dx = auto.length-1;
		
		do {
			int media = (sx + dx) / 2;
			
			if(targa.compareTo(auto[media].targa) == 0)
				return auto[media];
			else if(targa.compareTo(auto[media].targa) > 0)
				sx = media + 1;
			else
				dx = media - 1;
		}while(sx <= dx);
		
		return null;
	}
	
	public static void main(String[] args) {
		Auto260617[] auto = new Auto260617[] {new Auto260617("AVYGBUH"), new Auto260617("BVYGBUH"),
				new Auto260617("GVYGBUH"), new Auto260617("MVYGBUH")};
		
		System.out.println(Arrays.toString(auto));
		System.out.println(find(auto, "BVYGBUH"));
	}
}
