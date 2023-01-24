/**
 * 
 */
package com.unab;

import java.util.Scanner;


 //_________________ manera 1____________________ 
 /*public class ABP5 {
  
  public static void main(String[] args) {
  
  
  Scanner entrada =new Scanner(System.in);
  
  System.out.println("Ingresa el primer operando:"); 
 double n1 = entrada.nextDouble();
  
  System.out.println("Ingresa el segundo operando:"); 
  double n2 = entrada.nextDouble();
  
  System.out.println("Ingresa la operación a realizar (+, -, *, /):");
  char operacion = entrada.next().charAt(0);
  
  double resultado = 0; 
  switch (operacion) { 
  case '+': resultado = n1 + n2;
  break; 
  case '-': resultado = n1 - n2; 
  break; 
  case '*': resultado = n1 * n2;
  break; 
  case '/': resultado = n1 / n2; 
  break; 
  case '%': resultado = n1 % n2;
  break; 
  default: 
	  System.out.println("Operación no válida."); break; }
  
  System.out.println("El resultado es: " + resultado); 
  
  } }
   
 //______________si  funciona____________
*/

// ______________________manera 2_______________


public class ABP5 {

	static int sumar(int a, int b) {
		return a + b;
	}

	static int restar(int a, int b) {
		return a - b;
	}

	static int multiplicar(int a, int b) {
		return a * b;
	}

	static double dividir(double a, double b) {// double o float
		if (b == 0) {
			System.out.println("No se puede dividir por cero");
			return Double.NaN; // instruccion de devolucion, para que diga que no devuelve un numero valido
		}
		return a / b;
	}

	static int modulo(int a, int b) {
		return a % b;
	}
//________________________________
	static void menuConsola() {
		        System.out.println("Seleccione una operacion matematica: ");
		        System.out.println("1. Suma (+) ");
		        System.out.println("2. Resta (-) ");
		        System.out.println("3. Multiplicacion (x) ");
		        System.out.println("4. Division (/) ");
		        System.out.println("5. Modulo o Residuo (%) ");
	}
//________________________________
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		while (true) {
			menuConsola();
			int opcion = entrada.nextInt();

			double valor1, valor2;
			System.out.println("Ingrese valor 1: ");
			valor1 = entrada.nextDouble();

			System.out.println("Ingrese valor 2: ");
			valor2 = entrada.nextDouble();

			switch (opcion) {
			case 1:
				System.out.println("Resultado: " + sumar((int) valor1, (int) valor2));
				break;
			case 2:
				System.out.println("Resultado: " + restar((int) valor1, (int) valor2));
				break;
			case 3:
				System.out.println("Resultado: " + multiplicar((int) valor1, (int) valor2));
				break;
			case 4:
				System.out.println("Resultado: " + dividir(valor1, valor2));
				break;
			case 5:
				if (valor2 == 0) {
					System.out.println("No se puede dividir por cero");
				} else {
					System.out.println("Resultado: " + modulo((int) valor1, (int) valor2));
				}
				break;
			default:
				System.out.println("Opcion invalida, intente de nuevo");
			}
		}
	}
}