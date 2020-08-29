package br.com.webmotors.funcionalidade;

import br.com.webmotors.screens.HomeScreen;

public class HomeFuncionalidade {
	HomeScreen home = new HomeScreen();

	public HomeFuncionalidade() {
		home = new HomeScreen();
	}
	

	public void btRegister(){
		home.getBtRegister().click();
	}
	
	public void imagem(){
		home.getImagem().click();
	}

}
