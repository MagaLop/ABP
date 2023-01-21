/**
 * 
 */
package com.unab;

import java.util.Scanner;
// manera 1
public class ABP5 {
		
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
        case '+':
            resultado = n1 + n2;
            break;
        case '-':
            resultado = n1 - n2;
            break;
        case '*':
            resultado = n1 * n2;
            break;
        case '/':
            resultado = n1 / n2;
            break;
        case '%':
            resultado = n1 % n2;
            break;    
        default:
            System.out.println("Operación no válida.");
            break;
    }

    System.out.println("El resultado es: " + resultado);
}
}

//manera 2

/** 
public class ABP5 {

	//___________
	static int sumar(int a, int b) {
		return a+b;
	}
	static int sumar(int a) {
		return sumar(a,0);
	}
	static void sumarConsola(int a, int b) {
		System.out.println(sumar(a,b));
	}
	//____________
	static int restar(int a, int b) {
		return a-b;
	}
	static int restar(int a) {
		return restar(a,0);
	}
	static void restarConsola(int a, int b) {
		System.out.println(restar(a,b));
	}
	//____________
	static int multiplicar(int a, int b) {
		return a*b;
	}
	static int multiplicar(int a) {
		return multiplicar(a,0);
	}
	static void multiplicarConsola(int a, int b) {
		System.out.println(multiplicar(a,b));
	}
	//____________
	static int dividir(int a, int b) {
		return a/b;
	}
	static int dividir(int a) {
		return dividir(a,0);
	}
	static void dividirConsola(int a, int b) {
		System.out.println(dividir(a,b));
	}
	//____________
	static int modulo(int a, int b) {
		return a%b;
	}
	static int modulo(int a) {
		return modulo(a,0);
	}
	static void moduloConsola(int a, int b) {
		System.out.println(modulo(a,b));
	}
	//____________
	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
	//____________	
		System.out.println(sumar(15,21));
		System.out.println(restar(15,21));
		System.out.println(multiplicar(15,21));
		System.out.println(dividir(15,21));
		System.out.println(modulo(15,21));
	//____________	
	
		int valor1, valor2;
		System.out.println("Ingrese valor 1: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Ingrese valor 2: ");
		valor2 = entrada.nextInt();
	//____________
		
		System.out.println(sumar(valor1));
		System.out.println(restar(valor1));
		System.out.println(multiplicar(valor1));
		System.out.println(dividir(valor1));
		System.out.println(modulo(valor1));
	//____________	
		}

}
*/