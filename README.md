#cucumber--generated-report-Selenium
	Este projeto rodará o cucumber com selenium
		- Automação WEB

#Pré condições
	- Maven
	- Java 8
	- Eclipse IDE
	
#Configurando ambiente
	- Abrir Eclipse
	- Clonar projeto do Github
	- Importar o projeto
	- Acessar o menu Help > EclipseMarketplace e digitar Cucumber. 
		(Realizar a instalação do Cucumber Eclipse Plugin)
	- Buildar projeto para importar as dependencias
		
#Executando a automação
	Podemos executar a automação de algumas formas, segue abaixo.

	1 - A partir do Runner (\src\test\java\br\com\viaVarejo\runner\RunCucumberTest.java)
		Com o Runner podemos executar diversos cenáios, 
		diversas Features ou um unico cenário (informando a Tag e caminho da feature).
		- Executar: Botão direito no runner "RunCucumberTest" >> Run As >> JUnit Test
		
				
	2 - A partir de uma Feature (\src\resources\features)
		- Executar: Botão direito na Feature "PesquisarQA.feature" >> Run As >> Cucumber Feature
		
		
	3 - No Build do projeto	
		- Executar: 
		  Botão direito na pasta principal do Projeto >> Build Path >> 
		  	Configure Build Path >> Alterar para JDK;
		  Botão direito na pasta principal do Projeto >> Run As >> Maven Clean;
		  Botão direito na pasta principal do Projeto >> Run As >> Maven Install;
					

#Artefatos de execução
		Estou utilizando a dependencia "com.trivago.rta" para geração do report
		 após o build do projeto (Saída: \target\generated-report)
		 
			    <groupId>com.trivago.rta</groupId>
			    <artifactId>cluecumber-report-plugin</artifactId>
			    <version>2.5.0</version>
			   
		