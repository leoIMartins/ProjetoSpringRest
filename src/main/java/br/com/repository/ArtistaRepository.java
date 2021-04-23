package br.com.repository;

import br.com.model.Artista;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends MongoRepository<Artista, String> {
}
