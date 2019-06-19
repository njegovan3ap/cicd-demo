package ch.aaap.cicddemo.resource;

import ch.aaap.cicddemo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class BooksResource {

    @GetMapping
    public List<Book> books() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("title1", "author1"));
        return books;
    }

    @GetMapping("/one")
    public Book book() {
        return new Book("title1", "author1");
    }
}
