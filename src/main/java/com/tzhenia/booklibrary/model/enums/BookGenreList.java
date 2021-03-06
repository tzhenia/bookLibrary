package com.tzhenia.booklibrary.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BookGenreList {
    TECHNICAL(1L, "Technical"),
    EDUCATION(2L, "Education"),
    HISTORICAL(3L, "Historical"),
    FANTASY(4L, "Fantasy"),
    CRIME(5L, "Crime"),
    NOVEL(6L, "Novel");

    public final Long id;
    public final String name;
}
