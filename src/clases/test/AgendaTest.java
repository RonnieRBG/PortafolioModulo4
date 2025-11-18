package clases.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Agenda;
import clases.Tarea;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {

    private Agenda agenda;

    @BeforeEach
    public void setUp() {
        agenda = new Agenda();  
    }

    @Test
    public void testAgregarTarea() {
        int tareasIniciales = agenda.getTareasAgendadas().size();

        Tarea nueva = new Tarea(1, "20/11/2025", "Reunión", false);
        agenda.getTareasAgendadas().add(nueva); 

        assertEquals(tareasIniciales + 1, agenda.getTareasAgendadas().size());
    }

    @Test
    public void testFiltrarPorEstado() {
      
        agenda.getTareasAgendadas().add(new Tarea(1, "20/11/2025", "Completada", true));
        agenda.getTareasAgendadas().add(new Tarea(2, "21/11/2025", "Pendiente", false));

        long completadas = agenda.getTareasAgendadas()
                .stream()
                .filter(Tarea::isEstado)
                .count();

        assertEquals(1, completadas);
    }

    @Test
    public void testMarcarTareaComoCompletada() {
        Tarea tarea = new Tarea(1, "20/11/2025", "Tarea pendiente", false);
        agenda.getTareasAgendadas().add(tarea);

        
        tarea.setEstado(true);

        assertTrue(tarea.isEstado());
    }
}
