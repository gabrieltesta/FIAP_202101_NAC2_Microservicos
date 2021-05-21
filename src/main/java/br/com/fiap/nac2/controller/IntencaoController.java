package br.com.fiap.nac2.controller;

import javax.validation.Valid;

import br.com.fiap.nac2.dto.Intencao;
import br.com.fiap.nac2.service.impl.IntencaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IntencaoController {

    @Autowired
    IntencaoServiceImpl service;

    @GetMapping("/intencao/novo")
    public ModelAndView novaIntencao() {
        ModelAndView view = new ModelAndView("intencao");
        view.addObject(new Intencao());
        return view;
    }

    @PostMapping("/intencao/salvar")
    public String salvarIntencao(@Valid Intencao intencao, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute(intencao);
            return "intencao";
        }
        service.salvarIntencao(intencao);
        return "redirect:/";
    }

    @GetMapping("/intencao/{id}")
    public ModelAndView editarIntencao(@PathVariable Long id) {
        ModelAndView view = new ModelAndView("intencao");
        Intencao intencao = service.editarIntencao(id);
        view.addObject("intencao", intencao);
        return view;
    }
}
