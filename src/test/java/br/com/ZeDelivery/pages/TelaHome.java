package br.com.ZeDelivery.pages;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaHome extends BasePage{
	private WebElement webElement;
	private TelaGenerica telaGenerica;
	private final int TIME_OUT = 30;
	
	public TelaHome(WebDriver driver) {
		super(driver);
		telaGenerica = new TelaGenerica(driver);
	}


	public void clicarMenuDadosCadastro(){
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.xpath("//img[@alt='person-menu']"));
		webElement.click();
	   
	}
	
	public void validarAcesso() throws InterruptedException{
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		telaGenerica.esperarElemento("//a[text()='Conta e pedidos']", TIME_OUT);
		webElement = driver.findElement(By.xpath("//a[text()='Conta e pedidos']"));
		
		assertTrue(webElement.isDisplayed());
	}	
	
	
	public void validarNome(String nome){
		String textoAcesso;
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.className("css-d9pre5-name"));
		textoAcesso = webElement.getText();
		assertTrue(textoAcesso.equals(nome));
	}	
	
	public void validarEmail(String email){
		String textoAcesso;
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.className("css-izp041-email"));
		textoAcesso = webElement.getText();
		assertTrue(textoAcesso.equals(email));
	}	
	
	public void validarCelular(String celular){
		String textoAcesso;
		telaGenerica.aguardarTelaCarregada(TIME_OUT);
		webElement = driver.findElement(By.className("css-14re9i2-phone"));
		textoAcesso = webElement.getText();
		assertTrue(textoAcesso.equals("+55 "+ formatString(celular, "(##) #####-####")));
	}	
	
	private String formatString(String value, String pattern) {
        MaskFormatter mf;
        try {
            mf = new MaskFormatter(pattern);
            mf.setValueContainsLiteralCharacters(false);
            return mf.valueToString(value);
        } catch (ParseException ex) {
            return value;
        }
    }
	

}
