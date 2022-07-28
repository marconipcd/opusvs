package br.com.digitalonline.opuserp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.digitalonline.opuserp.OpuserpApplication;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

   
    

    @RequestMapping("")
    public String index(Model model){

        if(OpuserpApplication.getUsuarioLogado() != null){
            return "index";
        }else{
            return "login";
        }
    }

    @RequestMapping("/inicio")
    public String inicio(Model model){
        
        if(OpuserpApplication.getUsuarioLogado() != null){

            System.out.println(OpuserpApplication.getUsuarioLogado());

            return "index";
        }else{
            return "login";
        }
    }

    @RequestMapping("/login")
    public String login(Model model){       
        
        return "login";
        
    }


    @RequestMapping(value="/teste_request", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        return "teste";
    }

    
    


    
}
