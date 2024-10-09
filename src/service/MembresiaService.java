package service;

import model.Usuario;

public class MembresiaService {
    public boolean verificarMembresia(Usuario usuario) {
        return usuario.isTieneCuenta() && usuario.isHaPagadoMembresia();
    }
}
