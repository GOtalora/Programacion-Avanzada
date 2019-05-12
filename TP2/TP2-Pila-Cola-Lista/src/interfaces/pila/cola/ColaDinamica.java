package interfaces.pila.cola;

public class ColaDinamica<T> implements Cola<T> {
	private Nodo<T> frente;
	private Nodo<T> fondo;
	public ColaDinamica() {
		frente=null;
		fondo=null;
	}
	@Override
	public boolean offer(T dato) {
		Nodo<T> nue= new Nodo<>(dato, null);
		if(fondo!=null)
			fondo.setSiguiente(nue);
		else 
			frente=nue;
		fondo=nue;
		return true;
	}
	@Override
	public T poll() {
		if(frente==null)
			return null;
		T dato= frente.getDato();
		Nodo <T> aux= frente.getSiguiente();
		frente=null;
		frente= aux;
		return dato;
	}
	@Override
	public T peek() {
		if(frente==null)
			return null;
		return frente.getDato();
	}
	@Override
	public boolean isEmpty() {
		return frente==null;
	}
	@Override
	public void empty() {
		while(frente!= null)
			frente= frente.getSiguiente();
		
	}

}
