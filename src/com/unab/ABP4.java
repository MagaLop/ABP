/**
 * 
 */
package com.unab;

/**
 * @author vespertino
 *
 */
public class ABP4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 Evalúe las siguientes expresiones lógicas, 
		 y determine su valor de verdad. En este punto no debe
		 usar ninguna ayuda tecnológica, solo las tablas de verdad
 		 indicadas en el material de apoyo.
 		 
 		 Pseudocodigo, segun yo.
		 a)True =  V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10))
		 b)False = V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3))
		 c)False = V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)
		 
		 Una vez que tenga la respuesta de todas ellas, traspáselas
		 a un archivo nuevo de Java y verifique
		 sus resultados. Para que el proceso sea transparente, 
		 en el pseudocódigo, a modo de comentario,
		 debe indicar si contestó correctamente el caso indicado.
		 */
		
		//osea el pcode seria:
		String cosas= "Hola mundo";
		
		boolean v1 = ('A' > 'B') || (cosas.length() == 10);
		boolean v2 = !((5 + 2) < 7) && !(7 > 9) || (3 < 5) && (4 == 3);
		boolean v3 = (2 * 3 + 5 - 7) > (2 * (2 + 5)) || ((10 - 5) < 20);
		
		// que pasa con la segunda linea que dice codigo muerto.
		
		System.out.println("v1: " + v1);
		// dice que es true, que es lo mismo que yo puse
		
		System.out.println("v2: " + v2);
		// dice que es true, y yo lo hice pensando que era falso,
		// pero cuando lo pense no tome en cuenta la negacion, y 
		// cuando lo pase a Pcode. me tomo como verdadero.
		
		System.out.println("v3: " + v2);
		// aqui yo pense que era falso, pero salio que es true
		// y no se porque, talvez puse algo mal.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
