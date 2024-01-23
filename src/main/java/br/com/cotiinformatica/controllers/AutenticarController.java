package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AutenticarController {

	// definindo a rota para abrir a página no navegador
	@RequestMapping(value = "/") // página raiz(inicial) do projeto
	public ModelAndView autenticar() {

		// WEB-INF/views/autenticar.jsp

		ModelAndView modelAndView = new ModelAndView("autenticar");
		return modelAndView;

	}

}
