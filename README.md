#cucumber--generated-report-Selenium-rest-assured
	Este projeto rodará o cucumber com rest-assured e selenium
		- Automação WEB e API

#Pré condições
	- Maven
	- Java 8
	- Eclipse IDE
	
#Configurando ambiente
	- Abrir Eclipse
	- Clonar projeto do Github
	- Importar o projeto
	- Acessar o menu Help > EclipseMarketplace e digitar Cucumber. (Realizar a instalação do Cucumber Eclipse Plugin)
	- Buildar projeto para importar as dependencias
		
#Executando a automação
	Podemos executar a automação de algumas formas, segue abaixo.

	1 - A partir do Runner (\src\test\java\br\com\ZeDelivery\runner\RunCucumberTest.java)
		Com o Runner podemos executar diversos cenáios, diversas Features ou um unico cenário (informando a Tag e caminho da feature), porém já temos uma condição configurada em nosso Runner, onde estamos 
		executando todos os cenários que contém a Tag @Regressivo (Busca em todas as Features que esteja dentro do parametro: features de nosso runner), 
		que são os cenários que estão com os steps implementados.
		- Executar: Botão direito no runner "RunCucumberTest" >> Run As >> JUnit Test
		
				
	2 - A partir de uma Feature (\src\resources\features)
		- Executar: Botão direito na Feature "Cadastro.feature" >> Run As >> Cucumber Feature
		
		
	3 - No Build do projeto	
		- Executar: 
					Botão direito na pasta principal do Projeto >> Build Path >> Configure Build Path >> Alterar para JDK
					Botão direito na pasta principal do Projeto >> Run As >> Maven Clean
					Botão direito na pasta principal do Projeto >> Run As >> Maven Install
					

#Artefatos de execução
		Estou utilizando a dependencia "com.trivago.rta" para geração do report após o build do projeto (Saída: \target\generated-report)
			    <groupId>com.trivago.rta</groupId>
			    <artifactId>cluecumber-report-plugin</artifactId>
			    <version>2.5.0</version>
			   

#Cobertura dos testes, os cenários estão descritos no código da automação (BDD)

	#Sistema Zé Delivery mapeado os seguintes cenários:
		- Cadastro: Funcionalidade de alta importância e criticidade, pois para todas as compras é necessário ter um cadastro
		- Login: As compras só são efetivadas com um usuário logado
		- Pesquisa de Produtos: Importante que o cliente tenha um estoque ativo e buscas customizadas de produtos 
			e sem Selecionar um produto não será possivel efetivar uma compra.
		- Sacola: Importante validar se os produtos estão com os valores conforme a busca e que o cliente não pague um valor menor nem menor do que está sendo exibido,
		 a não ser se utilize um cupom de desconto.
		
	#API Open Weather: Estruturado na automação a chamada das api's
		- Consulta de cidade por nome
		- Consulta de cidade por id
		**Os casos não estão abrangendo 100% da ro retorno da requisição, apenas validação do parametro informado no Request (Ex.: id cidade e nome cidade)
				
		