package com.itb.inf2am.pizzariaa.controller;

import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/produto")
public class CategoriaController {

    List<Produto> categorias = new ArrayList<Produto>();


    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabreza");
        p1.setDescricao("Pizza com muita Calabreza e cebola");
        p1.setValorVenda(49.50);

        Produto p2 = new Produto();
        p2.setNome("Pizza de Calabreza");
        p2.getDescricao("Pizza com queijo");
        p2.setValorVenda(49.50);

        // Adicionando o produto
        categorias.add(p1);
        categorias.add(p2);

        return categorias;


    }


}