package banco;

import modeloDeExcecao.DominioExcecao;

public class Conta {
	private Integer numero;
	private String proprietario;
	private Double saldo;
	private Double limiteDeRetirada;

	public Conta(Integer numero, String proprietario, Double saldo, Double limiteDeRetirada) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
		this.limiteDeRetirada = limiteDeRetirada;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeRetirada() {
		return limiteDeRetirada;
	}

	public void setLimiteDeRetirada(Double limiteDeRetirada) {
		this.limiteDeRetirada = limiteDeRetirada;
	}

	public void deposito(double montante) {
		saldo += montante;
	}

	public void retirada(double montante) {
		if (montante > limiteDeRetirada) {
			throw new DominioExcecao("Balanço insuficiente");
		}
		saldo -= montante;
	}

}
