package br.com.webmotors.screens;

import static br.com.webmotors.core.Driver.getDriver;

import org.openqa.selenium.support.PageFactory;

import br.com.webmotors.core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen extends BaseScreen {

	public HomeScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	
	
	@AndroidFindBy(id = "hands.android.webmotors:id/lavAnimation")
	MobileElement btImagem;
	
	@AndroidFindBy(id = "btRegister")
	MobileElement btRegister;
	


	public MobileElement getBtRegister() {
		return btRegister;
	}
	
	public MobileElement getImagem() {
		return btImagem;
	}


}