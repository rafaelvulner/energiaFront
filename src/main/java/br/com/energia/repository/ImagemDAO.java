package br.com.energia.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.energia.model.Imagem;

public class ImagemDAO {
	
    private EntityManager getEM(){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
        
        return factory.createEntityManager();
    
    }
    
    public void salvar(Imagem img){
    
        EntityManager em = getEM();
        
        em.getTransaction().begin();
        em.persist(img);
        em.getTransaction().commit();
        
    }

}
