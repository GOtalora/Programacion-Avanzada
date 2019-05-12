package interfaces.pila.cola;

public class PilaHL<T> extends Lista<T> implements Pila<T> {
 
	
	@Override
	public boolean push(T dato) {
		super.pushFront(dato);
		return true;
	}
	

	@Override
	public T pop() {
		return super.popFront();
	}

	@Override
	public T peek() {
		return super.searchAt(0);
	}

}
