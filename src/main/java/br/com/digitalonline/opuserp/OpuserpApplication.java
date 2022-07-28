package br.com.digitalonline.opuserp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpuserpApplication {


	static private String USUARIO_LOGADO;

	public static void main(String[] args) {
		SpringApplication.run(OpuserpApplication.class, args);
	}


	public static String getUsuarioLogado(){
		return USUARIO_LOGADO;
	}

	public static void setUsuarioLogado(String user){
		USUARIO_LOGADO = user;
	}

}
