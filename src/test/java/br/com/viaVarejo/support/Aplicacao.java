package br.com.viaVarejo.support;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.viaVarejo.support.browser.WebDriverFactory;




public class Aplicacao {
		
	protected static WebDriver webDriver;	
	private final static long TIME_OUT = 30;
	protected static WebDriverWait webDriverWait;
	

	public static WebDriver abrirAplicacao() throws Exception{
		//encerrarProcesso("chromedriver");
		webDriver = WebDriverFactory.getWebDriver("chrome");
		webDriverWait = new WebDriverWait(webDriver, TIME_OUT);
		webDriver.manage().window().maximize();
		return webDriver;	
    }
    
    public void fechar(){
    	if (webDriver != null){
			webDriver.close();
			webDriver.quit();
		}
    }
    
    public static WebDriver getDriver(){
		return webDriver;
	}
    
    /**encerrarProcesso
     * @param processo
     * @return
     * @throws IOException
     */
    public static boolean encerrarProcesso(String processo) throws IOException {
        try {
            String line;
            Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                if (!line.trim().equals("")) {
                    if (line.substring(1, line.indexOf("\"", 1)).equalsIgnoreCase(processo)) {
                        Runtime.getRuntime().exec("taskkill /F /IM " + line.substring(1, line.indexOf("\"", 1)));
                        return true;
                    }
                }
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
        return false;
    }

}
