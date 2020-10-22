package br.com.viaVarejo.support;

public enum TipoOpcao {

	SIM("S"),
	NAO("N");
    
    private String opcao;
    
    private TipoOpcao(String opcao){
        this.opcao = opcao;
    }
    
    public String getOpcao(){
        return opcao;
    }
    
    public void setOpcao(String opcao){
        this.opcao = opcao;
    }
}
