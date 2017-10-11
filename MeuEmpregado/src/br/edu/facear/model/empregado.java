package br.edu.facear.model;

public class empregado {
	private int idempregado;
	private String nome;
	private int idempregador;
	private String nomeempregador;
	private String funcao;
	private String data_admissao;

	
	public empregado(int idempregado, String nome, int idempregador, String nomeempregador, String funcao,
			String data_admissao) {
		
		this.idempregado = idempregado;
		this.nome = nome;
		this.idempregador = idempregador;
		this.nomeempregador = nomeempregador;
		this.funcao = funcao;
		this.data_admissao = data_admissao;
	}
	
	
	public int getIdempregado() {
		return idempregado;
	}
	public void setIdempregado(int idempregado) {
		this.idempregado = idempregado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdempregador() {
		return idempregador;
	}
	public void setIdempregador(int idempregador) {
		this.idempregador = idempregador;
	}
	public String getNomeempregador() {
		return nomeempregador;
	}
	public void setNomeempregador(String nomeempregador) {
		this.nomeempregador = nomeempregador;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getData_admissao() {
		return data_admissao;
	}
	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}

}
