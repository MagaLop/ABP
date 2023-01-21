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
		String afp;
		int rut;
		int telefono = 0;
		int sistema_de_salud;
		
		String direccion;
		String comuna;
		int edad = 0;
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingrese Los datos del cliente");
		
		System.out.println("Nombre: ");
		 nombre = entrada.nextLine();
		 
		System.out.println("Apellido: ");
		 apellido = entrada.nextLine();
		 
		//____________________________________
		
		 System.out.println("rut (Sin puntos ni digito verificador): ");
		 rut = Integer.valueOf(entrada.nextLine());
		 if (rut < 0 || rut > 99999999) {
			 System.out.println("Rut inválido. ");
		

		
			 
	//______________________________________________		 
		System.out.println("Ingrese su número de teléfono: ");
		System.out.print("+56 9 ");
		 telefono = Integer.valueOf(entrada.nextLine()); 
		 if (telefono < 0 || telefono > 99999999) {
			 System.out.println("Número Incorrecto. ");
		 }
			 
		 
		 /*
		 while (telefono < 0 || telefono > 99999999) {
			    System.out.println("Número Incorrecto, ingresa de nuevo: +56 9 ");
			    telefono = Integer.valueOf(entrada.nextLine());
			}
		 
		 System.out.println(" ");
		 telefono = Integer.valueOf(entrada.nextLine());
		 while (telefono < 10000000 || telefono > 99999999) {
		     System.out.println("Número Incorrecto, ingresa de nuevo con 8 digitos: +56 9 ");
		     telefono = Integer.valueOf(entrada.nextLine());
		 }
		 System.out.println("Teléfono: +56 9  ");
		 String telefonoInput = entrada.nextLine();
		 while (!telefonoInput.matches("[0-9]+") || telefonoInput.length() != 8) {
		     System.out.println("Número Incorrecto, ingresa de nuevo con 8 digitos: +56 9 ");
		     telefonoInput = entrada.nextLine();
		 }
		 telefono = Integer.valueOf(telefonoInput);
		 */
		 //_______________________________________
		 System.out.println("Ingrese su AFP: ");
		 afp = entrada.nextLine();
		 //__________________________________________
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
		 
		int isapre= 1;
		int fonasa= 2;
		 System.out.println("Sistema de Salud: Ingrese 1 para Isapre o 2 para Isapre: ");
		  sistema_de_salud= Integer.valueOf(entrada.nextLine());
		  
		  
				 
		  if (sistema_de_salud == 1 || sistema_de_salud == 2) {
		//	  System.out.println("Isapre");
		// }else if (sistema_de_salud == 2) {
		//	  System.out.println("Fonasa");
		 }else {
			 System.out.println("Ingrese la opción válida.");
			 sistema_de_salud = Integer.valueOf(entrada.nextLine()); 
		 }

		 // entrada.nextLine();
		 //_____________________________________________
		  System.out.println("Ingresa tu edad");
		  edad = Integer.valueOf(entrada.nextLine());
		  
		  if (edad <= 0 || edad > 120) {
			    System.out.println("edad incorrecta");
			 } 
		  
			 while (edad <= 0 || edad > 120) {
			    System.out.println("Edad Incorrecta, ingresa de nuevo:");
			    edad = Integer.valueOf(entrada.nextLine());
			}

			//____________________________________________
			 //entrada.nextLine();
			  System.out.println("Dirección:(no mas de 50 caracteres) ");
			  direccion = entrada.nextLine();
			  
			     while ( direccion.length() > 50) {
			     System.out.println("Ingresa tu direccion nuevamente");
			     direccion = entrada.nextLine();
			  }
			  
			  /*
			     if(direccion.length()>0 && direccion.length()<=50) {}
			  else
				  System.out.println("Ingresa tu direccion nuevamente");
				  direccion = entrada.nextLine();
			
			  */
			 
		 
		//  while (direccion.length() <= 0 || direccion.length() > 50) {
		//  System.out.println("La dirección debe tener entre 1 y 50 caracteres. Ingrese nuevamente:");
		//  direccion = entrada.nextLine();
		//  }

		  
				  	  
			//________________________________________________
			  System.out.println("Comuna: ");
			  comuna = entrada.nextLine();
			 
			  /*if (comuna.length() !=0) {
				  
			  }else {
				  System.out.println("Ingrese tu comuna nuevamente. ");
			  }
			  */
			 
			  while (comuna.length() == 0) {
			  System.out.println("Debe ingresar una comuna. Ingrese nuevamente:");
			  comuna = entrada.nextLine();
			  }
			  
			  //______________________________________________
System.out.println("_______________");
System.out.println("_______________");


System.out.println("Sus datos recopilados son:");


System.out.println("Rut: " + rut);
System.out.println("Nombre completo: " + nombre + apellido);
System.out.println("Teléfono: +56 9 " + telefono);
System.out.println("AFP: " + afp);

if (sistema_de_salud == 1) {
	System.out.println("Sistema de Salud: Isapre "); 
}else if(sistema_de_salud == 2){
	System.out.println("Sistema de Salud: Fonasa "); 
}

System.out.println("Dirección: " + direccion);
System.out.println("Comuna: " + comuna);
System.out.println("Edad: " + edad);

System.out.println("_______________");
System.out.println("_______________");
}
}
}