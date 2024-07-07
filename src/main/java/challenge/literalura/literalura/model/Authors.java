package challenge.literalura.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String birth_year;
    private String death_year;
    @ManyToOne
    private Books book;

    public Authors() {
    }

    public Authors(String name, String birth_year, String death_year, Books book) {
        this.name = name;
        this.birth_year = birth_year;
        this.death_year = death_year;
        this.book = book;
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
}
