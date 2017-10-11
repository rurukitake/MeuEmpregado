package br.edu.facear.dao;

import br.edu.facear.model.ferias;

public class FactoryDao {

	public static InterfaceDao<ferias> 
			createferiasDAO() {
		return (InterfaceDao<ferias>) new feriasDAO();
	}
	
}
