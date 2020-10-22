package br.com.viaVarejo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.viaVarejo.support.TipoOpcao;



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
	
	public TelaInicial maiorIdade(TipoOpcao opcao) {
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		String escolha = "age-gate-button-yes";
		if(opcao.getOpcao().equals("N")) {
			escolha = "age-gate-button-no";
		}
				
		webElement = this.driver.findElement(By.id(escolha));
		webElement.click();
		 return this;
	}
	
	public TelaInicial clicarBtnEntrar(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = this.driver.findElement(By.id("welcome-button-sign-in"));
		webElement.click();
		return this;
	}
	
	public TelaInicial clicarLinkcriarUmaConta(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = this.driver.findElement(By.id("create-account-link"));
		telaGenerica.clicarJS(webElement);
		
		return this;
	}
	
	
	
}
