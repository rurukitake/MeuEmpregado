package br.edu.facear.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.ferias;
import br.edu.facear.service.feriasService;

/**
 * Servlet implementation class inserirferiasServlet
 */
@WebServlet("/inserirferiasServlet")
public class inserirferiasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public inserirferiasServlet() {
      
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  feriasService ferias = new feriasService();
		  
		  String idferias = request.getParameter(String.valueOf("idferias"));
		  String datainicial = request.getParameter("datainicial");
		  String datafinal = request.getParameter("datafinal");
		  String valor = request.getParameter("valor");
		  
		  ferias f = new ferias(Integer.parseInt(idferias), datainicial, datafinal, valor);
		  
		  
		  
		  
	}

}
