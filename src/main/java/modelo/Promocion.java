package modelo;

import java.time.LocalDate;

public class Promocion {
    private double descuento;
    private LocalDate fechaVencimiento;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Promocion(double descuento, LocalDate fechaVencimiento) {
        this.descuento = descuento;
        this.fechaVencimiento = fechaVencimiento;
    }
}
