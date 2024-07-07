package com.aluracursos.literalura.dto;

import com.aluracursos.literalura.model.Authors;
import jakarta.persistence.*;

import java.util.List;

public record BookDTO(
        String title,
        List<String>languages,
        Double downloads,
        List<Authors>authorsList
) {
}
