package br.edu.facear.facade;

import java.io.IOException;
import java.sql.SQLException;

import br.edu.facear.dao.FactoryDao;
import br.edu.facear.dao.feriasDAO;
import br.edu.facear.model.ferias;

public class feriasfacade {
	protected feriasDAO feriasdao;
	protected FactoryDao factory;
	protected ferias ferias;
	public feriasfacade() {
		this.feriasdao = feriasdao;
		this.factory = factory;
		this.ferias = ferias;
	}
	
	public void criarferias(FactoryDao factory) {
		factory.createferiasDAO();
	}
	
	public void inserirferias(ferias f) throws ClassNotFoundException, IOException, SQLException {
		feriasdao.inserirferias(f);
	}
	
	public void alterarferias(ferias f) throws ClassNotFoundException, IOException, SQLException {
		feriasdao.alterarferias(f);
	}
	
	
	
}
