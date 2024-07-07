package com.aluracursos.literalura.repository;

import com.aluracursos.literalura.model.Authors;
import com.aluracursos.literalura.model.Books;
import com.aluracursos.literalura.model.DataBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BooksRepository extends JpaRepository<Books, Long> {


}
