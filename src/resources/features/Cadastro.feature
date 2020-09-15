# language: pt
@CadastroUsuario
Funcionalidade: Cadastro de Usuario no sistema do Zé Delivery
  Sendo eu um cliente do Zé delivery
  quero automatizar o cadastro de usuario

  Contexto: 
    Dado que estou no site "https://www.ze.delivery/"
    
	@Regressivo
  Esquema do Cenário: Cadastrar usuário válido
  	E que informo maior idade
  	Quando eu acesso a pagina de cadastro
  	E preencho o campo Nome e sobrenome com o valor <nome_sobrenome>
  	#E preencho o campo E-mail com o valor <email>
  	E preencho o campo E-mail com um valor de e-mail genérico
  	E preencho o campo Senha com o valor "Automacao001"
  	E preencho o campo CPF com o valor <cpf>
  	E preencho o campo Celular com o valor <telefone>
  	E preencho o campo 'Qual a sua idade?' com o valor "23"
  	E aceito os termos
  	E aceito as Notificações
  	E confirmo o cadastro
  	Então é exibido a página inicial do sistema
  	E eu verifico se o nome cadastrado é igual a <nome_sobrenome>
  	E eu verifico se o telefone cadastrado é igual a <telefone>
  	
  	
    Exemplos: 
      | nome_sobrenome  | email 											 | cpf					  | telefone      |
      | "Ze Delivery"		| "automacao10006@gmail.com"  | "37366727059"  | "11977454286" |
     
	