/**
 * 
 */
package com.unab;

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
		String leer;
		
		if (cumple == lee)(true)  {
		    System.out.println("No sufrirá incidentes");
		} else {
		    System.out.println("Ocurrirá un accidente");
		}
		*/
		//________________________________
		// hacer todo de nuevo con sistema booleano
		
		String trabajador;
		
		//String lee;
		//String cumple;
		String leer;
		
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
        
        
	}
        
}
