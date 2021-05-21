package br.com.fiap.nac2.controller;
import java.util.List;

import br.com.fiap.nac2.dto.Intencao;
import br.com.fiap.nac2.service.impl.IntencaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

    @Autowired
    private IntencaoServiceImpl service;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("home");
        List<Intencao> intencoes = service.listaIntencoes();
        view.addObject("intencoes", intencoes);
        return view;
    }

}
