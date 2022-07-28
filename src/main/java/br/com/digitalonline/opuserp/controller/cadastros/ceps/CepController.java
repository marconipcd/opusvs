package br.com.digitalonline.opuserp.controller.cadastros.ceps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.digitalonline.opuserp.OpuserpApplication;

@Controller
public class CepController {

    
    
    @RequestMapping("cadastro/cep")
    public String cep(Model model){

        if(OpuserpApplication.getUsuarioLogado() != null){            
            return "cadastro/cep/index";
        }else{
            return "login";
        }
    }
}
