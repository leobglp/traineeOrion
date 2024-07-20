package com.orion.ecommerce.controller;

import com.orion.ecommerce.model.pedidoModel;
import com.orion.ecommerce.model.userModel;
import com.orion.ecommerce.repository.pedidoRepository;
import com.orion.ecommerce.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/")
public class userController {
    @Autowired
    private userRepository users;
    @Autowired
    private pedidoRepository pedidos;

    //Listar produtos
    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody List<userModel> listar(){
        return (List<userModel>) users.findAll();
    }

    //Cadastrar usuario
    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public @ResponseBody userModel cadastrar(@RequestBody userModel usuario){
        return users.save(usuario);
    }

    //Listar pedidos do usuario
    @RequestMapping(value = "/{id_usuario}/", method = RequestMethod.GET)
    public @ResponseBody Optional<pedidoModel> listar(@PathVariable int id_usuario){
        return pedidos.findById(id_usuario);
    }
}
