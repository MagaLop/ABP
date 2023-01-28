package com.unab;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Escribe un programa en Java que solicite el ingreso de nombres de varios alumnos y la calificación
en una prueba de cada uno por teclado. No se sabe cuantos alumnos tiene el curso, por lo que el
programa debe terminar cuando se ingrese un alumno con nombre igual a “SALIR”.
Al suceder lo anterior, se debe desplegar por consola el promedio de curso obtenido, el nombre del
alumno con la menor nota y el nombre del alumno con la mayor nota.
Es importante validar que se ingrese siempre más de un alumno.

1. ingresa nombre de alumnos
crear scaner, print ingresa nombre, scaner nextline, arraylist nombres. 
2. ingresa calificaciones
print ingresa notas, scaner nextline, arraylist notas. 
3. termina cuando se ingresa un alumno con nombre = Salir
nombre= salir && arraylist nombres >2
ingresar un numero


4. al salir se debe desplegar la consola con el promedio del curso 
5. y el alumno con menor y mayor nota
6. Es importante validar que se ingrese siempre más de un alumno.
 */
public class ABP8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
       
		ArrayList<String> nombres = new ArrayList<>();// Añade el elemento al ArrayList
        ArrayList<Double> calificaciones = new ArrayList<>();
        double promedio = 0, suma = 0, min = 10, max = 0;
        String alumnoMin = " ", alumnoMax = " ";
        int contador = 0;
        double calificacion = 0;

        System.out.println("Ingrese los datos ('SALIR' para terminar)");
                
       // boolean datos = true;
        while (true) {
            
        	System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            
            //si el nombre es igual a salir y hay dos o mas alumnos sale
            if (nombre.equalsIgnoreCase("SALIR") && nombres.size()>=2 ) {//Compara dos strings para ver si son iguales ignorando las diferencias entre mayúsculas y minúsculas
            	//datos= false;
            	break;
            }
            System.out.print("Calificación: ");
	        String input = entrada.nextLine();
	        calificacion = Double.parseDouble(input);
	        
	        
	        
        nombres.add(nombre);
        calificaciones.add(calificacion);// Añade el elemento al ArrayList en la posición 'n'(calificacion en este caso)

        if (calificacion < min) {
            min = calificacion;
            alumnoMin = nombre;
        }else {
            max = calificacion;
            alumnoMax = nombre;
        }
        suma += calificacion;
        contador++;
        }

        if (contador > 1) {
            promedio = suma / contador;
            System.out.println("Promedio de curso: " + promedio);
            System.out.println("Alumno con menor nota: " + alumnoMin);
            System.out.println("Alumno con mayor nota: " + alumnoMax);
        } else {
            System.out.println("Debe ingresar al menos dos alumnos.");
        }
	
        		
	}

}
