package br.com.service;

import br.com.model.Album;
import br.com.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public void save(Album album){
        albumRepository.save(album);
    }

    public List<Album> findAll (){
        return albumRepository.findAll();
    }

    public Optional<Album> findById(String id){
        return albumRepository.findById(id);
    }

    public void delete(String id){
        albumRepository.deleteById(id);
    }
}
