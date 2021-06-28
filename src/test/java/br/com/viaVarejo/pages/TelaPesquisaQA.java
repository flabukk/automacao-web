package br.com.viaVarejo.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.viaVarejo.support.Generator;


/**
 * @author Flavio Pacheco
 *
 */
public class TelaPesquisaQA extends BasePage{
	private WebElement webElement;
	private TelaGenerica telaGenerica;
	private final int TIME_OUT = 30;

	public TelaPesquisaQA(WebDriver driver) {
		super(driver);
		telaGenerica = new TelaGenerica(driver);
	}
	
	public void criarUmaConta(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("create-account-link"));		
		webElement.click();
	}
	
	public void preencherNome(String nome){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-5"));
		telaGenerica.digitarEspecial(webElement, nome);
	}
	
	public void preencherSobrenome(String sobrenome){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-6"));
		telaGenerica.digitarEspecial(webElement, sobrenome);
	}
	
	public void preencherEmail(String email){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-7"));
		telaGenerica.digitarEspecial(webElement, email);
	}
	
	public void preencherConfirmacaoEmail(String email){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-8"));
		telaGenerica.digitarEspecial(webElement, email);
	}
	
	
	public void preencherEmailAleatorio(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-7"));
		
		String email = "automacao" + Generator.numeroAleatorio() + "@gmail.com";
		telaGenerica.digitarEspecial(webElement, email);
		System.out.println("Digitado o E-mail: " +email);
	}
	
	
	/**selecionarIdade
	 * @param idade (18-30, 31-49 ou 49+)
	 */
	public void selecionarIdade(String idade){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.xpath("//li/label[contains(text(),'"+idade+"')]"));
		telaGenerica.scrollView(webElement);
		webElement.click();
	}
	
	
	/**selecionarTempoExperienciaQA
	 * @param experiencia [Iniciando na área, Menos de 5 anos ou mais de 5 anos]
	 */
	public void selecionarTempoExperienciaQA(String experiencia){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		try {
			Select comboBox = new Select(driver.findElement(By.id("nf-field-11")));
			comboBox.selectByVisibleText(experiencia);
		}catch(Exception ex) {
			
		}
	}
	
	
	/**selecionarInteresseNaArea
	 * @param interesse [Desafio, Salário ou Sou mega chato]
	 */
	public void selecionarInteresseNaArea(String interesse){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		
		try {
			Select comboBox = new Select(driver.findElement(By.id("nf-field-12")));
			comboBox.selectByVisibleText(interesse);
		}catch(Exception ex) {
			
		}
		
	}
	
	
	public void selecionarOQuePrecisaMelhorar(String opcao){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.xpath("//li/label[contains(text(),'"+opcao+"')]"));
		telaGenerica.scrollView(webElement);
		webElement.click();
	}
	
	
	public void preencherLinguagemProgramacao(String linguagem){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-14"));
		telaGenerica.digitarEspecial(webElement, linguagem);
	}
	
	public void clicarBotaoEnviar(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.id("nf-field-16"));
		telaGenerica.scrollView(webElement);
		webElement.click();
	}
	
	
	public void validarSucessoDaPesquisa() throws InterruptedException{
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		telaGenerica.esperarElemento("//p[text()='Your form has been successfully submitted.']", TIME_OUT);
		webElement = driver.findElement(By.xpath("//p[text()='Your form has been successfully submitted.']"));
		assertTrue(telaGenerica.isClicavel(webElement, TIME_OUT));
	}
	
	
	
}
