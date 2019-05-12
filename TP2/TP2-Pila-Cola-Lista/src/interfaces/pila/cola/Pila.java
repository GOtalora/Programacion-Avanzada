package interfaces.pila.cola;

public interface Pila<T> {


	public boolean push(T dato); //apilar
	public T pop(); //desapilar
	public T peek(); //ver tope
	public boolean isEmpty(); // esta vacia?
	public void empty();// vaciar pila
	
}
