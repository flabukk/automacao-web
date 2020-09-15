# language: pt
Funcionalidade: Consultar dados metereologicos
  a partir de uma requisição do tipo GET

	Contexto
			Dado que eu quero consultar o clima de uma cidade

	@Regressivo
  Esquema do Cenário: Consultar clima por cidade e verificar se o campo NAME retorna o nome da Cidade informado na consulta
  	Quando que eu realizo a chamada da api de consultar clima para a cidade <cidade>
  	E eu valido do ResponseBody o campo "name" igual a <cidade>
  	  	
    Exemplos: 
      | status    | cidade   | 
      | 200			| "London" |

      
      
   @Regressivo 
   Esquema do Cenário: Consultar clima por idCidade e verificar se o campo NAME retorna o nome da Cidade informado na consulta
  	Quando que eu realizo a chamada da api de consultar clima por ID cidade <idCidade>
  	E eu valido do ResponseBody o campo "name" igual a <cidade>
  	  	  	
    Exemplos: 
      | status    | cidade   | idCidade |
      | 200			  | "London" |  2172797 |