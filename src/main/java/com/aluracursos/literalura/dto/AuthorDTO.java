package com.aluracursos.literalura.dto;

import com.aluracursos.literalura.model.Books;
import jakarta.persistence.*;

public record AuthorDTO(
        String name,
        String birth_year,
        String death_year,
        Books book
) {
}
