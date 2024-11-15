
import java.util.List;

public class Lugar {
    private String calle;
    private String CP;
    private String colonia;
    private int capacidad;
    private List<String> horario;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String cP) {
        CP = cP;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad >= 0) {
            this.capacidad = capacidad;
        } else {
            System.out.println("La capacidad no puede ser negativa.");
        }
    }

    public List<String> getHorario() {
        return horario;
    }

    public void setHorario(List<String> horario) {
        this.horario = horario;
    }

    public void consultarHorario() {
        System.out.println("Horario disponible:");
        for (String h : horario) {
            System.out.println(h);
        }
    }
}
