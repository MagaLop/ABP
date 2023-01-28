package com.unab;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ABPRO3 {

	public static void main(String[] args) {
		

		 Scanner entrada = new Scanner(System.in);

		 String dia;
		 String lugar;
		 int asistencia; 
		 
		 
	        // Solicitar datos de la capacitación
		 //_______________fecha_capacitacion________________
		 System.out.println("Ingresar Fecha de la capacitación(dd/MM/yyyy): ");
			dia = entrada.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaCapacitacion = LocalDate.parse(dia, formatter);
			LocalDate fechaActual = LocalDate.now();

			while (fechaCapacitacion.isBefore(fechaActual)) {
				System.out.println("No puede ingresar una fecha que ya ha pasado. ");
				System.out.println("Ingrese nuevamente\n");
				dia = entrada.nextLine();
				fechaCapacitacion = LocalDate.parse(dia, formatter);

			}
			if (fechaCapacitacion.isAfter(fechaActual)) {
				System.out.println("La fecha de su capacitación ha sido agendada.");

			} else {
				System.out.println("La capacitación está programada para hoy.");
			}
			  try {
			        fechaCapacitacion = LocalDate.parse(dia, formatter);
			    } catch (DateTimeParseException e) {
			        System.out.println("La fecha ingresada no es válida. Por favor ingrese nuevamente en el formato dd/MM/yyyy.");
			        dia = entrada.nextLine();
			        fechaCapacitacion = LocalDate.parse(dia, formatter);
			    }
			//_______________Hora_capacitacion________________
			    Scanner horas = new Scanner(System.in);
				System.out.print("Ingrese la hora de la capacitación (HH:mm): \n");
				String input = horas.nextLine();
				LocalTime hora = LocalTime.parse(input);

	        //______________Lugar_capacitacion________________
				System.out.println("Lugar de la capacitación: ");
				lugar = entrada.nextLine();

				while (lugar.length() > 50) {
					System.out.println("Ingrese el lugar de la capacitación nuevamente");
					lugar = entrada.nextLine();
				}

	        //______________Duracion_Capacitacion_____________
				Scanner duraciones = new Scanner(System.in);
				System.out.print("Ingrese la duración de la capacitación (HH:mm): \n");
				String inputs = duraciones.nextLine();
				LocalTime duracion = LocalTime.parse(inputs);
	        //_____________Cantidad_asistentes________________
				System.out.println("Asistencia a la capacitación: ");
				asistencia = entrada.nextInt();

				while (asistencia <= 0) {
					System.out.println("Por favor ingresar valor mayor a 0");
					System.out.println("Asistencia a la capacitación: ");
					asistencia = entrada.nextInt();
				}
	        //___________________________________

	        // Crear matriz para almacenar los nombres y calificaciones de los asistentes
	        String[][] asistentes = new String[asistencia][2];
	        
	        //Pedir los nombres y calificaciones de los asistentes
	        
	        int sumacalificaciones = 0;// acumular las calificaciones ingresadas por el usuario
	        int notamax= 0;
	        int notamin = 7;
	        int calificacion;
	        
	        for (int i = 0; i < asistencia; i++) {//for" para iterar sobre el número de asistentes a la capacitación
	            System.out.print("Ingresa el nombre del asistente " + (i+1) + ": ");
	            asistentes[i][0] = entrada.next();
	            System.out.print("Ingresa la calificación del asistente " + (i+1) + " (1-7): ");
	            asistentes[i][1] = entrada.next();
	            calificacion = Integer.parseInt(asistentes[i][1]);//Convierte una cadena de texto en un número entero.
	            sumacalificaciones += calificacion;
	            if (calificacion > notamax) {
	            	notamax = calificacion;
	            }
	            if (calificacion < notamin) {
	            	notamin = calificacion;
	            }
	        }
	     // Calcular promedio de calificaciones
	        
	        double promedionotas = (double) sumacalificaciones / asistencia;

	        // Mostrar datos de la capacitación
	        
	        System.out.println("Datos de la capacitación:");
	        System.out.println("Día: " + dia);
	        System.out.println("Hora: " + hora + "hrs." );
	        System.out.println("Lugar: " + lugar);
	        System.out.println("Duración: " + duracion + "hrs." );
	        System.out.println("Cantidad de asistentes: " + asistencia);

	        // Mostrar promedio de calificaciones, calificación mayor y calificación menor
	      //  System.out.println

		  entrada.close();
		} 
}
