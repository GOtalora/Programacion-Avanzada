package interfaces.pila.cola;

public class ColaCL<T> implements Cola <T>{

	Lista <T> cola= new Lista<>();
	@Override
	public boolean offer(T dato) {
		Nodo<T> nue = new Nodo<>(dato, null);
		if(cola.inicio == null)
			cola.inicio = nue;
		else
			cola.fin.setSiguiente(nue);
		cola.fin = nue;
		cola.tamanio++;
		return true;
	}

	@Override
	public T poll() {
		if(cola.inicio == null)
			return null;
				
		Nodo<T> aux = cola.inicio;
		cola.inicio = cola.inicio.getSiguiente();
		if(cola.inicio == null)
			cola.fin = null;
		cola.tamanio--;
		return aux.getDato();
	}

	@Override
	public T peek() {
		if(cola.inicio == null)
			return null;
				
		return cola.inicio.getDato();
	}

	@Override
	public boolean isEmpty() {
		return cola.inicio == null;
	}

	@Override
	public void empty() {
		cola.empty();
		
	}

}
