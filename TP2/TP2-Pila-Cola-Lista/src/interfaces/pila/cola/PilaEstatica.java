package interfaces.pila.cola;

public class PilaEstatica<T> implements Pila<T>{
	
	private int tope;
	private T[]vec;
	
	//@SuppressWarnings("unchecked")
	public PilaEstatica(int cantMax) {
		this.vec = (T[])new Object[cantMax];
		this.tope = -1;

	}
	
	@Override
	public boolean push(T dato) {
		
		if(tope == vec.length)
			return false;
	
		vec[++tope]=dato;
		return true;
	}

	@Override
	public T pop() {
		if(tope==-1)
			return null;
		tope--;
		return vec[tope+1];
	}

	@Override
	public T peek() {
		if(tope==-1)
			return null;
		return vec[tope];
	}

	@Override
	public boolean isEmpty() {
		return (tope==-1);
			
	}

	@Override
	public void empty() {
		this.tope = -1;
	}

}
