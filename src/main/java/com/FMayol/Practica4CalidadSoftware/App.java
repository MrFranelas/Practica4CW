package com.FMayol.Practica4CalidadSoftware;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {

	public static int suma(int a, int b) {
		int resultado = a + b;
		System.out.println("Metodo suma: " + resultado);
		return resultado;
	}

	public static boolean comprobarUno(int a, int b) {
		boolean resultado;
		if ((a * b) < 50) {
			resultado = true;
		} else {
			resultado = false;
		}
		System.out.println("Metodo comprobarUno: " + resultado);
		return resultado;
	}

	public static boolean comprobarDos(int a, int b) {
		boolean resultado;
		if ((a % b) == 0) {
			resultado = false;
		} else {
			resultado = true;
		}
		System.out.println("Metodo comprobarDos: " + resultado);
		return resultado;
	}

	public static String listaNombres(String a, String b) {
		String resultado = "";
		resultado += a;
		resultado += b;
		System.out.println("Metodo listaNombres: " + resultado);
		return resultado;
	}

	public static String listaAnimales(String a, String b) {
		String resultado = "";
		if (a != b) {
			resultado = null;
		} else {
			resultado += a;
			resultado += b;
		}
		System.out.println("Metodo listaAnimales: " + resultado);
		return resultado;
	}

	public static Integer numerosUno(Integer a, Integer b) {
		Integer resultado = 0;
		a = b;
		resultado = b;
		System.out.println("Metodo numerosUno: " + resultado);
		return resultado;
	}

	public static Integer numerosDos(Integer a, Integer b) {
		Integer resultado = 0;
		a = b + 1;
		resultado = b;
		System.out.println("Metodo numerosDos: " + resultado);
		return resultado;
	}

	public static String[] lista(String a) {
		String[] resultado = { "Carlos", "paco" };
		if (a == "PACO") {
			String[] resultado2 = { "PACO", "mer" };
			System.out.println("Metodo lista: " + Arrays.toString(resultado2));
			return resultado2;
		}
		System.out.println("Metodo lista: " + Arrays.toString(resultado));
		return resultado;
	}

	public static int resta(int a, int b) {
		int resultado = a - b;
		System.out.println("Metodo: resta: " + resultado);
		return resultado;
	}

	public static void main(String[] args) {
		
		suma(0, 0);
		comprobarUno(0, 0);
		comprobarDos(8, 8);
		listaNombres(null, null);
		listaAnimales(null, null);
		numerosUno(null, null);
		numerosDos(1, 1);
		lista(null);
		resta(0, 0);
	}
}
