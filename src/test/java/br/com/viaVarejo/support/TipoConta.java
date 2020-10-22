package br.com.viaVarejo.support;

public enum TipoConta {

	EMAIL("e-mail"),
	FACEBOOK("Facebook");
    
    private String opcao;
    
    private TipoConta(String opcao){
        this.opcao = opcao;
    }
    
    public String getOpcao(){
        return opcao;
    }
    
    public void setOpcao(String opcao){
        this.opcao = opcao;
    }
}
