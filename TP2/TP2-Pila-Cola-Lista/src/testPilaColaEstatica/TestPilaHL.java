package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.PilaHL;

public class TestPilaHL {

	@Test
	public void testPilaHLVacia() {
		PilaHL<Integer> pila = new PilaHL<>();
		assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void testInsertarPilaHL() {
		PilaHL<Integer> pila = new PilaHL<>();
		assertEquals(true, pila.push(20));
	}
	
	@Test
	public void testEliminarPilaHL() {
		PilaHL<Integer> pila = new PilaHL<>();
		pila.push(20);
		pila.push(60);
		assertEquals(Integer.valueOf(60), pila.pop());
	}
	@Test
	public void verTopePilaHL() {
		PilaHL<Integer> pila = new PilaHL<>();
		pila.push(20);
		pila.push(60);
		assertEquals(Integer.valueOf(60), pila.peek());
	}
}
