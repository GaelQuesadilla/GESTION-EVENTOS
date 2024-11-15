
import java.util.*;

public class Empresa {
    private String nombre;
    private String telefono;
    private List<Empleado> empleados;
    private List<Evento> eventos;
    private Double capital;
    private Lugar lugar;

    public Empresa(String nombre, String telefono, List<Empleado> empleados, Double capital, Lugar lugar) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.empleados = empleados;
        this.capital = capital;
        this.lugar = lugar;
    }

    public Empresa(String nombre, String telefono, Double capital, Lugar lugar) {
        this(nombre, telefono, new ArrayList<Empleado>(), capital, lugar);
    }

    public Empresa(String nombre, String telefono, Lugar lugar) {
        this(nombre, telefono, new ArrayList<Empleado>(), 0d, lugar);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Double getCapital() {
        return this.capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public List<Empleado> getEmpleados() {
        return this.empleados;
    }

    public void pagarSalario(Empleado empleado) {
        double salario = empleado.getSalario();
        if (this.capital >= salario) {
            this.capital -= salario;
            System.out.println("Salario pagado a " + empleado.getNombre());
        } else {
            System.out.println("Capital insuficiente para pagar el salario de " + empleado.getNombre());
        }
    }

    public List<Evento> getEventos() {
        return this.eventos;
    }

    public void getEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public void anadirEvento(Evento evento) {
        this.eventos.add(evento);

    }

    public void cancelarEvento(Evento evento) {
        evento.cancelar();
    }

    public void eliminarEvento(Evento evento) {
        evento.cancelar();
        this.eventos.remove(evento);
    }

    public void contratarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        this.empleados.remove(empleado);
    }
}
