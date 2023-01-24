/**
 * 
 */
package com.unab;

import java.util.Scanner;

/**
 * @author vespertino
 *
 */
public class ABP6 {

	public static void main(String[] args) {

		// _____________metodo_1_________________
		String correctPassword = "BootCamp2023";
		Scanner entrada = new Scanner(System.in);

		String password;
		String nombre;

		System.out.print("Ingrese su nombre de usuario: ");
		nombre = entrada.nextLine();
		System.out.println("Hola " + nombre + "! tienes tres intentos para ingresar");
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingresa la contraseña: ");
			password = entrada.nextLine();
			if (password.equals(correctPassword)) {
				
				System.out.println("Has ingresado correctamente");
				break;
			} else if (i == 2) {
				System.out.println("Has alcanzado el límite de intentos permitidos");
			} else {
				System.out.println("La contraseña es incorrecta, intenta de nuevo");
			}
			}
	entrada.close();
		

		


		
		
		
		
		
		
		
		
	}
}
