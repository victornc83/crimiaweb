/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victornieto.pfc.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.victornieto.pfc.entity.Campo;

/**
 *
 * @author victor
 */
@Stateless
public class CampoFacade extends AbstractFacade<Campo> implements CampoFacadeLocal {
    @PersistenceContext(unitName = "pfc_crimiaweb_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CampoFacade() {
        super(Campo.class);
    }
    
}
