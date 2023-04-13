package com.addaboy.content.calendar.repository;

import com.addaboy.content.calendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.Repository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
