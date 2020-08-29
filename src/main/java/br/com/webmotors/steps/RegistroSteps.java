package br.com.webmotors.steps;

import br.com.webmotors.funcionalidade.RegistroFuncionalidade;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class RegistroSteps {
	
	RegistroFuncionalidade registro = new RegistroFuncionalidade();
	
	@Quando("eu clicar em criar conta")
	public void eu_clicar_em_criar_conta() {
		registro.titulo();


	}

	@Quando("eu inserir os dados")
	public void eu_inserir_os_dados() {
		registro.nomeSobrenome();
		registro.email();
		registro.senha();
		registro.confirmaSenha();
		registro.botaoCadastrar();

	}

	@Entao("a conta deve ser criada")
	public void a_conta_deve_ser_criada() {

	}

}



