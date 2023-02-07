/**
 * 
 */
package com.unab;

import java.util.Scanner;

/**
 * @author vespertino
 *
 */
public class AE1_ABP {

	/**
	 * Una compañía de seguros requiere generar un algoritmo que permita rescatar los datos básicos de
sus clientes, validarlos, y presentarlos por pantalla.

	 * - RUT: corresponde a un número menor a 99.999.999
- Nombres: campo obligatorio
- Apellidos: campo obligatorio
- Teléfono: no más de 15 caracteres
- AFP: campo obligatorio
- Sistema de salud: 1 (Fonasa) o 2 (Isapre), solo puede ser uno de ambos valores
- Dirección: texto no superior a 50 caracteres
- Comuna: campo obligatorio
- Edad: menor a 120 años
	 */
	public static void main(String[] args) {
		//entrada.nextLine(); limpia entrada de buffer o crear otro scanner con otro nombre
		//meter loop para reingresar datos
		
		String nombre;
		String apellido;
		int rut;
		int telefono;
		int sistema_de_salud;
		
		String direccion;
		String comuna;
		int edad;
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingrese Los datos del cliente");
		
		System.out.println("Nombre: ");
		 nombre = entrada.nextLine();
		 
		System.out.println("Apellido: ");
		 apellido = entrada.nextLine();
		
		System.out.println("rut (Sin puntos ni digito verificador): ");
		 rut = Integer.valueOf(entrada.nextLine());
		 if (rut < 0 || rut > 99999999) {
			 System.out.println("Rut inválido. ");
		 }
		
		 		 
		System.out.println("Teléfono: +56 9  ");
		 telefono = Integer.valueOf(entrada.nextLine()); 
		 if (telefono < 0 || telefono > 99999999) {
			 System.out.println("Número Incorrecto. ");
		 }
		 
		 
		
		 
		/* switch (afp)
				
				{
					case "Isapre":
						//isapre
						
						System.out.println("Isapre " );
						
						break;
						
					case "Fonasa":
						//fonasa
						
						System.out.println("Fonasa " );		
		 
						break;
				}
		 */
		 
		
		 System.out.println("Sistema de Salud: Ingrese 1 para Isapre o 2 para Isapre: ");
		  sistema_de_salud= Integer.valueOf(entrada.nextLine());
		  
		  
				 
		  if (sistema_de_salud == 1) {
			  System.out.println("Isapre");
		 }else if (sistema_de_salud == 2) {
			  System.out.println("Fonasa");
		 }else {
			 System.out.println("Ingrese la opción válida.");
		 }

			  
			 System.out.println("Edad: ");
			  edad = Integer.valueOf(entrada.nextLine());
			  
			  if (edad>120) {
				  System.out.println("Edad Incorrecta");
			  }
			  
			
			  
			  System.out.println("Difrección: ");
			  direccion = entrada.nextLine(); 

			
			  System.out.println("Comuna: ");
			  comuna = entrada.nextLine();
			  
			  
System.out.println("_______________");
System.out.println("_______________");


System.out.println("Datos Reunidos");


System.out.println("Rut: " + rut);
System.out.println("Nombre y Apellido: " + nombre + apellido);
System.out.println("Teléfono: +56 9" + telefono);
System.out.println("Sistema de Salud: " + sistema_de_salud);
System.out.println("Dirección: " + direccion);
System.out.println("Comuna: " + comuna);
System.out.println("Edad: " + edad);

	}

	
}