package com.aluracursos.literalura.repository;

import com.aluracursos.literalura.model.Authors;
import com.aluracursos.literalura.model.Books;
import com.aluracursos.literalura.model.DataBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BooksRepository extends JpaRepository<Books, Long> {
    @Query ("SELECT b FROM Authors b WHERE b.birth_year>:year1 AND b.death_year<:year2")
    public List<Authors> getAuthorsBetweenDates(Integer year1, Integer year2);

    @Query(value = "SELECT * FROM books WHERE :lang = any(languages)", nativeQuery = true)
    public List<Books> getLanguages(String lang);
}
