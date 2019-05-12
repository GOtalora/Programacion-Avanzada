package prueba;

import java.util.ArrayList;

import interfaces.pila.cola.Cola;
import interfaces.pila.cola.ColaCL;
import interfaces.pila.cola.ColaDinamica;
import interfaces.pila.cola.ColaEstatica;
import interfaces.pila.cola.ColaHL;
import interfaces.pila.cola.Pila;
import interfaces.pila.cola.PilaCL;
import interfaces.pila.cola.PilaDinamica;
import interfaces.pila.cola.PilaEstatica;
import interfaces.pila.cola.PilaHL;

public class PruebaPolimorfismo {
	
	public static void main(String[] args) {
		ArrayList<Pila<Integer>>pilas = new ArrayList<>();
		ArrayList<Cola<Integer>>colas = new ArrayList<>();
		Pila<Integer>pila_uno = new PilaEstatica<>(2);
		Pila<Integer>pila_dos = new PilaDinamica<>();
		Pila<Integer>pila_tres = new PilaCL<>();
		Pila<Integer>pila_cuatro= new PilaHL<>();
		int i=0;
		Cola<Integer>cola_uno = new ColaEstatica<>(2);
		Cola<Integer>cola_dos = new ColaDinamica<>();
		Cola<Integer>cola_tres = new ColaCL<>();
		Cola<Integer>cola_cuatro = new ColaHL<>();
		pilas.add(pila_uno);
		pilas.add(pila_dos);
		pilas.add(pila_tres);
		pilas.add(pila_cuatro);
		colas.add(cola_uno);
		colas.add(cola_dos);
		colas.add(cola_tres);
		colas.add(cola_cuatro);
		
		for (Pila<Integer> pila : pilas) {
			pila.push(i);
			i++;
		}
		for (Cola<Integer> cola : colas) {
			cola.offer(i);
			i++;
		}
		System.out.println("Frente de las diferentes colas");
		for (Cola<Integer> cola : colas) {
			System.out.println(cola.peek());
		}
		
		System.out.println("Topes de las distintas pilas");
		for (Pila<Integer> pila : pilas) {
			System.out.println(pila.peek());
		}
		
	}
}
