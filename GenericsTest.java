package Generics;

public class GenericsTest<T> {
	
	private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

}
