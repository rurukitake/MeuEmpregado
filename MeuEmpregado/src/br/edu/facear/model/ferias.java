package br.edu.facear.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ferias {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idferias;
	private int idempregado;
	private int idempregador;
	private String datainicial;
	private String datafinal;
	private String valor;
	
	
	public ferias(int idferias,String datainicial, String datafinal, String valor) {
		this.idferias = idferias;
		this.datainicial = datainicial;
		this.datafinal = datafinal;
		this.valor = valor;
	}
	
	public ferias(int idferias, int idempregado, int idempregador, String datainicial, String datafinal, String valor) {
		
		this.idferias = idferias;
		this.idempregado = idempregado;
		this.idempregador = idempregador;
		this.datainicial = datainicial;
		this.datafinal = datafinal;
		this.valor = valor;
	}
	
	public ferias() {
		
	}

	public int getIdferias() {
		return idferias;
	}

	public void setIdferias(int idferias) {
		this.idferias = idferias;
	}

	public int getIdempregado() {
		return idempregado;
	}

	public void setIdempregado(int idempregado) {
		this.idempregado = idempregado;
	}

	public int getIdempregador() {
		return idempregador;
	}

	public void setIdempregador(int idempregador) {
		this.idempregador = idempregador;
	}

	public String getDatainicial() {
		return datainicial;
	}

	public void setDatainicial(String datainicial) {
		this.datainicial = datainicial;
	}

	public String getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(String datafinal) {
		this.datafinal = datafinal;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	

}
