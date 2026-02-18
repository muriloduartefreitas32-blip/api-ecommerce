package com.example.demo.controller;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/v1/categorias")
    public class CategoriaController {

        @Autowired
        private CategoriaRepository repository;

        @PostMapping
        public Categoria criar(@RequestBody Categoria categoria) {
            return repository.save(categoria);
        }

        @GetMapping
        public List<Categoria> listar() {
            return repository.findAll();
        }
    }


