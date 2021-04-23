package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Artista;
import br.com.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @PostMapping(Constant.API_ARTISTA)
    public void save(@RequestBody Artista artista){
        artistaService.save(artista);
    }

    @GetMapping(Constant.API_ARTISTA)
    public List<Artista> findAll(){
        return artistaService.findAll();
    }

    @PutMapping(Constant.API_ARTISTA)
    public void update (@RequestBody Artista artista){
        artistaService.save(artista);
    }

    @DeleteMapping(Constant.API_ARTISTA + "/{id}")
    public void delete(@PathVariable("id") String id){
        artistaService.delete(id);
    }

    @GetMapping(Constant.API_ARTISTA + "/{id}")
    public Optional<Artista> findById(@PathVariable("id") String id){
        return artistaService.findById(id);
    }
}
