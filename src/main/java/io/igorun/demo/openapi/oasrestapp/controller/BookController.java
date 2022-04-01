package io.igorun.demo.openapi.oasrestapp.controller;

import io.igorun.demo.openapi.oasrestapp.api.BookApi;
import io.igorun.demo.openapi.oasrestapp.api.model.Author;
import io.igorun.demo.openapi.oasrestapp.api.model.Book;
import io.igorun.demo.openapi.oasrestapp.api.model.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController implements BookApi {
    @Override
    public ResponseEntity<Book> getBookById(String bookId) {
        return ResponseEntity.ok(Book.builder()
                                     .id(bookId)
                                     .title("fooBookTitle" + bookId)
                                     .author(dummyAuthor(bookId))
                                     .publisher(dummyPublisher(bookId))
                                     .build());
    }

    private Publisher dummyPublisher(String bookId) {
        return Publisher.builder().id(bookId).name("bookPublisher" + bookId).build();
    }

    private Author dummyAuthor(String bookId) {
        return Author.builder().id(bookId).name("bookAuthor" + bookId).build();
    }
}
