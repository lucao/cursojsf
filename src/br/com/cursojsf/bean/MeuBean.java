package br.com.cursojsf.bean;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class MeuBean {
	
	private HtmlInputText componenteEntrada;
	private String valorDado;
	private HtmlOutputText componenteSaida;
	private String valorSaida;
	
	public HtmlInputText getComponenteEntrada() {
		log(componenteEntrada);
		return componenteEntrada;
	}

	public void setComponenteEntrada(HtmlInputText componenteEntrada) {
		log(componenteEntrada);
		this.componenteEntrada = componenteEntrada;
	}

	public String getValorDado() {
		log(valorDado);
		return valorDado;
	}

	public void setValorDado(String valorDado) {
		log(valorDado);
		this.valorDado = valorDado;
	}

	public MeuBean() {
		log("construido");
	}
	
	public HtmlOutputText getComponenteSaida() {
		log(componenteSaida);
		return componenteSaida;
	}

	public void setComponenteSaida(HtmlOutputText componenteSaida) {
		log(componenteSaida);
		this.componenteSaida = componenteSaida;
	}

	public String getValorSaida() {
		log(valorSaida);
		return valorSaida;
	}
	
	public void setValorSaida(String valorSaida) {
		log(valorSaida);
		this.valorSaida = valorSaida;
	}

	public void valorAlterado(ValueChangeEvent event) {
		log(event.getOldValue() + " para " + event.getNewValue());
	}
	
	public void acao() {
		valorSaida = valorDado;
		log("sucesso");
	}
	
	public void log(Object log) {
        String nomeMetodo = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("MeuBean " + nomeMetodo + ": " + log);
	}
	
	
}
