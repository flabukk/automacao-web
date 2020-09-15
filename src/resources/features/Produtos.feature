# language: pt
@Produtos
Funcionalidade: Tela de produtos
  Sendo eu um cliente do Zé delivery
  quero verificar os produtos disponíveis.

  Contexto: 
    Dado que estou LOGADO no site "https://www.ze.delivery/"
    
	@NãoImplementado
  Esquema do Cenário: Verificar na tela de produtos a pesquisa de bebidas do tipo Cervejas
  	E eu busco um endereço válido <endereco>
  	Quando eu consulto um tipo de bebida <produto>
  	Então é exibido a página de produto filtrado com o produto <produto> 
  	
  	
    Exemplos: 
      | produto  			| endereco 											 | 
      | "Cervejas"		| "automacao10006@gmail.com"  	 |
     
	@NãoImplementado
  Esquema do Cenário: Verificar na tela de produtos a pesquisa de bebidas do tipo Destilados
  	E eu busco um endereço válido <endereco>
  	Quando eu consulto um tipo de bebida <produto>
  	Então é exibido a página de produto filtrado com o produto <produto> 
  	
  	
    Exemplos: 
      | produto  				| endereco 							 | 
      | "Destilados"		| "Rua jupiter, 257"  	 |
      
      
   @NãoImplementado
  Esquema do Cenário: Verificar na tela de produtos a pesquisa de bebidas do tipo Vinhos
  	E eu busco um endereço válido <endereco>
  	Quando eu consulto um tipo de bebida <produto>
  	Então é exibido a página de produto filtrado com o produto <produto> 
  	
  	
    Exemplos: 
      | produto  				| endereco 							 | 
      | "Vinhos"    		| "Rua jupiter, 257"  	 |   