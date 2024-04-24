package modelo;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String rut;
    private String direccion;
    private List<Entrada> entradas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public Cliente(String nombre, String rut, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }
    public void eliminarEntrada(Entrada entrada) {
        entradas.remove(entrada);
    }
}
