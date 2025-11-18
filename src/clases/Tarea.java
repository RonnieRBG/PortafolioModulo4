package clases;

public class Tarea {
		
	private int id;
	private String fecha;
	private String descripcion;
	private boolean estado;
	
	
	public Tarea(int id, String fecha, String descripcion, boolean estado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.estado = estado;
	}


	public Tarea() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

	@Override
	public String toString() {
	    return "ID: " + id + " | Fecha: " + fecha + " | Descripción: " + descripcion + " | Estado: " + (estado ? "Completada" : "Pendiente");
	}

	
	
}
