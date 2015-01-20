/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victornieto.pfc.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.victornieto.pfc.entity.Valor;

/**
 *
 * @author victor
 */
@Stateless
public class ValorFacade extends AbstractFacade<Valor> implements ValorFacadeLocal {
    @PersistenceContext(unitName = "pfc_crimiaweb_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ValorFacade() {
        super(Valor.class);
    }
    
}
