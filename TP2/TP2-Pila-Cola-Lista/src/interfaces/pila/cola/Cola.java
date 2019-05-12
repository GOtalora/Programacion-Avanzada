package interfaces.pila.cola;

public interface Cola<T> {
	
	public boolean offer(T dato);
	public T poll();
	public T peek();
	public boolean isEmpty();
	public void empty();

}
