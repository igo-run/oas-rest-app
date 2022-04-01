package io.igorun.demo.openapi.oasrestapp.controller;

import io.igorun.demo.openapi.oasrestapp.api.PublisherApi;
import io.igorun.demo.openapi.oasrestapp.api.model.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController implements PublisherApi {
    @Override
    public ResponseEntity<Publisher> getPublisherById(String publisherId) {
        return ResponseEntity.ok(dummyPublisher(publisherId));
    }

    private Publisher dummyPublisher(String publisherId) {
        return Publisher.builder().id(publisherId).name("publisher" + publisherId).build();
    }
}
