package br.edu.facear.test;

import org.junit.Test;

import br.edu.facear.dao.FactoryDao;
import br.edu.facear.dao.InterfaceDao;
import br.edu.facear.model.ferias;



public class testferias {
	@Test
	public void InserirFerias() {
		ferias f = new ferias();
		f.setIdferias(1);
		f.setIdempregado(2);
		f.setIdempregador(1);
		f.setDatainicial("20/10/2018");
		f.setDatafinal("20/11/2018");
		f.setValor("2,000");
		
		InterfaceDao<ferias> dao = FactoryDao.createferiasDAO();
		dao.salvar(f);
	}
}
