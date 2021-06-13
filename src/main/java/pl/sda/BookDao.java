package pl.sda;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDao {

    public List<Book> findAll() {
        return Arrays.asList(new Book("Harry Potter"), new Book("Moja książka"));
    }
}
