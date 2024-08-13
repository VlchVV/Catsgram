package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = { "id" })
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;
}
