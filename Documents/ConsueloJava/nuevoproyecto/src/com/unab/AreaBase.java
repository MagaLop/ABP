package com.unab;
import java.util.Scanner;
public class AreaBase {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Menú");
		System.out.println ("----------");
		System.out.println ("1. Área cuadrado");
		System.out.println ("2. Área triángulo");
		
		int opcion = Integer.valueOf(entrada.nextLine());
		//puede ser tambien b= entrada.nextInt() en ves de la linea de arriba, lee el entero en vez de leer la linea entera.
		int area;
		
		
		switch (opcion)
		
	{
		case 1:
			//area cuadrado
			int lado;
			System.out.println("Ingrese el valor del lado: ");
			lado = Integer.valueOf(entrada.nextLine());
			area = lado * lado;
			System.out.println("El Área es: " + area);
			
			
			
			break;
			
		case 2:
			
			 //Area Triángulo
			int base;
	        int altura;
	        
	        System.out.println("Ingrese el valor de la base: ");
	        base = Integer.valueOf(entrada.nextLine());
	        
	        System.out.println("Ingrese el valor de la altura: ");
	        altura = Integer.valueOf(entrada.nextLine());
	        
	        area = base * altura / 2;
	        
	        System.out.println("El Área es: " + area);
	        
	        //Fin Area Triangulo
	        
	  break;
	  
default: 
	System.out.println("Opción invalida ");
	        
	}
		
		
		
		
		

	}

}
