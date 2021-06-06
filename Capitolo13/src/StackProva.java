class Stack<E>{
	Object[] data;
	int top;
	
	Stack(){
		data = new Object[100];
		top = 0;
	}
	
	public void push(E e) {
		if(top >= data.length)
			throw new RuntimeException("Stack pieno!");
		data[top++] = e;
	}
	
	public E pop() {
		return (E)data[--top];
	}
	
	public boolean isEmpty() {
		return false;
	}
}

public class StackProva {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(Integer.valueOf(4));
		s1.push(Integer.valueOf(5));
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}
}
