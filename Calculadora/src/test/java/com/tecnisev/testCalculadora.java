package com.tecnisev;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculadora 
{	
	@Test
	public void testSumar() 
	{
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.sumar(10, 20);
		
		assertEquals(resultado, 30, 0); // El valor 0 es el denominado factor delta, que se utiliza para operaciones de c‡lculo en coma flotante en la que
		                                // se considera que el test se cumple si est‡ entre resultado-delta y resultado+delta
	}
}