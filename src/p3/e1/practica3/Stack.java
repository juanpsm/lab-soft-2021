package p3.e1.practica3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
	private java.util.ArrayList<Object> items;
	private StackIterator stackIterator;

    private class StackIterator{
        public Iterator<Object> iterator(ArrayList<Object> a){
            return a.iterator();
        }
    }
	public Stack() {
		items = new ArrayList<Object>();
		stackIterator = new StackIterator();
	}
	public void push(Object item) {
		items.add(item);
	}
	public Object pop() {
//		if (!this.isEmpty())
//		return items.remove(items.size()-1);
//		return false;
		if(this.isEmpty())
            throw new IllegalStateException("Stack is empty");
        return items.remove(items.size() - 1);
	}
	public boolean isEmpty() {
		return items.size() == 0;
	}
	public void finalize() {
		
	}
	@Override
	public String toString() {
		return items.toString();
	}
	public Iterator<Object> iterator(){
        return stackIterator.iterator(items);
    }
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		Stack s = new Stack();
		
		s.push(2);
		System.out.println("s.push(2): " + s);
		s.push("x");
		System.out.println("s.push(\"x\"): " + s);
		System.out.println("s.pop(): " + s.pop());
		System.out.println("s.pop(): " + s.pop());
//		System.out.println("s.pop(): " + s.pop());
		
		System.out.println("s: " + s);
		System.out.println("s.isEmpty(): " + s.isEmpty());
		s.push("a");s.push("b");s.push("c");
		System.out.println("s.push(\"a\");s.push(\"b\");s.push(\"c\");: " + s);
		
		Iterator<?> i = s.iterator();
        while (i.hasNext()) System.out.println("Item: " + i.next());
        System.out.println("Stack post iterator | Empty? " + s.isEmpty());
        System.out.println("s: " + s);
	}

}
