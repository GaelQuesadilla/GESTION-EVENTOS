
import java.util.*;

public class Empleado {
    private String nombre;
    private Integer id;
    private Date fechaIngreso;
    private double salario;
    private List<Actividad> actividades;

    public Empleado(String nombre, Integer id, Date fechaIngreso, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.actividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }
}