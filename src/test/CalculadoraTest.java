package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Calculadora;

public class CalculadoraTest {

	@Test
	public void somaTest() {
		Calculadora c = new Calculadora();
		double valorA = 5;
		double valorB = 10;
		double valorEsperado = 15;
		double valorRetornado = c.soma(valorA, valorB);

		assertEquals(valorEsperado, valorRetornado, 0);

	}
}
