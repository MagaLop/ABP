/**
 * 
 */
package com.unab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Una empresa de asesorías en prevención de riesgos necesita contar con un
 * sistema de información que le permita administrar los principales procesos
 * que se llevan a cabo en ella día a día. Dentro de las actividades que
 * realiza, están las capacitaciones. Estas son instancias que se desarrollan
 * para todos los clientes que posee (que corresponden generalmente a otras
 * empresas). Por cada capacitación se desea tener registro del RUT del cliente,
 * su nombre, dirección, comuna y número de teléfono. En cuanto a la
 * capacitación misma, se necesita saber el día, hora, lugar, duración y
 * cantidad de asistentes. De acuerdo con la cantidad de asistentes
 * anteriormente ingresada, se debe solicitar y el nombre y edad de los
 * asistentes. Finalizado este proceso, debe mostrar por pantalla los datos de
 * la empresa que pidió la capacitación, los datos de la capacitación misma, y
 * la cantidad de personas menores a 25 años, entre 26 y 35 años y mayores a 35
 * años. Nota: Todos los datos son obligatorios. Por tanto, debe validar que el
 * ingreso haya sido correcto en todos los casos. Además, debe validar que la
 * cantidad de asistentes registrada sea mayor que cero
 *
 */
public class ABPRO2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String empresa;
		String rut;
		String nombre;
		String direccion;
		String comuna;
		String telefono;

		String capacitacion;

		String lugar;

		int asistencia;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresar datos de la empresa\n");
//____________________RUT_______
		System.out.println("Rut de la empresa (Sin puntos ni digito verificador):  ");
		rut = entrada.nextLine();
		while (!rut.matches("[0-9]{6,8}")) {
			System.out.println("Rut incorrecto, intentelo nuevamente");
			rut = entrada.nextLine();
		}
//________________Nombre__Empresa______
		System.out.println("Nombre de la empresa:");
		nombre = entrada.nextLine();

		while (nombre.equals("")) {
			System.out.println("Por favor ingresar el nombre de la Empresa:");
			nombre = entrada.nextLine();
		}

//_________________Direccion_______
		System.out.println("Dirección de la empresa: ");
		direccion = entrada.nextLine();

		while (direccion.length() > 50) {
			System.out.println("Ingrese su dirección nuevamente");
			direccion = entrada.nextLine();
		}

//________________Comuna__________
		System.out.println("Comuna de la empresa: ");
		comuna = entrada.nextLine();

		while (comuna.length() > 30) {
			System.out.println("Ingrese su comuna nuevamente");
			comuna = entrada.nextLine();
		}
//______________Telefono___________
		System.out.println("Teléfono de la empresa: ");
		System.out.print("+56 9 ");
		telefono = entrada.nextLine();

		while (!telefono.matches("[0-9]{6,8}")) {
			System.out.println("numero incorrecto, intentelo nuevamente");
			System.out.println("Teléfono de la empresa: ");
			System.out.print("+56 9 ");
			telefono = entrada.nextLine();
		}
		// ________________Datos_de_Capacitacion_____
		System.out.println("____________________________");
		System.out.println("____________________________");

		System.out.println("Ingresar datos de la capacitación\n");
		
//_______________________FECHA_de_Capacitacion_________

		System.out.println("Ingresar Fecha de la capacitación(dd/MM/yyyy): ");
		String dia = entrada.nextLine();
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
//______________________HORA_de_Capacitacion___________
		/*
		 * Calendar hora = Calendar.getInstance();
		 * 
		 * System.out.println("Ingrese la hora de la capacitación (formato 24 horas): "
		 * ); int horas = entrada.nextInt();
		 * System.out.println("Ingrese los minutos de la capacitación: "); int minutos =
		 * entrada.nextInt();
		 * System.out.println("Ingrese los segundos de la capacitación: "); int segundos
		 * = entrada.nextInt();
		 * 
		 * hora.set(Calendar.HOUR_OF_DAY, horas); hora.set(Calendar.MINUTE, minutos);
		 * hora.set(Calendar.SECOND, segundos);
		 */
		Scanner horas = new Scanner(System.in);
		System.out.print("Ingrese la hora de la capacitación (HH:mm): \n");
		String input = horas.nextLine();
		LocalTime hora = LocalTime.parse(input);

//___________________Lugar_de_Capacitacion___________
		System.out.println("Lugar de la capacitación: ");
		lugar = entrada.nextLine();

		while (lugar.length() > 50) {
			System.out.println("Ingrese el lugar de la capacitación nuevamente");
			lugar = entrada.nextLine();
		}

//___________________duracion_de_Capacitacion__________
		Scanner duraciones = new Scanner(System.in);
		System.out.print("Ingrese la duración de la capacitación (HH:mm): \n");
		String inputs = duraciones.nextLine();
		LocalTime duracion = LocalTime.parse(inputs);

//___________________Datos_asistentes__________
		String nombre1;
		int edad;

		int menores = 0;
		int medianos = 0;
		int mayores = 0;
//__________________Numero_de_asistentes______
		System.out.println("Asistencia a la capacitación: ");
		asistencia = entrada.nextInt();

		while (asistencia <= 0) {
			System.out.println("Por favor ingresar valor mayor a 0");
			System.out.println("Asistencia a la capacitación: ");
			asistencia = entrada.nextInt();
		}
//_________________Nombre_participantes_______
		String[] participantes = new String[asistencia];

		entrada.nextLine();

		for (int i = asistencia; i > 0; i--) {
			System.out.println("Nombre del participante: ");
			nombre1 = entrada.nextLine();
			while (nombre1.equals("")) {

				System.out.println("Por favor ingresar un nombre valido");
				System.out.println("Nombre del participante: ");
				nombre1 = entrada.nextLine();
			}

//________________Edad_participantes_________
			System.out.println("Edad del participante: ");
			edad = Integer.valueOf(entrada.nextLine());

			if (edad <= 25) {
				menores++;
			}
			if (edad >= 26 && edad <= 35) {
				medianos++;
			}
			if (edad > 35) {
				mayores++;

			} else if (edad <= 0) {
				System.out.println("Por favor ingresar un número mayor a 0");
				System.out.println("Edad del participante: ");
				edad = Integer.valueOf(entrada.nextLine());

			}
		}

//_____________Resultado_Pantalla______		

		System.out.println("_____________________________________________________________");
		System.out.println("Datos de la empresa:\n");
		System.out.println("Rut: " + rut);
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Comuna: " + comuna);
		System.out.println("Teléfono: +56 9 " + telefono);
		entrada.nextLine();
		System.out.println("____________________________");
		System.out.println("____________________________");
		entrada.nextLine();
		System.out.println("Datos de la capacitación\n");
		System.out.println("Fecha: " + dia);
		System.out.println("Hora: " + hora + "hrs." );
		System.out.println("Lugar: " + lugar);
		System.out.println("Duración: " + duracion + "hrs." );
		System.out.println("Número de asistentes: " + asistencia);
		entrada.nextLine();
		System.out.println("Datos de asistentes\n");
		entrada.nextLine();
		System.out.println("____________________________");
		System.out.println("____________________________");
		entrada.nextLine();
		System.out.println("A la capacitación ingresaron " + menores + " menores de 25 años, " + medianos
				+ " entre 26 a 35 años y " + mayores + " mayores de 35 años.");
		System.out.println("_____________________________________________________________");

//______________	
	}

}
