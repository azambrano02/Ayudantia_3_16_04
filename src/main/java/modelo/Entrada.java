package modelo;

public class Entrada {
    private Cliente cliente;
    private Sala sala;
    private TipoEntrada tipoEntrada;
    private Promocion promocion;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Entrada(Cliente cliente, Sala sala, TipoEntrada tipoEntrada, Promocion promocion) {
        this.cliente = cliente;
        this.sala = sala;
        this.tipoEntrada = tipoEntrada;
        this.promocion = promocion;
    }
}
