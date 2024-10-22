package dev.wess.lastapp.controller;

import dev.wess.lastapp.domain.Book;
import dev.wess.lastapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok(books);
    }


    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @PostMapping("/list")
    public ResponseEntity<List<Book>> uploadBookList(@RequestBody List<Book> books) {
        List<Book> savedBooks = bookService.saveList(books);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBooks);
    }
}