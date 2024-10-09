package model;

public class Usuario {
    private String nombre;
    private boolean tieneCuenta;
    private boolean haPagadoMembresia;

    public Usuario(String nombre, boolean tieneCuenta, boolean haPagadoMembresia) {
        this.nombre = nombre;
        this.tieneCuenta = tieneCuenta;
        this.haPagadoMembresia = haPagadoMembresia;
    }

    public boolean isTieneCuenta() {
        return tieneCuenta;
    }

    public boolean isHaPagadoMembresia() {
        return haPagadoMembresia;
    }

    public String getNombre() {
        return nombre;
    }
}
