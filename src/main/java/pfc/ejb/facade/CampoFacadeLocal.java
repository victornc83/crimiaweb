/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfc.ejb.facade;

import java.util.List;
import javax.ejb.Local;
import pfc.jpa.modelo.Campo;

/**
 *
 * @author victor
 */
@Local
public interface CampoFacadeLocal {

    void create(Campo campo);

    void edit(Campo campo);

    void remove(Campo campo);

    Campo find(Object id);

    List<Campo> findAll();

    List<Campo> findRange(int[] range);

    int count();
    
}
