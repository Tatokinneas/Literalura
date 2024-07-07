package com.aluracursos.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String birth_year;
    private String death_year;
    @ManyToOne(fetch = FetchType.EAGER)
    private Books book;

    public Authors() {
    }

    public Authors(DataAuthors data) {
        this.name = data.name();
        this.birth_year = data.birth_year();
        this.death_year = data.death_year();

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getDeath_year() {
        return death_year;
    }

    public void setDeath_year(String death_year) {
        this.death_year = death_year;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }


    @Override
    public String toString() {
        return "Authors{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", death_year='" + death_year + '\'' +
                ", book=" + book +
                '}';
    }
}
