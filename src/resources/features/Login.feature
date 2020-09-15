# language: pt
@Login
Funcionalidade: Validação de acessos no sistema do Zé Delivery
  Sendo eu um cliente do Zé delivery
  quero automatizar os acessos ao sistema

  Contexto: 
    Dado que estou no site "https://www.ze.delivery/"

	@Regressivo
  Esquema do Cenário: Cadastrar usuário válido
  	E que informo maior idade
  	Quando eu acesso a pagina de Login
  	E realizo o acesso com o E-mail <email> e senha <senha>
  	Então é exibido a página inicial do sistema
   	E eu verifico se o e-mail cadastrado é igual a <email>
  	
    Exemplos: 
      | email 										 | senha 					|	
      | "automacao1010@gmail.com" | "Automacao001" |
     
