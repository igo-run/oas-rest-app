package io.igorun.demo.openapi.oasrestapp.controller;

import io.igorun.demo.openapi.oasrestapp.api.AuthorApi;
import io.igorun.demo.openapi.oasrestapp.api.model.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController implements AuthorApi {
    @Override
    public ResponseEntity<Author> getAuthorById(String authorId) {
        return ResponseEntity.ok(dummyAuthor(authorId));
    }

    private Author dummyAuthor(String authorId) {
        return Author.builder().id(authorId).name("authorName" + authorId).build();
    }
}
