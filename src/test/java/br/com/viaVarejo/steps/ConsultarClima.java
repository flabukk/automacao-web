package br.com.viaVarejo.steps;



import br.com.viaVarejo.support.ApiOpenWeather;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;



public class ConsultarClima {

	
	@Dado("^que eu quero consultar o clima de uma cidade$")
	public void que_eu_quero_consultar_o_clima_de_uma_cidade() throws Throwable {
	    
	}

	@Quando("^que eu realizo a chamada da api de consultar clima para a cidade \"([^\"]*)\"$")
	public void que_eu_realizo_a_chamada_da_api_de_consultar_clima_para_a_cidade(String nomeCidade) throws Throwable {
		ApiOpenWeather.consultarDadosMeteorologicoPorNomeCidade(nomeCidade);
	}
	
	@Quando("^que eu realizo a chamada da api de consultar clima por ID cidade (\\d+)$")
	public void que_eu_realizo_a_chamada_da_api_de_consultar_clima_por_ID_cidade(int idCidade) throws Throwable {
		ApiOpenWeather.consultarDadosMeteorologicoPorNomeCidade(idCidade);
	}

	@E("^eu valido do ResponseBody o campo \"([^\"]*)\" igual a \"([^\"]*)\"$")
	public void eu_valido_do_ResponseBody_o_campo_igual_a_cidade(String campo, String valor) throws Throwable {
		ApiOpenWeather.validarCampo(campo, valor);
	}
	
	@E("^eu valido do ResponseBody o campo \"([^\"]*)\" igual a (\\d+)$")
	public void eu_valido_do_ResponseBody_o_campo_igual_a_cidade(String campo, int valor) throws Throwable {
		ApiOpenWeather.validarCampo(campo, String.valueOf(valor));
	}

}
