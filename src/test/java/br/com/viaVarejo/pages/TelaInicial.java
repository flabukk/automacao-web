package br.com.viaVarejo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TelaInicial extends BasePage{
	private WebElement webElement;
	private final int TIME_OUT = 30;
	private  TelaGenerica telaGenerica;
	
	public TelaInicial(WebDriver driver) {
		super(driver);
		telaGenerica = new TelaGenerica(driver);
	}
	
	public TelaInicial abrirSite(String url) throws Exception {
		driver.navigate().to(url);
		return this;
	}
	
	public TelaInicial selecionarMenu(String menu) {
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = this.driver.findElement(By.xpath("//li/a[contains(text(),'"+menu+"')]"));
		webElement.click();
		 return this;
	}
	
		
}
