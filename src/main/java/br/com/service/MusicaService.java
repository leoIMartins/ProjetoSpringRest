package br.com.service;

import br.com.model.Musica;
import br.com.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public void save(Musica musica){
        musicaRepository.save(musica);
    }

    public List<Musica> findAll (){
        return musicaRepository.findAll();
    }

    public Optional<Musica> findById(String id){
        return musicaRepository.findById(id);
    }

    public void delete(String id){
        musicaRepository.deleteById(id);
    }
}
