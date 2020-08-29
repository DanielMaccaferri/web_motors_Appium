package br.com.webmotors.steps;

import br.com.webmotors.funcionalidade.HomeFuncionalidade;
import br.com.webmotors.funcionalidade.RegistroFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class HomeSteps {

	HomeFuncionalidade home = new HomeFuncionalidade();
	RegistroFuncionalidade registro = new RegistroFuncionalidade();

	@Dado("que eu abra o aplicativo")
	public void que_eu_abra_o_aplicativo() {
		home.imagem();
		
		
	}

	@Entao("a tela home deve aparecer")
	public void a_tela_home_deve_aparecer() {		
		home.btRegister();
	}
	
}

