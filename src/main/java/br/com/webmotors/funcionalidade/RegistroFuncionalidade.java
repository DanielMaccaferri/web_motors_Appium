package br.com.webmotors.funcionalidade;

import br.com.webmotors.screens.RegistroScreen;

public class RegistroFuncionalidade {
	RegistroScreen registro = new RegistroScreen();

	public RegistroFuncionalidade() {
		registro = new RegistroScreen();
	}

	public void titulo() {
		registro.getTitulo().getText();
	}
	
	public void nomeSobrenome(){
		registro.getNomeSobrenome().sendKeys("Daniel Maccaferri");
	}
	
	public void email(){
		registro.getEmail().sendKeys("android@android.com.br");
	}
	
	public void senha(){
		registro.getSenha().sendKeys("123456");
	}
	
	public void confirmaSenha(){
		registro.getConfirmaSenha().sendKeys("123456");
	}
	
	public void botaoCadastrar(){
		registro.getBotaoCadastrar().click();
	}

}
