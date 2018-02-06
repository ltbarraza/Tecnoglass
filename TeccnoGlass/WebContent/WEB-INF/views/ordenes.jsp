<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ordenes</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<style type="text/css">
#logo {
	height: 60px;
	width: 150px;
	margin-left: 25px;
}
</style>


</head>
<body>

	<div class="container">

		<div class="row">
			<div class="navbar navbar-light navbar-fixed-top"
				style="background-color: #e3f2fd;">
				<div class="row">
					<div class="navbar-header">
						<img id="logo"
							src="data:image/png;base64,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" />
					</div>
					<ul class="nav navbar-nav">
						<li><a class="nav-link" href='<c:url value="/clientes"/>'>Clientes</a></li>
						<li><a href='<c:url value="/ordenes"/>'>Ordenes</a></li>
					</ul>
				</div>
			</div>
		</div>

		<br>
		<br>
		<br>
		<br>
		
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4>Ordenes</h4>
				</div>
				<table class="table table-fixed">
					<thead>
						<tr>
						<th>Nro Orden</th>
							<th>Fecha</th>
							<th>Estado</th>
							<th>Cliente</th>
						</tr>
					</thead>
					<tbody>
					
					<c:forEach items="${ordens}" var="orden">
							<tr>
								<td><c:out value="${orden.nro_Orden}"></c:out></td>
								<td><c:out value="${orden.fecha_orden}"></c:out></td>
								<td><c:out value="${orden.estado.estado}"></c:out></td>
								<td><c:out value="${orden.cliente.nombre}"></c:out></td>
								<td><a href='<c:url value="/orden/anular/${orden.nro_Orden}"></c:url>' class="btn btn-primary">Agregar Items</a></td>
								<td><a href='<c:url value="/orden/aprobar/${orden.nro_Orden}"></c:url>' class="btn btn-success">Aprobar</a></td>
								<td><a href='<c:url value="/orden/anular/${orden.nro_Orden}"></c:url>' class="btn btn-danger">Anular</a></td>
							</tr>
						</c:forEach>
					
					
					
					
					</tbody>
				</table>

			</div>
			<a href='<c:url value="/orden/"></c:url>' class="btn btn-primary">Generar
				Orden</a>
		</div>
	</div>
	




</body>
</html>