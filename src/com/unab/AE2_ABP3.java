/**
 * 
 */
package com.unab;

import java.util.Scanner;

/**
 * @author vespertino
 *
 */
public class AE2_ABP3 {

	/**
	 if Trabajador < cuida los procedimientos de seguridad y leer manual de seguridad> entonces
		
		No sufrirá incidentes
	
	else 
		
		Ocurrirá un accidente
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	
  String cumple = Cumple_Procedimiento_Seguridad;
  String leer = Leer_Manual_Seguridad;		
*/
		// hacer todo de nuevo con sistema booleano
		/*
		String trabajador;
		
		String lee;
		String cumple;
		
		
		if (cumple && lee)(true)  {
		    System.out.println("No sufrirá incidentes");
		} else {
		    System.out.println("Ocurrirá un accidente");
		}
		*/
		
		//Desde aqui funciona.... ocupar equals
		
        Scanner entrada = new Scanner(System.in);

		String lee;
		String cumple;
		
		System.out.println("Cumple los Procedimiento de Seguridad? (escriba si o no):");
		cumple = entrada.nextLine();
		
		System.out.println("Lee el Manual de Seguridad Interna?(escriba si o No): ");
		lee = entrada.nextLine();
		
		if (cumple.equalsIgnoreCase("si") && lee.equalsIgnoreCase("si")) {
            System.out.println("El trabajador ha seguido todos los procedimientos de seguridad y ha leído el manual de seguridad interno.");
        } else {
            System.out.println("Ocurrirá un accidente. ");
        }
		
		
		//hasta aca
		
		
		
		
		
		
		//________________________________
		// hacer todo de nuevo con sistema booleano
		// manera 1
		
		/*
		boolean cumple;
        cumple = false;
       // System.out.println("Cumple Procedimiento Seguridad: " + cumple);
        
        cumple = true;
       // System.out.println("Cumple Procedimiento Seguridad: " + cumple);
        
        if (cumple == true) {
            System.out.println("Cumple Procedimiento Seguridad");
				 }
        
        
        boolean lee;
        lee = false;
      //  System.out.println("Lee Manual Seguridad: " + lee);
        
        lee = true;
      //  System.out.println("Lee Manual Seguridad: " + lee);
        
        if (lee == true) {
            System.out.println("Lee Manual Seguridad");
        }
       */ 
        //__________________
        //manera2
        /*
         * “Si un trabajador no cuida los procedimientos de seguridad, ocurrirá un accidente. Si el trabajador
no lee el manual de seguridad interno sucedería lo mismo. El trabajador no ha sufrido incidentes.
De ahí concluimos que ha seguido todos los procedimientos de seguridad, y ha leído el manual de
seguridad interno”.
         */
		//char 'Y';
	//	char 'N';
		
	//	boolean cumple = ();
      //  boolean lee = ();
	}
        
}
