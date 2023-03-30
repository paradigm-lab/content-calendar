package com.addaboy.content.calendar.controller;

import com.addaboy.content.calendar.model.Content;
import com.addaboy.content.calendar.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/content")
public class ContentController {

    public final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    // Make a request and find all the pieces of content in the system
    @GetMapping
    public List<Content> getAll() {
        return repository.findAll();
    }
}
