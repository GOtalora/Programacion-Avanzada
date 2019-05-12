package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.ColaEstatica;

public class TestColaEstatica {

	@Test
	public void testColaVacia() {
		ColaEstatica<Integer> cola = new ColaEstatica<Integer>(0);
		assertEquals(true,cola.isEmpty());
	}
	
	@Test
	public void testEncolarEstatica() {
		ColaEstatica<Integer> cola = new ColaEstatica<Integer>(1);
		assertEquals(true,cola.offer(20));
	}
	
	@Test
	public void testVerFrenteColaEstatica() {
		ColaEstatica<Integer> cola = new ColaEstatica<Integer>(3);
		cola.offer(20);
		cola.offer(30);
		cola.offer(40);
		assertEquals(Integer.valueOf(20),cola.peek());
	}
	@Test
	public void testDescolarEstatica() {
		ColaEstatica<Integer> cola = new ColaEstatica<Integer>(2);
		cola.offer(20);
		cola.offer(30);
		assertEquals(Integer.valueOf(20),cola.poll());
	}
	@Test
	public void testVaciarColaEstatica() {
		ColaEstatica<Integer> cola = new ColaEstatica<Integer>(4);
		cola.offer(20);
		cola.offer(50);
		cola.offer(60);
		cola.offer(30);
		cola.empty();
		assertEquals(true, cola.isEmpty());
	}
}
