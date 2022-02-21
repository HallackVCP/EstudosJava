package br.com.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank
 * @author Vinicius Hallack
 * 
 *
 */

public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9139439497959581146L;
	private String nome;
	private String cpf;
	private String profissao;
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
