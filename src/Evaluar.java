import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {

	@Test
	public void ejercicio1() {
		assertEquals("Error ejecutando ejercicio1(6)", 8, Ejercicios.ejercicio1(6));
		assertEquals("Error ejecutando ejercicio1(5)", 5, Ejercicios.ejercicio1(5));
		assertEquals("Error ejecutando ejercicio1(7)", 13, Ejercicios.ejercicio1(7));
	}
	
	@Test
	public void ejercicio2() {
		assertEquals("Error ejecutando ejercicio2(6)", 2, Ejercicios.ejercicio2(6));
		assertEquals("Error ejecutando ejercicio2(5)", -1, Ejercicios.ejercicio2(5));
		assertEquals("Error ejecutando Tejercicio2(7)", 3, Ejercicios.ejercicio2(7));
	}
	
	@Test
	public void ejercicio3() {
		assertEquals("Error ejecutando ejercicio3(6)", 16788, Ejercicios.ejercicio3(6));
		assertEquals("Error ejecutando ejercicio3(5)", 467, Ejercicios.ejercicio3(5));
		assertEquals("Error ejecutando ejercicio3(7)", 7839541, Ejercicios.ejercicio3(7));
	}

}
