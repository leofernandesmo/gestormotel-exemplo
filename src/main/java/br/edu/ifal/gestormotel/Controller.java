package br.edu.ifal.gestormotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller{

    @Autowired
    private QuartoDAO dao;

    @RequestMapping("/gestor")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @RequestMapping("/gestor/quarto")
    public ModelAndView formularioQuarto() {
        return new ModelAndView("form_quarto.html");
    }

    @RequestMapping("/gestor/quartos")
    public ModelAndView listaQuartos() {

        ModelAndView mv = new ModelAndView("quartos.html");
        mv.addObject("quartos", dao.findAll());
        return mv;
    }

    @RequestMapping("/gestor/quartos/deleta/{numero}")
    public ModelAndView deletaQuarto(@PathVariable(name = "numero") int numero) {
        dao.deleteById(numero);
        ModelAndView mv = new ModelAndView("quartos.html");
        mv.addObject("quartos", dao.findAll());
        return mv;
    }

    @RequestMapping("/gestor/quarto/cadastrar")
    public ModelAndView cadastroQuarto(Quarto quarto) {

        dao.save(quarto);
        ModelAndView mv = new ModelAndView("quartos.html");
        mv.addObject("quartos", dao.findAll());
        return mv;
    }

}