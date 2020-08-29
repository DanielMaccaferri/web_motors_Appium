package br.com.webmotors.core;


	import static br.com.webmotors.core.Driver.getDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

	public class BaseScreen {
		
//		public void esperarPorElementoVisivel() {
//			WebDriverWait wait = new WebDriverWait(getDriver(), 15);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hands.android.webmotors:id/btSkipLogin")))
//			;
//		}

		public void escrever(By by, String texto) {
			getDriver().findElement(by).sendKeys(texto);
		}

		public String obterTexto(By by) {
			return getDriver().findElement(by).getText();
		}

		public void selecionarCombo(By by, String valor) {
			getDriver().findElement(by).click();
			clicarPorTexto(valor);
		}

		public void clicarPorTexto(String texto) {
			clicar(By.xpath("//*[@text='" + texto + "']"));
		}

		public boolean isCheckMarcado(By by) {
			return getDriver().findElement(by).getAttribute("checked").equals("true");
		}

		public void clicar(By by) {
			getDriver().findElement(by).click();
		}

		public boolean existeElementoPorTexto(String texto) {
			List<MobileElement> elementos = (List<MobileElement>) getDriver()
					.findElements(By.xpath("//android.widget.TextView[@text='" + texto + "']"));
			return elementos.size() > 0;
		}

		public void scrollDown() {
			scroll(0.9, 0.1);
		}

		public void scrollUp() {
			scroll(0.1, 0.9);
		}

		public void swipeLeft() {
	       swipe(0.1,0.9);
		}

		public void swipeRight() {
			swipe(0.9,0.1);
		}
		
		public void tap(int x, int y) {
			new TouchAction(getDriver()).press(PointOption.point(x, y)).release().perform();
		}

		public void scrollText() {
			getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\"Opção bem escondida\"))")).click();
		}
			
		
		//public void scrollTextPegarTexto(String texto) {
			//getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\'"texto\'))")).click();
		
		public void scroll(double inicio, double fim) {
			Dimension size = getDriver().manage().window().getSize();

			int x = size.width / 2;

			int start_y = (int) (size.height * inicio);
			int end_y = (int) (size.height * fim);

			new TouchAction(getDriver()).press(PointOption.point(x, start_y))
					.waitAction(waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(x, end_y)).release()
					.perform();

		}

		public String obterMensagemAlerta() {
			return obterTexto(By.id("android:id/message"));
		}

		public void swipe(double inicio, double fim) {
			Dimension size = getDriver().manage().window().getSize();

			int y = size.height / 2;

			int start_x = (int) (size.width * inicio);
			int end_x = (int) (size.width * fim);

			new TouchAction(getDriver()).press(PointOption.point(start_x, y))
					.waitAction(waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(end_x, y)).release()
					.perform();
		}
		
		public void swipeElement(MobileElement element,double inicio, double fim) {
			int y = element.getLocation().y +(element.getSize().height / 2);

			int start_x = (int) (element.getSize().width * inicio);
			int end_x = (int) (element.getSize().width * fim);

			new TouchAction(getDriver()).press(PointOption.point(start_x, y))
					.waitAction(waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(end_x, y)).release()
					.perform();
		}

	}


