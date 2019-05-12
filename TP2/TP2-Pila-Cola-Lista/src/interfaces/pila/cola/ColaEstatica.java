package interfaces.pila.cola;

public class ColaEstatica<T> implements Cola<T>{

	private T[]vec;
	private int frente;
	private int fondo;
	private int cant;
	
	public ColaEstatica(int tamCola) {
		vec = (T[])new Object[tamCola];
		frente = 0;
		fondo = -1;
		cant = 0;
	}
	@Override
	public boolean offer(T dato) {
		if(cant==vec.length)
			return false;
		cant++;
		fondo = (fondo+1)%vec.length;
		vec[fondo] = dato;
		return true;
	}

	@Override
	public T poll() {
		if(cant == 0)
			return null;
		cant--;
		T aux = vec[frente];
		frente = (frente +1)%vec.length;
		return aux;
	}

	@Override
	public T peek() {
		if(cant == 0)
			return null;
		return vec[frente];
	}

	@Override
	public boolean isEmpty() {
		return cant==0;
			
	}

	@Override
	public void empty() {
		frente = -1;
		fondo = 0;
		cant = 0;
	}

}
