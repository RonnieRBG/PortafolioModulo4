
# Proyecto: Gestor de Tareas en Consola - Java

## Pendientes
    El proyecto se encuetra casi completo en su totalidad, solo habia que arreglar la fecha. 
    Actualemente se ingresa como STRING.

## Descripción general

Esta aplicación de consola permite gestionar tareas diarias, agregándolas, listándolas, filtrándolas por estado (completadas o pendientes) y marcándolas como completadas. Está desarrollada en Java siguiendo principios de programación orientada a objetos.

---

## Funcionalidades principales

- Agregar una nueva tarea (requiere fecha, descripción y estado).
- Listar todas las tareas registradas.
- Filtrar tareas por estado (completadas / no completadas).
- Marcar una tarea como completada por su ID.

---

## Estructura del proyecto

```
src/
├── clases/
│   ├── Main.java          # Contiene el menú y ejecución de la aplicación
│   ├── Agenda.java        # Lógica de gestión de tareas
│   └── Tarea.java         # Clase que representa una tarea individual
```

---

## Cómo ejecutar

1. Abre el proyecto en tu IDE (Eclipse, STS o IntelliJ).
2. Asegúrate de tener configurado JDK 11 o superior.
3. Ejecuta `Main.java` como aplicación Java.

---

## Instrucciones de uso

Una vez que ejecutes el programa, verás un menú con las opciones:

```
--- MENÚ DE INVENTARIO ---
1. Agregar Tarea
2. Mostrar todas las Tareas
3. Filtrar Tareas
4. Marcar Completada
0. Salir
```

Ingresa el número de la opción que deseas usar y sigue las instrucciones por consola.

---

## Principios de diseño aplicados

- **Encapsulamiento:** Todos los atributos son privados, accedidos mediante getters/setters.
- **Separación de responsabilidades:** La clase `Agenda` gestiona las operaciones, `Tarea` representa cada entrada, y `Main` coordina la ejecución.
- **Reutilización de código:** Se utilizan métodos que cumplen una única responsabilidad.

---

## Pruebas unitarias

Se implementaron pruebas básicas con JUnit 5 para:

- Verificar que una tarea se agrega correctamente.
- Comprobar el filtrado por estado.
- Validar el cambio de estado al marcar como completada.

---

## Requisitos

- JDK 11+
- JUnit 5 (para pruebas)
- IDE compatible con Java (Eclipse, STS, IntelliJ)

---

## Autor

Johnatan Rodriguez
