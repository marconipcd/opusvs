package br.com.digitalonline.opuserp.controller.cadastros.ceps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalonline.opuserp.dao.CepDAO;
import br.com.digitalonline.opuserp.domain.Cep;

@RestController
public class CepRestController {

   @Autowired
    CepDAO dao;

    @CrossOrigin(origins = "*")
	@RequestMapping(value = "/cadastro/cep/find", method= RequestMethod.GET) 
	public List<Cep> findByName(@RequestParam("s") String s){
		
		List<Cep> ceps  = dao.procurar(s);
		return ceps;
	}
}
