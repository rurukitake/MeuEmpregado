package br.edu.facear.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.empregado;
import br.edu.facear.service.feriasService;

/**
 * Servlet implementation class listarfuniconariosServlet
 */
@WebServlet("/listarfuniconariosServlet")
public class listarfuncionariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarfuncionariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		feriasService service = new feriasService();
		try {
			ArrayList<empregado> lista =(ArrayList<empregado>) service.listartodosfuncionarios();
			
			lista.forEach(e -> System.out.println(e.getNome())); 
			
			
			request.setAttribute("listafuncionarios", lista);
			 String nextJSP = "/ferias/listarfuncionarios.jsp";
			 RequestDispatcher rd = getServletContext().getRequestDispatcher(nextJSP);
				rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
