package testPilaColaEstatica;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.pila.cola.PilaDinamica;

public class TestPilaDinamica {

	@Test
	public void testPilaDinamicaVacia() {
		PilaDinamica<Integer> pila = new PilaDinamica<>();
		assertEquals(true,pila.isEmpty());
	}
	@Test
	public void testApilarDinamico() {
		PilaDinamica<Integer>pila = new PilaDinamica<>();
		assertEquals(true,pila.push(20));
	}
	
	@Test
	public void testVerTopeDinamico() {
		PilaDinamica<Integer>pila = new PilaDinamica<>();
		pila.push(20);
		pila.push(30);
		assertEquals(Integer.valueOf(30),pila.peek());
	}
	@Test
	public void testDesapilarDinamico() {
		PilaDinamica<Integer>pila = new PilaDinamica<>();
		pila.push(10);
		pila.push(50);
		assertEquals(Integer.valueOf(50), pila.pop());
	}
	@Test
	public void testVaciarPilaDinamico() {
		PilaDinamica<Integer>pila = new PilaDinamica<>();
		pila.push(10);
		pila.push(50);
		pila.push(70);
		pila.empty();
		assertEquals(true, pila.isEmpty());
	}
}	
