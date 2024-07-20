package com.orion.ecommerce.controller;

import com.orion.ecommerce.model.produtoModel;
import com.orion.ecommerce.repository.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class produtoController {
    @Autowired
    private produtoRepository funcoes;

    //Listar produtos
    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    public @ResponseBody List<produtoModel> listar(){
        return (List<produtoModel>) funcoes.findAll();
    }

    //Cadastrar produtos
    @RequestMapping(value = "/produtos", method = RequestMethod.POST)
    public @ResponseBody produtoModel cadastrar(@RequestBody produtoModel produto){
        return funcoes.save(produto);
    }
}
