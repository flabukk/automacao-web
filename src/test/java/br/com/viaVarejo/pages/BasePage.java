package br.com.viaVarejo.pages;
import org.openqa.selenium.WebDriver;

/**
 * @author Flavio Pacheco
 *
 */
public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
}
