package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.Lista;

public class TestLista {

	@Test
	public void testListaVacia() {
		
		Lista<Integer>lista = new Lista<>();
		assertEquals(true,lista.isEmpty());
	}
	@Test
	public void testInsertarInicio() {
		Lista<Integer>lista = new Lista<>();
		assertEquals(true, lista.pushFront(10));
	}
	
	@Test
	public void testInsertarFin() {
		Lista<Integer>lista = new Lista<>();
		assertEquals(true, lista.pushBack(10));
	}
	
	@Test
	public void testTamLista() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.pushBack(20);
		assertEquals(4, lista.size());
	}
	
	@Test
	public void testBuscarPorPosicion() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		assertEquals(Integer.valueOf(20), lista.searchAt(1));
		assertEquals(Integer.valueOf(10), lista.searchAt(0));
	}
	
	@Test
	public void testBuscarPorDato() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		assertEquals(Integer.valueOf(0), lista.search(10),0);
		assertEquals(Integer.valueOf(2),lista.search(40),0);
	}
	@Test
	public void testEliminarPorPosicion() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.eraseAt(1);
		assertEquals(-1, lista.search(20));
	}
	
	@Test
	public void testAgregarXPosicion() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.insertAt(1, 100);
		assertEquals(Integer.valueOf(1), lista.search(100),0);
	}
	
	@Test 
	public void testEliminarPorDato() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.remove(40);
		assertEquals(-1, lista.search(40));
	}
	
	@Test
	public void testEliminarPrimero() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.popFront();
		assertEquals(-1, lista.search(10));
	}
	@Test
	public void testEliminarUltimo() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.popBack();
		assertEquals(-1, lista.search(40));
	}
	
	@Test 
	public void testVaciarLista() {
		Lista<Integer>lista = new Lista<>();
		lista.pushBack(10);
		lista.pushBack(20);
		lista.pushBack(40);
		lista.empty();
		assertEquals(true, lista.isEmpty());
	}
	

}
