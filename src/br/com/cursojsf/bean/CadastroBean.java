package br.com.cursojsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class CadastroBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String email;
	private String bairro;
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String cadastrar() {
		return "confirmarCadastro";
	}
	
	public List<SelectItem> getListaBairros() {
		List<SelectItem> retorno = new ArrayList<SelectItem>();
		retorno.add(new SelectItem(null, "Escolha"));
		retorno.add(new SelectItem("Botafogo", "Botafogo"));
		retorno.add(new SelectItem("Flamengo", "Flamengo"));
		retorno.add(new SelectItem("Tijuca", "Tijuca"));
		retorno.add(new SelectItem("Centro", "Centro"));
		retorno.add(new SelectItem("Copacabana", "Copacabana"));
		retorno.add(new SelectItem("Ipanema", "Ipanema"));
		return retorno ;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
