package br.com.viaVarejo.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import br.com.viaVarejo.pages.TelaInicial;
import br.com.viaVarejo.pages.TelaPesquisaQA;
import br.com.viaVarejo.support.Aplicacao;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;




/**
 * @author Flavio Pacheco
 *
 */
public class PesquisarQA {
	
	protected static WebDriver driver;	
	
	public PesquisarQA() throws Exception{
		driver = Aplicacao.abrirAplicacao();
	}
	
	
	@Dado("^que estou no site \"([^\"]*)\"$")
	public void que_estou_no_site(String url) throws Throwable {
		new TelaInicial(driver).abrirSite(url);
	}

	
	
	@Dado("^que eu acesse a página da VV Test$")
	public void queEuAcesseAPáginaDaVVTest() throws Throwable {
		new TelaInicial(driver).abrirSite("https://bit.ly/3jOMrR9");
	}

	@Dado("^acesse o menu \"([^\"]*)\"$")
	public void acesseOMenu(String menu) throws Throwable {
		new TelaInicial(driver).selecionarMenu(menu);
	}

	@Quando("^eu preencher todos os campos obrigatórios$")
	public void euPreencherTodosOsCamposObrigatórios() throws Throwable {
		TelaPesquisaQA tela = new TelaPesquisaQA(driver);
		tela.preencherNome("Flávio");
		tela.preencherSobrenome("Pinheiro Pacheco");
		tela.preencherEmail("flavio.flabukk@gmail.com");
		tela.preencherConfirmacaoEmail("flavio.flabukk@gmail.com");
		tela.selecionarIdade("31-49");
		tela.selecionarTempoExperienciaQA("mais de 5 anos");
		tela.selecionarInteresseNaArea("Desafio");
		tela.selecionarOQuePrecisaMelhorar("Negócio");
		tela.preencherLinguagemProgramacao("Java");
		tela.clicarBotaoEnviar();
	}

	@Então("^deve ser direcionado para uma página de sucesso$")
	public void deveSerDirecionadoParaUmaPáginaDeSucesso() throws Throwable {
		new TelaPesquisaQA(driver).validarSucessoDaPesquisa();
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
