import model.Usuario;
import model.Libro;
import controller.BibliotecaController;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioConCuenta = new Usuario("Juan", true, true);
        Usuario usuarioSinMembresia = new Usuario("Maria", true, false);
        Libro libro = new Libro("El Principito");

        BibliotecaController controller = new BibliotecaController();
        controller.manejarDescarga(usuarioConCuenta, libro);
        controller.manejarDescarga(usuarioSinMembresia, libro);
    }
}
