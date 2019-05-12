package interfaces.pila.cola;

public class PilaDinamica<T> implements Pila <T>{
	private Nodo <T> tope;

	
	public PilaDinamica() {
		this.tope = null;
	}

	@Override
	public boolean push(T dato) {
		Nodo <T> nue = new Nodo<>(dato,tope);
		tope= nue;
		return true;
	}

	@Override
	public T pop() {
		if(tope==null)
			return null;
		T dato= tope.getDato();
		Nodo<T> aux = tope.getSiguiente(); 
		tope= null;
		tope= aux;
		return dato;
	}

	@Override
	public T peek() {
		if(tope==null)
			return null;
		return tope.getDato();
	}

	@Override
	public boolean isEmpty() {
		return tope==null;
	}

	@Override
	public void empty() {
		while(tope!=null)
			tope= tope.getSiguiente();
		
	}

}
