import java.util.Stack;

public class CalcolatriceStack {
	Integer compute(String s) {
		Stack<Integer> pila = new Stack<>();
		String[] tokens = s.split(" ");
		
		for(String t : tokens) {
			switch(t) {
			case "+":
				pila.push(pila.pop() + pila.pop());
				break;
			case "-":
				pila.push(-pila.pop() + pila.pop());
				break;
			case "*":
				pila.push(pila.pop() * pila.pop());
				break;
			case "/":
				int den = pila.pop();
				int num = pila.pop();
				
				try {
					pila.push(num/den);
					break;
				}
				catch(ArithmeticException a){
					System.out.println("Divisione per 0 non ammessa!");
					return null;
				}
			default:
				try {
					pila.push(Integer.parseInt(t)); // è un operando, mette nello stack
				}
				catch(NumberFormatException e){
					System.out.println("'" + t + "'" + " non è un numero valido!");
					return null;
				}
			}
		}
		return pila.pop();
	}
	
	public static void main(String[] args) {
		CalcolatriceStack c = new CalcolatriceStack();
		System.out.println(c.compute("3 2 +"));
		System.out.println(c.compute("Marco"));
		System.out.println(c.compute("5 0 /"));
	}
}
