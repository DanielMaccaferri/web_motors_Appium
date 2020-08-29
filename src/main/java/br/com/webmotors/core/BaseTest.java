package br.com.webmotors.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static br.com.webmotors.core.Driver.getDriver;




public class BaseTest {
	@After
	public void tearDown() {
		geraScreenShot();
		Driver.getDriver().resetApp();
	}
	
	@AfterClass
	public static void finalizaClasse() {
		Driver.quit();
	}
	
	public void geraScreenShot() {
		File imagem = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/imagem.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



