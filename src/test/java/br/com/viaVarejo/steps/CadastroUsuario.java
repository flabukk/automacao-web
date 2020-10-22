package br.com.viaVarejo.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import br.com.viaVarejo.pages.TelaCadastro;
import br.com.viaVarejo.pages.TelaHome;
import br.com.viaVarejo.pages.TelaInicial;
import br.com.viaVarejo.pages.TelaLogin;
import br.com.viaVarejo.support.Aplicacao;
import br.com.viaVarejo.support.TipoOpcao;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;




public class CadastroUsuario {
	
	protected static WebDriver driver;	
	
	public CadastroUsuario() throws Exception{
		driver = Aplicacao.abrirAplicacao();
	}
	
	
	@Dado("^que estou no site \"([^\"]*)\"$")
	public void que_estou_no_site(String url) throws Throwable {
		new TelaInicial(driver).abrirSite(url);
	}

	@Dado("^que informo maior idade$")
	public void que_informo_maior_idade() throws Throwable {
		new TelaInicial(driver).maiorIdade(TipoOpcao.SIM);
	}

	@Quando("^eu acesso a pagina de cadastro$")
	public void eu_acesso_a_pagina_de_cadastro() throws Throwable {
		new TelaInicial(driver).clicarBtnEntrar();
		new TelaInicial(driver).clicarLinkcriarUmaConta();
	}

	@Quando("^preencho o campo Nome e sobrenome com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_Nome_e_sobrenome_com_o_valor(String nomeSobrenome) throws Throwable {
		new TelaCadastro(driver).preencherNomeSobrenome(nomeSobrenome);
	}
	
	@Quando("^preencho o campo E-mail com um valor de e-mail genérico$")
	public void preencho_o_campo_E_mail_com_um_valor_de_e_mail_genérico() throws Throwable {
		new TelaCadastro(driver).preencherEmailAleatorio();
	}

	@E("^preencho o campo E-mail com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_E_mail_com_o_valor(String email) throws Throwable {
		new TelaCadastro(driver).preencherEmail(email);
	}

	@E("^preencho o campo Senha com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_Senha_com_o_valor(String senha) throws Throwable {
		new TelaCadastro(driver).preencherSenha(senha);
	}

	@E("^preencho o campo CPF com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_CPF_com_o_valor(String cpf) throws Throwable {
		new TelaCadastro(driver).preencherCPF(cpf);
	}


	@Quando("^preencho o campo Celular com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_Celular_com_o_valor(String celular) throws Throwable {
		new TelaCadastro(driver).preencherCelular(celular);
	}

	@Quando("^preencho o campo 'Qual a sua idade\\?' com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_Qual_a_sua_idade_com_o_valor(String idade) throws Throwable {
		new TelaCadastro(driver).preencherIdade(idade);
	}

	@Quando("^aceito os termos$")
	public void aceito_os_termos() throws Throwable {
		new TelaCadastro(driver).confirmarTermo();
	}
	
	@Quando("^aceito as Notificações$")
	public void aceito_as_Notificações() throws Throwable {
		new TelaCadastro(driver).confirmarNotificacoes();
	}

	@Quando("^confirmo o cadastro$")
	public void confirmo_o_cadastro() throws Throwable {
		new TelaCadastro(driver).clicarBotaoContinuar();
		new TelaCadastro(driver).validarMaisTarde();
	}

	@Então("^é exibido a página inicial do sistema$")
	public void é_exibido_a_página_inicial_do_sistema() throws Throwable {
		new TelaHome(driver).validarAcesso();
		new TelaHome(driver).clicarMenuDadosCadastro();
	}

	@Então("^eu verifico se o nome cadastrado é igual a \"([^\"]*)\"$")
	public void eu_verifico_se_o_nome_cadastrado_é_igual_a(String nome) throws Throwable {
		new TelaHome(driver).validarNome(nome);
	}

	@Então("^eu verifico se o e-mail cadastrado é igual a \"([^\"]*)\"$")
	public void eu_verifico_se_o_e_mail_cadastrado_é_igual_a(String email) throws Throwable {
		new TelaHome(driver).validarEmail(email);
	}

	@Então("^eu verifico se o telefone cadastrado é igual a \"([^\"]*)\"$")
	public void eu_verifico_se_o_telefone_cadastrado_é_igual_a(String celular) throws Throwable {
		new TelaHome(driver).validarCelular(celular);
	}
	
	
	
	@Quando("^eu acesso a pagina de Login$")
	public void eu_acesso_a_pagina_de_Login() throws Throwable {
	    new TelaInicial(driver).clicarBtnEntrar();
	}

	@Quando("^realizo o acesso com o E-mail \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void realizo_o_acesso_com_o_E_mail_e_senha(String email, String senha) throws Throwable {
	    new TelaLogin(driver).preencherEmail(email);
	    new TelaLogin(driver).preencherSenha(senha);
	    new TelaLogin(driver).clicarBtnEntrar();
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
