package br.edu.facear.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import br.edu.facear.dao.feriasDAO;
import br.edu.facear.model.empregado;
import br.edu.facear.model.ferias;

public class feriasService {
	
	private feriasDAO dao;
	public feriasService() {
		dao = new feriasDAO();
	}
	 public void inseriferias(int idferias, int idempregado, int idempregador, String datainicial, String datafinal, String valor ) throws ClassNotFoundException, IOException, SQLException {
		 ferias f = new ferias(idferias, idempregado, idempregador, datainicial, datafinal, valor);
		 dao.inserirferias(f);
	 }
	 
	 public void alterarCliente(int idferias, int idempregado, int idempregador, String datainicial, String datafinal, String valor) throws ClassNotFoundException, IOException, SQLException {
		ferias f = new ferias(idferias, idempregado, idempregador, datainicial, datafinal, valor);
		dao.alterarferias(f);
	 }
	 
	 public void excluirServico(int id) throws ClassNotFoundException, IOException, SQLException {
		 dao.excluirferias(id);
	 }
	 
	 public List<empregado> listartodosfuncionarios() throws ClassNotFoundException, IOException, SQLException{
		 return dao.listarfuncioanarios();
	 }
	 
	 public List<ferias> listartodosferias() throws ClassNotFoundException, IOException, SQLException{
		 return dao.listaferias();
	 }

}
