package com.addaboy.content.calendar.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

public record Content(
    @Id
    Integer id,
    @NotBlank
    String title,
    String desc,
    Status status,
    Type conteType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
   ){
}
