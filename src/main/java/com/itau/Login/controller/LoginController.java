package com.itau.Login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.itau.Login.model.CadastroItau;
import com.itau.Login.repository.LoginRepository;

@RestController
public class LoginController implements WebMvcConfigurer {
	
	//PARA ACESSAR A PÁGINA PELO LOCAL HOST 8080
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/cadastro.html");
	}
	
	//FAZ A INJEÇÃO DO REPOSITÓRIO
	@Autowired
	private  LoginRepository repository;
	

	//REQUESTBODY INSERE O QUE ESTÁ NO CORPO
	@PostMapping("/login")
	public ResponseEntity<CadastroItau> criar (@RequestBody CadastroItau objetoLogin){
		
		//VETOR DA SENHA
		char[] arraySenha = objetoLogin.getSenha().toCharArray();
		
		//VARIAVEIS LÓGICAS
		boolean verificarNumero = false, verificarMinusculo = false, verificarMaiusculo = false,
		verificarEspecial = false, verificarRepeticao = false, senha = false;
		
		//EXECUÇÃO DO LAÇO DE REPETIÇÃO
		for(int x = 0; x < objetoLogin.getSenha().length();x++) {
			
			//ESTRUTURAS CONDICIONAIS
			if((arraySenha[x] >= '0') && (arraySenha[x] <= '9')) {
				verificarNumero = true;
			}
			
			if((arraySenha[x] >= 'a') && (arraySenha[x] <= 'z')) {
				verificarMinusculo = true;
			}

			if((arraySenha[x] >= 'A') && (arraySenha[x] <= 'Z')) {
				verificarMaiusculo = true;
			}

			if(arraySenha[x] == '!' || arraySenha[x] == '@' || arraySenha[x] == '#' || arraySenha[x] == '$' 
				|| arraySenha[x] == '%' || arraySenha[x] == '^' || arraySenha[x] == '&' || 
				arraySenha[x] == '*' || arraySenha[x] == '(' || arraySenha[x] == ')' || 
				arraySenha[x] == '-' || arraySenha[x] == '+') {
					verificarEspecial = true;
			}

			///EXECUÇÃO DE MAIS UM LAÇO DE REPETIÇÃO CASO A LETRA SEJA REPITIDA
			for(int y = 0;y < objetoLogin.getSenha().length();y++) {
				if( (objetoLogin.getSenha().toUpperCase().charAt(x) == 
					objetoLogin.getSenha().toUpperCase().charAt(y)) && (x != y)) {
						verificarRepeticao = true;
				}
			}
		}

		//ESTRUTURA CONDICIONAL CASO SEJA TODAS VERDADEIROS MENOS O VERIFICARREPETIÇAO
		if( verificarNumero == true && verificarMinusculo == true && verificarMaiusculo == true && 
			verificarEspecial == true && verificarRepeticao == false) {
				senha = true;
		}

		//MAIS UMA ESTRUTURA CONDICIONAL PARA CRIAÇAO DOS DADOS CASO OCORRA TUDO BEM
		if(senha == true) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(objetoLogin));
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
	

	
}
