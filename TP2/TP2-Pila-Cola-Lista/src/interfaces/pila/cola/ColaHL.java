package interfaces.pila.cola;

public class ColaHL <T> extends Lista<T> implements Cola<T> {

	@Override
	public boolean offer(T dato) {
		super.pushBack(dato);
		return true;
	}

	@Override
	public T poll() {
		return super.popFront();
	}

	@Override
	public T peek() {
		return super.searchAt(0);
	}
	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public void empty() {
		super.empty();
	}

}
