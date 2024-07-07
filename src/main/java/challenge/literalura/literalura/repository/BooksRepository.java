package challenge.literalura.literalura.repository;

import challenge.literalura.literalura.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
