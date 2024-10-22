package dev.wess.lastapp.service;

import dev.wess.lastapp.domain.Book;
import dev.wess.lastapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> saveList(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}