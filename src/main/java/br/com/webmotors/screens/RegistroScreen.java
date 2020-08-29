package br.com.webmotors.screens;
import static br.com.webmotors.core.Driver.getDriver;

import org.openqa.selenium.support.PageFactory;

import br.com.webmotors.core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class RegistroScreen extends BaseScreen {


	public RegistroScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	@AndroidFindBy(id = "tvActionBarTitle")
	MobileElement titulo;
	
	@AndroidFindBy(id = "etName")
	MobileElement NomeSobrenome;
	
	@AndroidFindBy(id = "etEmail")
	MobileElement email;
	
	@AndroidFindBy(id = "etPassword")
	MobileElement senha;
	
	@AndroidFindBy(id = "etConfirmPassword")
	MobileElement confirmaSenha;
	
	@AndroidFindBy(id = "btRegister")
	MobileElement botaoCadastrar;

	public MobileElement getTitulo() {
		return titulo;
	}

	public MobileElement getNomeSobrenome() {
		return NomeSobrenome;
	}

	public MobileElement getEmail() {
		return email;
	}

	public MobileElement getSenha() {
		return senha;
	}

	public MobileElement getConfirmaSenha() {
		return confirmaSenha;
	}
	
	public MobileElement getBotaoCadastrar() {
		return botaoCadastrar;
	}

	
	
	

}
