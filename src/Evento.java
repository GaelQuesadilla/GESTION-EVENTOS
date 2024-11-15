
import java.util.*;

public class Evento {
    private String nombre;
    private Date fecha;
    private String status;
    private Lugar lugar;
    private List<Actividad> actividades;
    private Empleado organizador;

    public Evento(String nombre, Date fecha, String status, Lugar lugar, List<Actividad> actividades,
            Empleado organizador) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.status = status;
        this.lugar = lugar;
        this.actividades = new ArrayList<>();
        this.organizador = organizador;
    }

    public Evento(String nombre, Date fecha) {
        this(nombre, fecha, null, null, null, null);
    }

    public Evento(String nombre, Date fecha, Empleado organizador) {
        this(nombre, fecha, null, null, null, organizador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public List<Actividad> getActividades() {
        return this.actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public void aniadirActividad(Actividad actividad) {
        if (actividad != null) {
            this.actividades.add(actividad);
        } else {
            System.out.println("Actividad no puede ser nula.");
        }
    }

    public void eliminarActividad(Actividad actividad) {
        if (this.actividades.contains(actividad)) {
            this.actividades.remove(actividad);
        } else {
            System.out.println("Actividad no encontrada.");
        }
    }

    public void iniciar() {
        this.status = "En curso";
    }

    public void finalizar() {
        this.status = "Finalizado";
    }

    public void cancelar() {
        this.status = "Cancelado";
    }

    public void setOrganizador(Empleado organizador) {
        this.organizador = organizador;
    }

    public Empleado getOrganizador() {
        return this.organizador;
    }
}
