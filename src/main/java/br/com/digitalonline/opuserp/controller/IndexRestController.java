package br.com.digitalonline.opuserp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalonline.opuserp.OpuserpApplication;

@RestController
public class IndexRestController {
  
    

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/FazerLogin", method= RequestMethod.GET)
    public String login(@RequestParam("u") String u, @RequestParam("s") String s){
        
        if(u.equals("marconi") && s.equals("idigital123mc")){
           OpuserpApplication.setUsuarioLogado(u);
           System.out.println(u);
           
           return u;
        }else{
            OpuserpApplication.setUsuarioLogado(null);
            return null;
        }
    }


    
}
