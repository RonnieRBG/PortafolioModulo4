package clases;

import java.util.ArrayList;
import java.util.Scanner;


public class Agenda {
	private ArrayList<Tarea> tareasAgendadas;
		private int nextID;


		public Agenda(ArrayList<Tarea> tareasAgendadas, int nextID) {
				super();
				this.tareasAgendadas = new ArrayList<>();
				this.nextID = nextID;
			}

		public Agenda() {
			super();
			this.tareasAgendadas = new ArrayList<>();
			this.nextID = 1;
		}


	public ArrayList<Tarea> getTareasAgendadas() {
			return tareasAgendadas;
		}

		public void setTareasAgendadas(ArrayList<Tarea> tareasAgendadas) {
			this.tareasAgendadas = tareasAgendadas;
		}

		public int getNextID() {
			return nextID;
		}

		public void setNextID(int nextID) {
			this.nextID = nextID;
		}

	public void agregarTarea() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la fecha: ");
		String fecha = sc.nextLine();
		System.out.println("Ingrese la descripcion: ");
		String descripcion = sc.nextLine();
		System.out.println("Ingrese estado de la tarea: ");
		System.out.println("¿La tarea está completada? (1 = Sí, 0 = No): ");
		int opcion = sc.nextInt();
		boolean estado = opcion == 1;
		
		
		Tarea nuevaTarea = new Tarea (nextID, fecha, descripcion, estado);
		tareasAgendadas.add(nuevaTarea);
		nextID++;
		
		
				}

	public void listarTareas() {
	    if (tareasAgendadas.isEmpty()) {
	        System.out.println("No hay productos en el inventario.");
	        return;
	    }

	    System.out.println("Productos en el inventario:");
	    for (Tarea t : tareasAgendadas) {
	        System.out.println(t);
	    } 
	}
	
	public void buscarTareaPorEstado() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Ingrese el estado de la tarea (1 = Completada, 0 = No completada ): ");
	    int opcion = sc.nextInt();
	    boolean estadoBuscado = opcion == 1;
	    boolean encontrado = false;

	   
	    for (Tarea p : tareasAgendadas) {
	        if (p.isEstado() == estadoBuscado) {
	            System.out.println("Tareas encontradas:");
	            System.out.println(p);
	            encontrado = true;
	            break;
	        }
	        
	    }
	}
	    public void marcarTareaComoCompletada() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese el ID de la tarea a marcar como completada:");
	        int idBuscado = sc.nextInt();

	        boolean encontrada = false;

	        for (Tarea t : tareasAgendadas) {
	            if (t.getId() == idBuscado) {
	                if (t.isEstado()) {
	                    System.out.println("La tarea ya estaba marcada como completada.");
	                } else {
	                    t.setEstado(true);
	                    System.out.println("La tarea ha sido marcada como completada.");
	                }
	                encontrada = true;
	                break;
	            }
	        }

	        if (!encontrada) {
	            System.out.println("No se encontró ninguna tarea con ese ID.");
	        }
	    }
	
	}
