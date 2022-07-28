package br.com.digitalonline.opuserp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.digitalonline.opuserp.domain.Cliente;

@Repository
public class ClienteDAO {
    
    @Autowired
    EntityManager em;

	public Cliente find(Long codigo){
		
		return em.find(Cliente.class, codigo);
		
	}

    public List<Cliente> listar(){
		
		Query q = em.createQuery("select c from Cliente c where c.nome_razao not like '' and c.empresa=1 "
				+ "order by c.id desc",Cliente.class).setMaxResults(100);
		return q.getResultList();
	}
	
	public List<Cliente> procurar(String s){
		
		Integer qtd_registros = s != null && s != "" ? 100000000 : 1000;
		Query q = em.createQuery("select c from Cliente c where c.nome_razao not like '' and "
				+ "c.empresa=1 and c.nome_razao like CONCAT('%',:s,'%') order by c.id desc", Cliente.class).setMaxResults(qtd_registros);
		q.setParameter("s", s);
				
		return q.getResultList();
	}
	
	public Cliente buscarCliente(Long id) {
		return em.find(Cliente.class, id);
	}
}
