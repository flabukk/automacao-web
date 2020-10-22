package br.com.viaVarejo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.viaVarejo.support.Generator;


public class TelaCadastro extends BasePage{
	private WebElement webElement;
	private TelaGenerica telaGenerica;
	private final int TIME_OUT = 30;

	public TelaCadastro(WebDriver driver) {
		super(driver);
		telaGenerica = new TelaGenerica(driver);
	}
	
	public void criarUmaConta(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("create-account-link"));		
		webElement.click();
	}
	
	public void preencherNomeSobrenome(String nomeSobrenome){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-name"));
		telaGenerica.digitarEspecial(webElement, nomeSobrenome);
	}
	
	public void preencherEmail(String email){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-email"));
		telaGenerica.digitarEspecial(webElement, email);
	}
	
	public void preencherEmailAleatorio(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-email"));
		
		String email = "automacao" + Generator.numeroAleatorio() + "@gmail.com";
		telaGenerica.digitarEspecial(webElement, email);
		System.out.println("Digitado o E-mail: " +email);
	}
	
	public void preencherSenha(String senha){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-password"));
		telaGenerica.digitarEspecial(webElement, senha);
	}
	
	public void preencherCPF(String cpf){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-document"));
		telaGenerica.scrollView(webElement);
		telaGenerica.digitarEspecial(webElement, cpf);
	}
	
	public void preencherCelular(String celular){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-phone"));
		telaGenerica.digitarEspecial(webElement, celular);
	}
	
	
	public void preencherIdade(String idade){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-input-age"));
		telaGenerica.scrollView(webElement);
		telaGenerica.digitarEspecial(webElement, idade);
	}
	
	public void confirmarTermo(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("sign-up-form-input-terms"));
		telaGenerica.scrollView(webElement);
		telaGenerica.clicarEspecial(webElement);
	}
	
	public void confirmarNotificacoes(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("sign-up-form-input-marketing"));
		telaGenerica.scrollView(webElement);
		telaGenerica.clicarEspecial(webElement);
	}
	
	public void validarMaisTarde() throws InterruptedException{
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		telaGenerica.esperarElemento("//*[contains(@id,'confirm-phone-link-validate-later')]", TIME_OUT);
		webElement = driver.findElement(By.id("confirm-phone-link-validate-later"));
		telaGenerica.clicarEspecial(webElement);
	}
	
	public void clicarBotaoContinuar(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("signup-form-button-signup"));
		telaGenerica.scrollView(webElement);
		webElement.click();
	}
	
	
	
	
}
