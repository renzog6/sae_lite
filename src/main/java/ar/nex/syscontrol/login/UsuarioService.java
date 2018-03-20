package ar.nex.syscontrol.login;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Renzo
 */
public class UsuarioService {

    private EntityManagerFactory factory;// = Persistence.createEntityManagerFactory("SysServices-PU");
    private UsuarioJpaController dao;// = new UsuarioJpaController(factory);

    public UsuarioService() {
        System.out.println("ar.sys.usuario.UsuarioService.<init>()");
        factory = Persistence.createEntityManagerFactory("SysFX-PU");
        dao = new UsuarioJpaController(factory);
    }

    public UsuarioJpaController Get() {
        return dao;
    }

}
