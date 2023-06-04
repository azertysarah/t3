package com.example.backend2.repository;

import com.example.backend2.db.Monument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonumentRepository extends MongoRepository<Monument, String> {

    @Query("{'fields.commune':  ?0}")
    public List<Monument> findByCommune(String commune);
}
