import java.util.StringTokenizer;

public class UsoStringTokenizer{
	public static void main(String[] args) {
		String data = "Alessandro Manzoni;Fermo e Lucia;1825";
		StringTokenizer st = new StringTokenizer(data, ";");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}