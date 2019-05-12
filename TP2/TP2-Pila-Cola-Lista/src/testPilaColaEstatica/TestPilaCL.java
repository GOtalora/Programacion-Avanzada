package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.PilaCL;

public class TestPilaCL {

	@Test
	public void testPilaCLVacia() {
		PilaCL<Integer> pila = new PilaCL<>();
		assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void testInsertarPilaCL() {
		PilaCL<Integer> pila = new PilaCL<>();
		assertEquals(true, pila.push(20));
	}
	
	@Test
	public void testEliminarPilaCL() {
		PilaCL<Integer> pila = new PilaCL<>();
		pila.push(20);
		pila.push(30);
		assertEquals(Integer.valueOf(30), pila.pop());
	}
	@Test
	public void testVerTopePilaCL() {
		PilaCL<Integer> pila = new PilaCL<>();
		pila.push(20);
		pila.push(30);
		assertEquals(Integer.valueOf(30), pila.peek());
	}
	@Test
	public void testVaciarPilaCL() {
		PilaCL<Integer> pila = new PilaCL<>();
		pila.push(20);
		pila.push(30);
		pila.push(40);
		pila.empty();
		assertEquals(true, pila.isEmpty());
	}
}
