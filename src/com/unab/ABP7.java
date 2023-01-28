	package com.unab;

import java.util.Scanner;

/*
	 * Desarrolle un programa en lenguaje Java tal que, al ingresar una cadena de texto
	o String por teclado,
	tome dicha cadena y la lea carácter por carácter, y los despliegue por consola.
	Al finalizar el programa, debe ser indicar la cantidad de vocales y la cantidad
	 de consonantes.
	
	Nota 1: Se debe validar que la cadena ingresada no esté vacía; si eso sucede, debe pedirlo nuevamente.
	Nota 2: Recuerde que para obtener un carácter de un String puede usar el método CharAt.
	 */
	public class ABP7 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner entrada = new Scanner(System.in);
			
			String palabra;
			int vocales = 0;
			int consonantes = 0;
			
			// deberia meter un loop para que me lea todas las letras 
			// o desglozar todas las palabras....????
			// no olvidar el charAt
			boolean proceso = true;
			while (proceso) {
				System.out.print("Escriba una palabra:" );
				palabra = entrada.nextLine();
				
				if (palabra.length() > 0) {
					//Hacer el loop para que recorra la palabra...
					
					for(int i = 0; i < palabra.length(); i++) {
						 char c = palabra.charAt(i);// variable ejemplo para que separe
						System.out.print(c + " ");
						
						if (c == 'a'|| c =='e'|| c == 'i'|| c == 'o'|| c == 'u'||
							c == 'A'|| c =='E'|| c == 'I'|| c == 'O'|| c == 'U') {
							vocales++;
						}else if (Character.isLetter(c)) {// determina si el carácter especificado es una letra o no.
							consonantes++;
						}
					}
						
				System.out.println();
				System.out.println("Numero de vocales: " + vocales);
				System.out.println("Numero de consonantes: " + consonantes);
			}
				proceso = false;
		}
			
			
	}
		
	}
