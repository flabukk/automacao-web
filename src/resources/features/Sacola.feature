# language: pt
@Produtos
Funcionalidade:  Sendo eu um cliente do Zé delivery
  quero verificar minha Sacola de compras.

  Contexto: 
    Dado que estou na tela de Produtos
    
	@NãoImplementado
  Esquema do Cenário: Verificar em minha Sacola a(s) bebida(s) escolhida(s).
  	Quando eu consulto um tipo de bebida <tipoBebida>
  	E eu adiciono <qtdeBebida> bebida(s) <nomeBebida> na sacola
  	Então é exibido em minha Sacola a bebida <nomeBebida>
  	E eu valido a quantidade <qtdeBebida> de bebida(s) adicionada
  	  	
  	
    Exemplos: 
      | tipoBebida		| qtdeBebida | nomeBebida 		|
      | "Cervejas"		| 1			  	 | "Brahma 473ml" |
     
    
  @NãoImplementado
  Esquema do Cenário: Verificar em minha Sacola o valor total a pagar COM o valor de Frete
  	Quando eu consulto um tipo de bebida <tipoBebida>
  	E eu adiciono <qtdeBebida> bebida(s) <nomeBebida> na sacola
  	E eu salvo o valor unitário da minha bebida "valorBebida"
  	E eu multiplico o valor da bebida "{valorBebida}" com a quantidade <qtdeBebida> e salvo o resultado em "valorTotalBebidas"
  	Então é exibido em minha Sacola a bebida <nomeBebida>
  	E eu valido o valor "{valorTotalBebidas}" + valor Frete com o valor total a pagar
  	  	
  	
    Exemplos: 
      | tipoBebida		| qtdeBebida | nomeBebida 		|
      | "Cervejas"		| 1			  	 | "Brahma 473ml" | 

      
  @NãoImplementado
  Esquema do Cenário: Verificar em minha Sacola o valor total a pagar SEM o valor de Frete
  	Quando eu consulto um tipo de bebida <tipoBebida>
  	E eu adiciono <qtdeBebida> bebida(s) <nomeBebida> na sacola
  	E eu salvo o valor unitário da minha bebida "valorBebida"
  	E eu multiplico o valor da bebida "{valorBebida}" com a quantidade <qtdeBebida> e salvo o resultado em "valorTotalBebidas"
  	Então é exibido em minha Sacola a bebida <nomeBebida>
  	E eu valido o valor "{valorTotalBebidas}" com a soma do(s) valor(ers) do(s) produto(s) adicionado(s)
  	  	
  	
    Exemplos: 
      | tipoBebida		| qtdeBebida | nomeBebida 		|
      | "Cervejas"		| 1			  	 | "Brahma 473ml" |     