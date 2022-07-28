package br.com.digitalonline.opuserp.controller.cadastros.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalonline.opuserp.dao.ClienteDAO;
import br.com.digitalonline.opuserp.domain.Cliente;

@RestController
public class ClienteRestController {
    

    @Autowired
    ClienteDAO dao;

    @CrossOrigin(origins = "*")
	@RequestMapping(value = "/cadastro/cliente/find", method= RequestMethod.GET) 
	public Cliente find(@RequestParam("codigo") Long codigo){
		
		Cliente clientes = dao.find(codigo);
		return clientes;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cadastro/cliente/findByName", method= RequestMethod.GET) 
	public List<Cliente> findByName(@RequestParam("s") String s){
		
		List<Cliente> clientes  = dao.procurar(s);
		return clientes;
	}
}
