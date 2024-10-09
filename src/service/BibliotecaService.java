package service;

import model.Libro;
import model.Usuario;

public class BibliotecaService {

    public void descargarLibro(Usuario usuario, Libro libro) {
        if (usuario.isTieneCuenta()) {
            if (usuario.isHaPagadoMembresia()) {
                System.out.println("Descargando el libro: " + libro.getTitulo());
            } else {
                System.out.println("Membresía no pagada. No puedes descargar el libro.");
            }
        } else {
            System.out.println("El usuario no tiene cuenta.");
        }
    }
}

