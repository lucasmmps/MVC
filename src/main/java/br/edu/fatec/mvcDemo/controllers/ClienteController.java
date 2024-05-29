package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
 private static final List<Cliente>
         clientes = new ArrayList<Cliente>();

    public ClienteController() {
        clientes.add(new Cliente("111.111.111-11","Lucas","(13) 99999-9999","lucas@email.com", 100.00f));
        clientes.add(new Cliente("222.222.222-22","Caique","(13) 99999-9999","caique@email.com", 99999.99f));
    }

    @GetMapping
    public String getAlunos(Model model)
    {
        model.addAttribute("clientes",clientes);
        return "clientes";
    }
}
