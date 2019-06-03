package com.tzhenia.bookLibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Simple JavaBean domain object that represents AuthorBook.
 */

@Entity
@Getter
@Setter
@ToString
public class AuthorBook extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}