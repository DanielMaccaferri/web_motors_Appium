package br.com.webmotors.core;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Driver {
	
	private static AndroidDriver<?> driver;

    public static  AndroidDriver<?> getDriver(){
        if(driver == null){
            conectar();
        }
        return driver;
    }

    private static AndroidDriver<?> conectar() {
        File diretorioAplicacao = new File("app");
		File arquivoAplicacao = new File(diretorioAplicacao, "Webmotors.apk");

		DesiredCapabilities capacidade = new DesiredCapabilities();
        capacidade.setCapability("deviceName", "emulator-5554");
        capacidade.setCapability("platformName", "Android");
        capacidade.setCapability("app", arquivoAplicacao.getAbsolutePath());
        capacidade.setCapability("automationName", "UiAutomator1");
        capacidade.setCapability("newCommandTimeout", 4600);
        capacidade.setCapability("unicodeKeyboard", true);
        capacidade.setCapability("resetKeyboard", true);

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capacidade);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }


    public static WebDriverWait esperarpeloDriver(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait;
    }
    
	public static AndroidDriver<?> encerrarDriver() {
		if (driver!= null) {
			driver.quit();
		}
		return driver;
    }

	public static void quit() {
		// TODO Auto-generated method stub
		
	}

}
