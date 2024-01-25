<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Projeto Contas</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="bg-secondary">
	<div class="row">
		<div class="col-md-4 offset-md-4">
			<div class="card mt-5">
				<div class="card-body">
					<div class="text-center">
						<img
							src="https://www.cotiinformatica.com.br/imagens/logo-coti-informatica.svg" />
						<hr />
						<h2>Acesso ao Sistema</h2>
						<p>Entre com as suas credenciais de acesso:</p>
					</div>
					<form>
	
						<div class="mb-2">
							<label>Email de acesso:</label> <input type="text"
								class="form-control" placeholder="Digite seu email aqui." />
							<div class="mb-2">
								<label>Senha de acesso:</label> <input type="password"
									class="form-control" placeholder="Digite sua senha aqui." />
							</div>
							<div class="mb-2 d-grid">
								<input type="submit" class="btn btn-primary" value="Entrar" />
							</div>

							<div class="mb-2 d-grid">
								<a href="/projeto_contas/criar-usuario" class="btn btn-light">
									N�o possui conta? <strong>Cadastre-se aqui!</strong>
								</a>
							</div>
							<div class="mb-2 d-grid">
								<a href="/projeto_contas/recuperar-senha" class="btn btn-light">
									Esqueceu sua senha? <strong>Clique aqui!</strong>
								</a>
							</div>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>