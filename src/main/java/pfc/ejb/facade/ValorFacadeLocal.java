/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfc.ejb.facade;

import java.util.List;
import javax.ejb.Local;
import pfc.jpa.modelo.Valor;

/**
 *
 * @author victor
 */
@Local
public interface ValorFacadeLocal {

    void create(Valor valor);

    void edit(Valor valor);

    void remove(Valor valor);

    Valor find(Object id);

    List<Valor> findAll();

    List<Valor> findRange(int[] range);

    int count();
    
}
