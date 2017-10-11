<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>Meu Empregado</title>
	   <meta name="description" content="">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	
	   <link rel="stylesheet" href="css/bootstrap.min.css">
	   <style>
	        body {
	            padding-top: 50px;
	            padding-bottom: 20px;
	        }
	   </style>
	   <link rel="stylesheet" href="../css/style.css">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">  
</head>
<body>
<c:import url="../inc/header.jsp"/>
	
		<!-- Conteúdo principal da página -->
		<main class="container">
		<h1>Lista de Funcionários</h1>
			<a class="btn btn-primary" href="ferias/inserirFerias.jsp"><i class="fa fa-plus"></i> Novas Ferias</a>
		<hr/>
			 <form action="/integrador4/listarfuncionariosServlet" method="post">              
                <c:choose>
                    <c:when test="${not empty listafuncionarios}">
                        <table  class="table table-striped">
                            <thead>
                                
                <tr>
					<th>Id Empregador</th>
					<th>Nome Empregador</th>
					<th>Id Empregado</th>
					<th>Nome Empregado</th>
					<th>Data de admissão</th>
					<th>Função</th>
				</tr>
				<c:forEach var="empregado" items="${listafuncionarios }">
				<tr>
				<td>${empregado.idempregador}</td>
						<td>${empregado.nomeempregador }</td>
						<td>${empregado.idempregado }</td>
						<td>${empregado.nome}</td>
						<td>${empregado.data_admissao}</td>
						<td>${empregado.funcao }</td>
						<td><a href="integrador4/listarfuncionariosServlet"></a></td>
						</tr>
                        </c:forEach>               
                        </table>  
                    </c:when>                    
                    <c:otherwise>
                        <br>           
                        <div class="alert alert-info">
                            No people found matching your search criteria
                        </div>
                    </c:otherwise>
                </c:choose>                        
            </form>
		</main>
		<c:import url="../inc/footer.jsp"/>
	</body>
</body>
</html>