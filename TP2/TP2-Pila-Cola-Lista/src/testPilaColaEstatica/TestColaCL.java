package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.ColaCL;

public class TestColaCL {

	@Test
	public void testColaHLVacia() {
		ColaCL<Integer> cola = new ColaCL<>();
		assertEquals(true, cola.isEmpty());
	}
	@Test
	public void testInsertarColaCL() {
		ColaCL<Integer> cola = new ColaCL<>();
		assertEquals(true, cola.offer(20));
	}
	@Test
	public void testDescolarCL() {
		ColaCL<Integer> cola = new ColaCL<>();
		cola.offer(20);
		cola.offer(40);
		cola.offer(60);
		assertEquals(Integer.valueOf(20), cola.poll());
	}
	@Test 
	public void testVerFrenteColaCL() {
		ColaCL<Integer> cola = new ColaCL<>();
		cola.offer(20);
		cola.offer(40);
		assertEquals(Integer.valueOf(20), cola.peek());
	}
	@Test
	public void testVaciarColaCL() {
		ColaCL<Integer> cola = new ColaCL<>();
		cola.offer(20);
		cola.offer(40);
		cola.empty();
		assertEquals(true, cola.isEmpty());
	}
}
