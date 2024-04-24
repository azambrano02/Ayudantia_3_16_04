package modelo;

public class Sala {
    private int cantAsientos;
    private int asientosDisponibles;

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public Sala(int cantAsientos, int asientosDisponibles) {
        this.cantAsientos = cantAsientos;
        this.asientosDisponibles = asientosDisponibles;
    }

    public void venderEntrada() {
        asientosDisponibles--;
    }
    public void incrementarAsientosDisponibles() {
        asientosDisponibles++;
    }
}
