package br.com.cotiinformatica.controllers;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cotiinformatica.entities.Conta;
import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.repositories.ContaRepository;

@Controller
public class DashboardController {

	@RequestMapping(value = "/admin/dashboard")
	public ModelAndView dashboard(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("admin/dashboard");

		try {
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario_auth");

			Calendar calender = Calendar.getInstance();
			Integer mes = calender.get(Calendar.MONTH) + 1;
			Integer ano = calender.get(Calendar.YEAR);

			if (request.getParameter("mes") != null && request.getParameter("ano") != null) {
				mes = Integer.parseInt(request.getParameter("mes"));
				ano = Integer.parseInt(request.getParameter("ano"));
			}

			Calendar primeiroDia = Calendar.getInstance();
			primeiroDia.set(ano, mes - 1, 1);

			Calendar ultimoDia = Calendar.getInstance();
			ultimoDia.set(ano, mes - 1, primeiroDia.getActualMaximum(Calendar.DAY_OF_MONTH));

			ContaRepository contaRepository = new ContaRepository();
			List<Conta> contas = contaRepository.findByDatas(primeiroDia.getTime(), ultimoDia.getTime(),
					usuario.getIdUsuario());

			modelAndView.addObject("mesAtual", mes);
			modelAndView.addObject("anoAtual", ano);

			Double totalContasAReceber = 0.0;
			Double totalContasAPagar = 0.0;

			for (Conta conta : contas) {
				if (conta.getTipo() == 1) {
					totalContasAReceber += conta.getValor();

				} else if (conta.getTipo() == 2) {
					totalContasAPagar += conta.getValor();

				}

			}

			modelAndView.addObject("totalContasAPagar", totalContasAPagar);
			modelAndView.addObject("totalContasAReceber", totalContasAReceber);

		} catch (Exception e) {
			modelAndView.addObject("mensagem_erro", e.getMessage());
		}
		return modelAndView;

	}
}
