package test;

import org.apache.struts.action.ActionForm;

public class TestForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cognome;
	private String cf;
	private boolean sesso;
	private String hello = null;

	public TestForm() {
		super();
		hello = "Hello World";
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public boolean isSesso() {
		return sesso;
	}
	public void setSesso(boolean sesso) {
		this.sesso = sesso;
	}
	
	
}
