/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfc.jsf.controlador;

import java.util.List;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import pfc.ejb.facade.CampoFacadeLocal;
import pfc.jpa.modelo.Campo;

/**
 *
 * @author victor
 */
@Named(value = "campoBean")
@RequestScoped
public class CampoBean {

    private static final Logger logger = 
        Logger.getLogger("pfc.ejb.bussines.CampoBean") ;
    
    @Inject
    private CampoFacadeLocal managerCampos ;
    
    private Long idSeleccionado ;
    private List<Campo> campos ;

    public CampoBean() {
    }

    public Long getIdSeleccionado() {
        return idSeleccionado;
    }

    public void setIdSeleccionado(Long idSeleccionado) {
        this.idSeleccionado = idSeleccionado;
    }

    public List<Campo> getCampos() {
        if (campos == null) {
            campos = managerCampos.findAll() ;
        }
        return campos;
    }
    
}
