package br.com.viaVarejo.support.browser.exception;

/**
 * 
 * Name: {@link BrowserException}
 * 
 * Proposito: Exception
 
 */
public class BrowserException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construtor
	 * @param msg
	 */
	public BrowserException(String msg) {
		super(msg);
	}
	
	/**
	 * Construtor
	 * @param e
	 */
	public BrowserException(Exception e) {
		super(e);
	}
	
	/**
	 * Construtor
	 * @param msg
	 * @param e
	 */
	public BrowserException(String msg, Exception e) {
		super(msg, e);
	}

}
