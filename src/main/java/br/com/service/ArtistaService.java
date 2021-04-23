package br.com.service;

import br.com.model.Artista;
import br.com.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    public void save(Artista artista){
        artistaRepository.save(artista);
    }

    public List<Artista> findAll (){
        return artistaRepository.findAll();
    }

    public Optional<Artista> findById(String id){
        return artistaRepository.findById(id);
    }

    public void delete(String id){
        artistaRepository.deleteById(id);
    }
}
