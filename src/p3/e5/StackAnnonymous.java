package p3.e5;

import java.util.ArrayList;
import java.util.Iterator;

public class StackAnnonymous {
    private java.util.ArrayList<Object> items;
    private StackIterator stackIterator;

    private interface StackIterator{
        public Iterator<Object> iterator(ArrayList<Object> a);
    }

    public StackAnnonymous() {
        items = new ArrayList<Object>();
        stackIterator = new StackIterator(){
	        @Override
	        public Iterator<Object> iterator(ArrayList<Object> a){
	            return a.iterator();
	        }
        };
    }

    public void push(Object item){
        items.add(item);
    }

    public Object pop(){
        if(this.isEmpty())
            throw new IllegalStateException("Stack is empty");
        return items.remove(size() - 1);
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void finalize(){

    }

    public int size(){
        return items.size();
    }

    public Iterator<Object> iterator(){
        return stackIterator.iterator(items);
    }

}
