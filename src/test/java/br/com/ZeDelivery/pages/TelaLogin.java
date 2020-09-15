package br.com.ZeDelivery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaLogin extends BasePage{
	private WebElement webElement;
	private final int TIME_OUT = 30;
	private  TelaGenerica telaGenerica;
	
	
	public TelaLogin(WebDriver driver) {
		super(driver);
		telaGenerica = new TelaGenerica(driver);
	}

	public TelaLogin clicarContinuarFacebook(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("login-facebook-button-sign-in"));
		webElement.click();
		return this;
	   
	}
	
	public TelaLogin preencherEmail(String email){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("login-mail-input-email"));
		telaGenerica.digitarEspecial(webElement, email);
		return this;
	}
	
	public TelaLogin preencherSenha(String senha){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("login-mail-input-password"));
		telaGenerica.digitarEspecial(webElement, senha);
		return this;
	   
	}
	
	public TelaLogin clicarBtnEntrar(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("login-mail-button-sign-in"));
		webElement.click();
		return this;
	}
	

}
