package com.aluracursos.literalura.repository;

import com.aluracursos.literalura.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Authors, Long > {
}
