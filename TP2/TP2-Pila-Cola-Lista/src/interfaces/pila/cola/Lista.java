package interfaces.pila.cola;

import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
	
	protected Nodo<T> inicio;
	protected Nodo<T> fin;
	protected int tamanio;
	
	public Lista() {
		inicio=null;
		fin=null;
		tamanio=0;
	}
	
	 //Inserta un elemento al ﬁnal
	public boolean pushBack (T dato) {
		Nodo <T> nue= new Nodo<> (dato,null);
		if(inicio == null)
			inicio= nue;
		else 
			fin.setSiguiente(nue);
		fin= nue;
		tamanio++;
		return true;
	}
	
	 // Retorna y borra el elemento al ﬁnal
	public T popBack () {
		if(inicio==null)
			return null;
		T dato= fin.getDato();
		Nodo <T> aux= getNodo(tamanio-2);
		if(aux == null) {//SOLO HAY UN ELEMENTO
			inicio=null;
			fin=null;
		}
		else {
			aux.setSiguiente(null);
			fin=null;
			fin=aux;
		}
		tamanio--;
		return dato;
	}
	
	
	//Insertar un elemento al comienzo
	public boolean pushFront( T dato) {
		Nodo <T> nue;
		if(tamanio == 0) { //lista vacia
			nue= new Nodo<>(dato,null);
			fin= nue;
		}
		else 
			nue = new Nodo<>(dato,inicio);
		
		inicio= nue;
		tamanio++;
		return true;
	}
	
	
	//Retorna y borra el elemento al principio
	public T popFront() {
		if(tamanio==0)
			return null;
		Nodo<T> aux= inicio.getSiguiente();
		T dato = inicio.getDato();
		inicio=null;
		inicio=aux;
		tamanio--;
		return dato;
	}
	public boolean remove(T dato) {
		int pos= search(dato);
		if(pos == -1) {
			return false;
		}
		
		eraseAt(pos);
		return true;
	}
	
	//invierte el orden de los elementos en la lista
	public void reverse() {
		if(isEmpty()) {
			return;
		}
		Nodo <T> pri_n= fin;
		
		int cont= tamanio-1;
		Nodo<T> nodo_act= pri_n;
		while(cont >0) {
			Nodo <T> aux= getNode(cont-1);
			nodo_act.setSiguiente(aux);
			nodo_act= aux;
			cont--;
		}
		inicio = pri_n;
		fin= nodo_act;
		fin.setSiguiente(null);
	}
	
	private Nodo<T> getNode(int posicion){
		if(isEmpty() || (posicion <0 || posicion >= tamanio)) {
			return null;
		} else if(posicion == 0) {
			return inicio;
		} else if(posicion == tamanio - 1) {
			return fin;
		} else {
			Nodo <T> buscando = inicio;
			
			int cont=0;
			while (cont < posicion) {
				cont++;
				buscando = buscando.getSiguiente();
			}
			
			return buscando;
		}
	}
	public boolean insertAt(int posicion, T dato ) {
		if(posicion == 0) {
			pushFront(dato);
		} else if(posicion == tamanio) {
			pushBack(dato);
		} else if((posicion < 0 || posicion >= tamanio)) {
			return false;
		} else {
			Nodo <T> buscar_ant= getNode(posicion -1);
			Nodo <T> buscar_act= getNode(posicion);
			
			Nodo <T> aux= new Nodo<>(dato, buscar_act);
			
			buscar_ant.setSiguiente(aux);
			
			tamanio++;
			return true;
		}
		return true;// inserta un dato en la posici ́on indicada.
	}
	
	//Eliminar por posicion
	public boolean eraseAt(int posicion) {
		if(posicion < 0 || posicion >= tamanio || isEmpty()) {
			return false;
		}
		Nodo <T> nodo_ant;
		
		if(posicion == 0) {
			inicio = inicio.getSiguiente();
		} else if(posicion == tamanio -1) {
			nodo_ant=getNode(posicion-1);
			nodo_ant.setSiguiente(null);
		}
		else {
			nodo_ant=getNode(posicion-1);
			Nodo<T> nodo_sig=getNode(posicion+1);
			nodo_ant.setSiguiente(nodo_sig);
		}
		
		tamanio--;
		return true;
	}
	
	
	public boolean isEmpty( ) {
		return tamanio==0;// verificar si la lista esta o no vac ́ıa.
	}
	public void empty() {
		while(inicio != null)
			inicio= inicio.getSiguiente();
		tamanio=0;
		fin=null;
	}
	public int search(T dato) {
		if(isEmpty()) {
			return -1;
		}
		Nodo<T> aux = inicio;
		int i=0;
		
		while(aux!=null) {
			if(dato.equals(aux.getDato())){
				return i;
			}else {
				aux = aux.getSiguiente();
			}
			i++;
		}
		return -1;
	}
	
	
	public T searchAt( int posicion) { 
		Nodo<T> devolver= getNodo(posicion);
		return devolver!= null?devolver.getDato():null;
	}
	
	
	public  int size() {
		return tamanio;
	}
	public Nodo<T> getNodo(int indice) {
		
        if (inicio==null || (indice < 0 || indice >= tamanio ))
            return null;
        else if (indice == 0) 
            return inicio; 
        	else if (indice == tamanio -1) 
        		return fin; 
        		 else {
 
		            Nodo<T> devolver = inicio;
		            int contador = 0;
		            while (contador < indice) {
		                contador++;
		                devolver =devolver.getSiguiente();
		            }
		            return devolver;
        		}
           
	}
	
	
	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}
	protected class MyIterator implements Iterator<T>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
	
	

}
