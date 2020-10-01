package com.carol.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.carol.negocio.Calculo;

/**
 * 
 * @author carol
 *
 */
public class Vista {
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un nombre: ");
		String nombre = scan.next();
		
		Calculo calculo = new Calculo();
		
		System.out.println("El IMC de "+nombre+" es: "+calculo.calculoIMC(nombre));
	}
}
