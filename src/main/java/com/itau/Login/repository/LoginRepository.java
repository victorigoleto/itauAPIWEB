package com.itau.Login.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.itau.Login.model.CadastroItau;


// FAZ A CONDUÇÃO (PERSISTE) DOS DADOS DA TABELA AO BANCO DE DADOS
public interface LoginRepository extends JpaRepository<CadastroItau, Long> {

}
