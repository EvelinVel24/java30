package controller;

import model.Libro;
import model.Usuario;
import service.BibliotecaService;
import service.MembresiaService;

public class BibliotecaController {

    private BibliotecaService bibliotecaService = new BibliotecaService();
    private MembresiaService membresiaService = new MembresiaService();

    public void manejarDescarga(Usuario usuario, Libro libro) {
        if (membresiaService.verificarMembresia(usuario)) {
            bibliotecaService.descargarLibro(usuario, libro);
        } else {
            System.out.println("Acceso denegado. Verifica tu membresía.");
        }
    }
}
