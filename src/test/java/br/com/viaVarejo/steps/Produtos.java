package br.com.viaVarejo.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import br.com.viaVarejo.support.Aplicacao;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;




public class Produtos {
	
	protected static WebDriver driver;	
	
	public Produtos() throws Exception{
		driver = Aplicacao.abrirAplicacao();
	}
	
	
	@Dado("^que estou na tela de Produtos$")
	public void que_estou_na_tela_de_Produtos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^eu consulto um tipo de bebida \"([^\"]*)\"$")
	public void eu_consulto_um_tipo_de_bebida(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^eu adiciono (\\d+) bebida\\(s\\) \"([^\"]*)\" na sacola$")
	public void eu_adiciono_bebida_s_na_sacola(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^é exibido em minha Sacola a bebida \"([^\"]*)\"$")
	public void é_exibido_em_minha_Sacola_a_bebida(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^eu valido a quantidade (\\d+) de bebida\\(s\\) adicionada$")
	public void eu_valido_a_quantidade_de_bebida_s_adicionada(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^eu salvo o valor unitário da minha bebida \"([^\"]*)\"$")
	public void eu_salvo_o_valor_unitário_da_minha_bebida(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^eu multiplico o valor da bebida \"([^\"]*)\" com a quantidade (\\d+) e salvo o resultado em \"([^\"]*)\"$")
	public void eu_multiplico_o_valor_da_bebida_com_a_quantidade_e_salvo_o_resultado_em(String arg1, int arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^eu valido o valor \"([^\"]*)\" \\+ valor Frete com o valor total a pagar$")
	public void eu_valido_o_valor_valor_Frete_com_o_valor_total_a_pagar(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^eu valido o valor \"([^\"]*)\" com a soma do\\(s\\) valor\\(ers\\) do\\(s\\) produto\\(s\\) adicionado\\(s\\)$")
	public void eu_valido_o_valor_com_a_soma_do_s_valor_ers_do_s_produto_s_adicionado_s(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@After
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/" + cenario.getName() + ".jpg"));
			if (driver != null){
				driver.close();
				driver.quit();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
