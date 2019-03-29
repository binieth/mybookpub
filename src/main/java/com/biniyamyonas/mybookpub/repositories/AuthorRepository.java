package com.biniyamyonas.mybookpub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biniyamyonas.mybookpub.models.Author;



@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}


