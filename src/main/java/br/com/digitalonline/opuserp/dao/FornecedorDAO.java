package br.com.digitalonline.opuserp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.digitalonline.opuserp.domain.Fornecedor;

@Repository
public class FornecedorDAO {
    
    @Autowired
    EntityManager em;

	
	public List<Fornecedor> procurar(String s){
		
		Integer qtd_registros = s != null && s != "" ? 100000000 : 1000;
		Query q = em.createQuery("select c from Cep c where c.endereco like CONCAT('%',:s,'%') and c.endereco not like '' order by c.id desc", Fornecedor.class).setMaxResults(qtd_registros);
		q.setParameter("s", s.toUpperCase());
				
        
		return q.getResultList();
	}
}
