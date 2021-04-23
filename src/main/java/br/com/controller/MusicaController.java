package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Musica;
import br.com.model.Album;
import br.com.service.MusicaService;
import br.com.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @Autowired
    private AlbumService albumService;

    @PostMapping(Constant.API_MUSICA)
    public void save(@RequestBody Musica musica){
        Optional<Album> album = albumService.findById(musica.getAlbum().getId());
        musica.setAlbum(album.get());
        musicaService.save(musica);
    }

    @GetMapping(Constant.API_MUSICA)
    public List<Musica> findAll(){
        return musicaService.findAll();
    }

    @PutMapping(Constant.API_MUSICA)
    public void update (@RequestBody Musica musica){
        Optional<Album> album = albumService.findById(musica.getAlbum().getId());
        musica.setAlbum(album.get());
        musicaService.save(musica);
    }

    @DeleteMapping(Constant.API_MUSICA + "/{id}")
    public void delete(@PathVariable("id") String id){
        musicaService.delete(id);
    }

    @GetMapping(Constant.API_MUSICA + "/{id}")
    public Optional<Musica> findById(@PathVariable("id") String id){
        return musicaService.findById(id);
    }
}
