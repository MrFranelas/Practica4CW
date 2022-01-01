package com.FMayol.Practica4CalidadSoftware;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;




/**
 * Unit test for simple App.
 */

/*
public class AppTest 
{
	@BeforeClass
	public static void antesClase() {
		System.out.println("A CONTINUACION SE PROBARAN TODOS LOS METODOS DE LA CLASE FUNCIONES: ");
		System.out.println("");
	}
	
	@Before
	public void antes() {
		System.out.println("PROBANDO METODO DE FUNCIONES: ");
	}
	
	@After
	public void despues() {
		System.out.println("METODO DE FUNCIONES PROBADO.");
		System.out.println(" ");
	}
	
	@AfterClass
	public static void despuesClase() {
		System.out.println("TODOS LOS METODOS DE LA CLASE FUNCIONES FUERON TESTEADOS.");
	}
	
	@Test
	public void sumaTest() {
		int resultado = App.suma(8, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testComprobarUno() {
		boolean resultado = App.comprobarUno(2, 10);
		assertTrue(resultado);
	}
	
	@Test
	public void testComprobarDos() {
		boolean resultado = App.comprobarDos(10, 2);
		assertFalse(resultado);
	}
	
	@Test
	public void testListaNombres() {
		String resultado = App.listaNombres("Paco", "Fran");
		assertNotNull(resultado);
	}
	
	@Test
	public void testListaAnimales() {
		String resultado = App.listaAnimales("gato", "gato");
		assertNull(resultado);
	}
	
	@Test
	public void testNumerosUno() {
		Integer resultado = App.numerosUno(9, 10);
		Integer esperado = 9;
		assertSame(esperado, resultado);
	}
	
	@Test
	public void testNumerosDos() {
		Integer resultado = App.numerosDos(9, 10);
		Integer esperado = 10;
		assertNotSame(esperado, resultado);
	}
	
	@Test
	public void testLista() {
		String[] resultado = App.lista("PACO");
		String[] esperado = {"PACO","rrer"};
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	@Ignore
	public void testResta() {
		int resultado = App.resta(2, 2);
		int esperado = 0;
		assertEquals(esperado, resultado);
	}
}
*/