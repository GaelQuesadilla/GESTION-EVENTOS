
public class Actividad {
    private String nombre;
    private double duración;
    private String status;
    private Empleado encargado;

    public Actividad(String nombre, double duración, String status, Empleado encargado) {
        this.nombre = nombre;
        this.duración = duración;
        this.status = status;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getEncargado() {
        return this.encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public double getDuración() {
        return duración;
    }

    public void setDuración(double duración) {
        this.duración = duración;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
