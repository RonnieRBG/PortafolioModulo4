package clases;

import java.util.Scanner;


public class Main {
	 public static void main(String[] args) {
		 Agenda agenda = new Agenda (); 
	   Scanner scanner = new Scanner(System.in);
       int opcion;

       do {
           System.out.println("\n--- MENÚ DE INVENTARIO ---");
           System.out.println("1. Agregar Tarea");
           System.out.println("2. Mostrar todas las Tareas");
           System.out.println("3. Filtrar Tareas");
           System.out.println("4. Marcar Completada");
                     System.out.print("Seleccione una opción: ");
           opcion = scanner.nextInt();
           scanner.nextLine(); // Limpiar buffer

           switch (opcion) {
               case 1:
                   agenda.agregarTarea();
                   break;
               case 2:
                   agenda.listarTareas();
                   break;
               case 3:
                   agenda.buscarTareaPorEstado();
                   break;
               case 4:
                   agenda.marcarTareaComoCompletada();
                   break;
                            case 0:
                   System.out.println("Saliendo del programa...");
                   break;
               default:
                   System.out.println("Opción no válida. Intente nuevamente.");
                   break;
           }

       } while (opcion != 0);

       scanner.close();
   }

}
