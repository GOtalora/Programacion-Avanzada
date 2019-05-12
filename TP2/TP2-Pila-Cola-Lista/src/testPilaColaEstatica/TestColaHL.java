package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.ColaHL;

public class TestColaHL {

	@Test
	public void testColaHLVacia() {
		ColaHL<Integer> cola = new ColaHL<>();
		assertEquals(true, cola.isEmpty());
	}
	@Test
	public void testAcolarHL() {
		ColaHL<Integer> cola = new ColaHL<>();
		assertEquals(true, cola.offer(20));
	}
	
	@Test
	public void testDescolarHL() {
		ColaHL<Integer> cola = new ColaHL<>();
		cola.offer(30);
		cola.offer(20);
		assertEquals(Integer.valueOf(30), cola.poll());
	}
	@Test
	public void testVerFrenteHL() {
		ColaHL<Integer> cola = new ColaHL<>();
		cola.offer(40);
		cola.offer(20);
		assertEquals(Integer.valueOf(40), cola.peek());
	}
	@Test
	public void testVaciarColaHL() {
		ColaHL<Integer> cola = new ColaHL<>();
		cola.offer(40);
		cola.offer(20);
		cola.offer(40);
		cola.offer(20);
		cola.empty();
		assertEquals(true, cola.isEmpty());
	}

}
