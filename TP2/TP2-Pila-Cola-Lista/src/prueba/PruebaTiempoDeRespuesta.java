package prueba;

import interfaces.pila.cola.ColaDinamica;
import interfaces.pila.cola.ColaEstatica;
import interfaces.pila.cola.PilaDinamica;
import interfaces.pila.cola.PilaEstatica;

// B. Apile 1000000 de Integers en una PilaEstatica y en una PilaDinamica y compare los tiempos de
// 	  	respuesta de estas operaciones en ambos dise ̃nos. Graficar.
// C. Idem para ColaEstatica y Coladinamica.

public class PruebaTiempoDeRespuesta {
	
	public static void main(String[] args) {
		
 
		PilaEstatica<Integer> pila_uno = new PilaEstatica<>(1000000);
		PilaDinamica<Integer> pila_dos = new PilaDinamica<>();
		ColaEstatica<Integer> cola_uno = new ColaEstatica<>(1000000);
		ColaDinamica<Integer> cola_dos = new ColaDinamica<>();
		
		long startTime,endTime;
		
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i<1000000;i++) {
			pila_dos.push(i+1);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion Pila Dinamica: " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i<1000000;i++) {
			pila_uno.push(i+1);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion Pila Estatica: "  + (endTime-startTime));
		System.out.println();
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i<1000000;i++) {
			cola_uno.offer(i+1);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion Cola Estatica: " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i<1000000;i++) {
			cola_dos.offer(i+1);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion Cola Dinamica: " + (endTime-startTime));
		
	}
	
}
