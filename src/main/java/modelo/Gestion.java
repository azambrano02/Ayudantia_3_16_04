package modelo;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private List<Cliente> clientes;
    private List<Sala> salas;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public Gestion() {
        this.clientes = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public void agregarCliente(String nombre, String rut, String email) {
        Cliente cliente = new Cliente(nombre, rut, email);
        this.clientes.add(cliente);
    }

    public void venderEntrada(Cliente cliente, Sala sala, TipoEntrada tipoEntrada, Promocion promocion) {
        if (sala.getAsientosDisponibles() > 0) {
            Entrada entrada = new Entrada(cliente, sala, tipoEntrada, promocion);
            sala.venderEntrada();
            cliente.agregarEntrada(entrada);
        }
    }
}
