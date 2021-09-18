package pe.popehiflo.modulo2;

import pe.popehiflo.modulo2.entities.Entidad;
import pe.popehiflo.modulo2.services.EntidadService;
import pe.popehiflo.modulo2.services.EntidadServiceImpl;

public class Main {

    public static void main(String[] args) {
        EntidadService service = new EntidadServiceImpl();
        service.altaEntidad(new Entidad());
    }
}
