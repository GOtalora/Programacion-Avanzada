package interfaces.pila.cola;

public class PilaCL<T> implements Pila<T> {
	
	Lista <T> pila= new Lista<>();
	@Override
	public boolean push(T dato) {
		return pila.pushBack(dato);
	}

	@Override
	public T pop() {
		return pila.popBack();
	}

	@Override
	public T peek() {
		return pila.searchAt(pila.tamanio-1);
	}

	@Override
	public boolean isEmpty() {
		return pila.isEmpty();
	}

	@Override
	public void empty() {
		pila.empty();
		
	}

}
