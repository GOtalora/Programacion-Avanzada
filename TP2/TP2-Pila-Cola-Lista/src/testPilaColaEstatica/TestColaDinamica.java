package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.ColaDinamica;

public class TestColaDinamica {

	@Test
	public void testColaDinamicaVacia() {
		
		ColaDinamica<Integer>cola = new ColaDinamica<>();
		assertEquals(true, cola.isEmpty());
	}
	
	@Test
	public void testAcolarDinamico() {
		ColaDinamica<Integer>cola = new ColaDinamica<>();
		assertEquals(true, cola.offer(20));
	}
	
	@Test
	public void testVerFrenteDinamico() {
		ColaDinamica<Integer>cola = new ColaDinamica<>();
		cola.offer(20);
		cola.offer(30);
		assertEquals(Integer.valueOf(20), cola.peek());
	}
	@Test
	public void testDescolarDinamico() {
		ColaDinamica<Integer>cola = new ColaDinamica<>();
		cola.offer(20);
		cola.offer(30);
		assertEquals(Integer.valueOf(20), cola.poll());
		assertEquals(Integer.valueOf(30), cola.peek());
	}
	
	@Test
	public void testVaciarColaDinamica() {
		ColaDinamica<Integer>cola = new ColaDinamica<>();
		cola.offer(20);
		cola.offer(30);
		cola.offer(40);
		cola.offer(50);
		cola.empty();
		assertEquals(true, cola.isEmpty());
	}
}
