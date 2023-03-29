package com.addaboy.content.calendar.model;

import java.time.LocalDateTime;

public record Content(
    Integer id,
    String title,
    String desc,
    Status status,
    Type conteType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
   ){
}
