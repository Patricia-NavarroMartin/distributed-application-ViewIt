/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans.dao;

import entities.Movie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Patri Navarro
 */
@Stateless
public class MovieFacade extends AbstractFacade<Movie> implements MovieFacadeLocal {

    @PersistenceContext(unitName = "com.patrinav_viewitEE-ejb_ejb_1.0.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovieFacade() {
        super(Movie.class);
    }
    
}
