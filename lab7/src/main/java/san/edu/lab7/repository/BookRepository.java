package san.edu.lab7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import san.edu.lab7.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
