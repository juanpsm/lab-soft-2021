package p3.e1.practica3;

public class Stack {
	private java.util.ArrayList items;
	public Stack() {
		items = new java.util.ArrayList();
	}
	public void push(Object item) {
		items.add(item);
	}
	public Object pop() {
		return items.remove(items.size());
	}
	public boolean isEmpty() {
		return items.size() == 0;
	}
	public void finalize() {
		
	}
	public static void main(String[] args) {
		System.out.println(args[0]);
	}

}
