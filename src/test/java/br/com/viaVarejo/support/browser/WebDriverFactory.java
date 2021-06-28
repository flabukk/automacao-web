package br.com.viaVarejo.support.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import br.com.viaVarejo.support.browser.exception.BrowserException;



/**
 * 
 * Name: {@link WebDriverFactory}

 */
public class WebDriverFactory {
	
	
	final static String INTERNET_EXPLORER = "internetexplorer";
	
	final static String FIREFOX = "firefox";
	
	final static String CHROME = "chrome";
	
	final static String EDGE = "edge";
	
	private static WebDriver driver;	
	
	
	
	/**
	 * Obter o web driver (IE, Firefox, Chrome)
	 * @param browserType
	 * @return
	 * @throws Exception
	 */
	public static WebDriver getWebDriver(BrowserType browserType) throws Exception {
		return getWebDriver(browserType.toString());
	}
	
	
	/**
	 * Obter tipo do browser informado pelo usu�rio
	 * @param BrowserType
	 * @param addressSelenium
	 * @return
	 * @throws Exception
	 */
	public static WebDriver getWebDriver(String browserType) throws Exception {
		
		switch (browserType.toLowerCase()) {	    	  		    
		    case CHROME:
		    	return getChromeDriver(); 
		  
		    default:
		    	String e = "N�o foi informado browser suportado pela aplica��o";
				throw new BrowserException(e);
		}
	}
	
		
	/**
	 * Obter driver do Chrome
	 * @return
	 */
	
	private static WebDriver getChromeDriver() {
 	   ChromeOptions options= new ChromeOptions();
 	   options.addArguments("--disable-extensions");
	   		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			return new ChromeDriver(options);
}
	
	/**
	 * Troca contexto do webdriver
	 * @param webDriver
	 * @param browserType
	 * @return
	 * @throws Exception
	 */
	public static WebDriver changeWebDriver(WebDriver webDriver, BrowserType browserType) throws Exception{
		webDriver.close();
		webDriver.quit();
		return getWebDriver(browserType);
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
}
