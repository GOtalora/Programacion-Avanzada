package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.PilaEstatica;

public class TestPilaEstatica {

	
	
	@Test
	public void testPilaEstaticaVacia() {
		PilaEstatica<Integer> pila = new PilaEstatica<Integer>(1);
		assertEquals(true, pila.isEmpty());
		assertEquals(true,pila.push(20));
		
	}
	
	@Test
	public void testApilarEstatica() {
		PilaEstatica<Integer> pila = new PilaEstatica<Integer>(1);
		assertEquals(true,pila.push(20));
	}
	
	@Test
	public void testVerTopeEstatica() {
		PilaEstatica<Integer> pila = new PilaEstatica<Integer>(1);
		pila.push(20);
		assertEquals(Integer.valueOf(20),pila.peek());
	}
	
	@Test
	public void testDesapilarEstatica() {
		PilaEstatica<Integer> pila = new PilaEstatica<Integer>(3);
		pila.push(20);
		pila.push(30);
		pila.push(50);
		assertEquals(Integer.valueOf(50), pila.pop());
		assertEquals(Integer.valueOf(30), pila.peek());
	}
	
	@Test
	public void testVaciarPilaEstatica() {
		PilaEstatica<Integer> pila = new PilaEstatica<Integer>(3);
		pila.push(30);
		pila.push(50);
		pila.push(50);
		pila.empty();
		assertEquals(true,pila.isEmpty());
	}
}
