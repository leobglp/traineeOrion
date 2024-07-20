package com.orion.ecommerce.controller;

import com.orion.ecommerce.model.pedidoModel;
import com.orion.ecommerce.repository.pedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class pedidoController {
    @Autowired
    private pedidoRepository pedidos;

    //Novo pedido
    @RequestMapping(value = "/{id_usuario}/", method = RequestMethod.POST)
    public @ResponseBody Optional<pedidoModel> novo(@PathVariable int id_usuario){
        pedidoModel novoPedido = new pedidoModel();
        return Optional.of(pedidos.save(novoPedido));
    }

    //add/rem um pedido
    @RequestMapping(value = "/editar", method = RequestMethod.GET)
    public @ResponseBody String editar(){
        return "editar pedido";
    }
}
