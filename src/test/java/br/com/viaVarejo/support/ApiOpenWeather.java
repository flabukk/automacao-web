package br.com.viaVarejo.support;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import joptsimple.internal.Strings;


public class ApiOpenWeather {
	public static Response response;
	public static JSONObject jsonResponseBody;
	public ValidatableResponse json;
	private static String apiKey = "439d4b804bc8187953eb36d2a8c26a02";
	private static String endPointCidade = "https://samples.openweathermap.org/data/2.5/weather";
	
	
	/**executarAPI
	 * @param endPoint
	 * @param requestType
	 * @param requestBody
	 * @param params
	 * @return
	 */
	private static JSONObject executarAPI(String endPoint, String requestType, 
							String requestBody, Map<String, String> params) {
		RestAssured.baseURI = endPoint;
		RequestSpecification httpRequest = RestAssured.given()
				.params(params)
				.param("appid", apiKey);
		
		switch (requestType) {
		case "POST":
			response = httpRequest.post();
			break;
		case "GET":
			//response = httpRequest.get("?lat=35&lon=139");
			response = httpRequest.get();
			break;	

		default:
			break;
		}
		jsonResponseBody = new JSONObject(response.body().asString());
		
		return jsonResponseBody;
		
	}
	
	/**consultarDadosMeteorologicoPorNomeCidade
	 * @param nomeCidade
	 * @return
	 */
	public static JSONObject consultarDadosMeteorologicoPorNomeCidade(String nomeCidade) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("q", nomeCidade);
		return executarAPI(endPointCidade, "GET", Strings.EMPTY, params);
	}
	
	/**consultarDadosMeteorologicoPorNomeCidade
	 * @param idCidade
	 * @return
	 */
	public static JSONObject consultarDadosMeteorologicoPorNomeCidade(int idCidade) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("q", String.valueOf(idCidade));
		return executarAPI(endPointCidade, "GET", Strings.EMPTY, params);
	}
	
	/**consultarDadosMeteorologicoPorIDCidade
	 * @param endPoint
	 * @param idCidade
	 * @return
	 */
	public static JSONObject consultarDadosMeteorologicoPorIDCidade(String endPoint, String idCidade) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("id", idCidade);
		return executarAPI(endPointCidade, "GET", Strings.EMPTY, params);
	}
	
	/**validarStatusCode
	 * @param status
	 */
	public static void validarStatusCode(String status) {
		response.then().log().all().statusCode(Integer.valueOf(status));
	}
	
	/**validarCampo
	 * @param campo
	 * @param valor
	 */
	public static void validarCampo(String campo, String valor) {
		String valorRecuperado;
		valorRecuperado = response.then().extract().jsonPath().getString(campo);
		assertTrue(valorRecuperado.equals(valor));
	}
	
}
