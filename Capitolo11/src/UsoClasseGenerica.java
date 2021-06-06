class Coppia<T, S>{
	T primo;
	S secondo;
}

public class UsoClasseGenerica {
	public static void main(String[] args) {
		Coppia<String, Integer> c = new Coppia<String, Integer>();
		System.out.println(c.primo = "Sono una stringa");
		System.out.println(c.secondo = 5);
	}
}
