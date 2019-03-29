package com.biniyamyonas.mybookpub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biniyamyonas.mybookpub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
