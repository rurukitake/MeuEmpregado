package br.edu.facear.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.facear.model.empregado;
import br.edu.facear.model.ferias;
 
public class feriasDAO extends GenericDAO  {

	private PreparedStatement ps;
	private String INSERIR_SQL ="INSERT INTO FERIAS(idferias,idempregado,idempregador,datainicial,datafinal,valor) VALUES(?,?,?,?,?,?);";
	private String ALTERAR_SQL ="UPDATE FERIAS SET datainicial=?, datafinal=?, valor=? WHERE idferias=?;";
	private String EXCLUIR_SQL ="DELETE * FROM FERIAS WHERE idferias=?;";
	private String LISTARFUNCIONARIOS_SQL = "SELECT empregador.idempregador,empregador.nome,empregado.idempregado,empregado.nome,empregado.dataadmissao,empregado.funcao FROM FERIAS INNER JOIN EMPREGADO ON empregado.idempregado= ferias.idempregado INNER JOIN EMPREGADOR ON  empregado.empregador = empregador.nome;";
	private String LISTARFERIAS_SQL ="SELECT idferias,datainicial,datafinal,valor  FROM FERIAS;";

	
	public void inserirferias(ferias f) throws ClassNotFoundException, IOException, SQLException {
		openConnection();
		ps = connect.prepareStatement(INSERIR_SQL);
		ps.setInt(1, f.getIdferias());
		ps.setInt(2, f.getIdempregado());
		ps.setInt(3, f.getIdempregador());
		ps.setString(4, f.getDatainicial());
		ps.setString(5, f.getDatafinal());
		ps.setString(6, f.getValor());
		ps.executeQuery();
		closeConnection();
	}
	
	public void alterarferias(ferias f) throws ClassNotFoundException, IOException, SQLException {
		openConnection();
		ps = connect.prepareStatement(ALTERAR_SQL);
		ps.setString(1, f.getDatainicial());
		ps.setString(2, f.getDatafinal());
		ps.setString(3, f.getValor());
		ps.setInt(4, f.getIdferias());
		ps.executeUpdate();
		closeConnection();
	}
	
	public void excluirferias(int id) throws ClassNotFoundException, IOException, SQLException {
		openConnection();
		ps = connect.prepareStatement(EXCLUIR_SQL);
		ps.setInt(1, id);
		ps.executeUpdate();
		closeConnection();
	}
	
	public List<empregado> listarfuncioanarios() throws ClassNotFoundException, IOException, SQLException{
		List<empregado> listafuncioarios = new ArrayList<empregado>();
		openConnection();
		ps = connect.prepareStatement(LISTARFUNCIONARIOS_SQL);
		ResultSet rs = ps.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				empregado e = new empregado(rs.getInt("idempregado"), rs.getString("nome"), rs.getInt("idempregador"), rs.getString("nome"), rs.getString("funcao"), rs.getString("dataadmissao"));
				listafuncioarios.add(e);
			}
		}
		closeConnection();
		return listafuncioarios;
	}
	
	public List<ferias> listaferias() throws ClassNotFoundException, IOException, SQLException{
		List<ferias> listaferias = new ArrayList<ferias>();
		openConnection();
		ps = connect.prepareStatement(LISTARFERIAS_SQL);
		ResultSet rs = ps.executeQuery();
		if(rs!= null) {
			while(rs.next()) {
				ferias f = new ferias(rs.getInt("idferias"), rs.getString("datainicial"), rs.getString("datafinal"), rs.getString("valor"));
				listaferias.add(f);
			}
		}
		closeConnection();
		return listaferias;
	}
}
