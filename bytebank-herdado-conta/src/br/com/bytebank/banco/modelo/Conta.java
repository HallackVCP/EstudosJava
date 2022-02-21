package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * Classe que representa a moldura de uma conta
 * @author Vinicius Hallack
 * @version 0.1
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable{
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total;
	
//	public Conta() {
//		
//	}
//	
	/**
	 * Construtor para inicializar o objeto conta a partir de agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total+=1;
		System.out.println("O total de contas é: "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta está sendo criada!");
	}
	
	public abstract void deposita(double valor);
	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor){
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo :" + this.saldo + ", Valor: " + valor);			
		}
		this.saldo -= valor;		
	}
	
	public void transfere(double valor, Conta destino) {
		this.saca(valor); 
		destino.deposita(valor);		
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0 ) {
			System.out.println("Numero negativo é invalido!");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		
		
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Numero negativo é invalido!");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero: " + this.getNumero() +" Agência " + this.getAgencia();
	}
	
	@Override
	public int compareTo(Conta c) {
		
		return Double.compare(this.getSaldo(), c.getSaldo());
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outraConta = (Conta) ref;
		if(this.agencia == outraConta.agencia && this.numero == outraConta.numero) {
			return true;
		}
		return false;
	}
}