package com.geekbrains.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "books_tbl")
@Data
public class Book {
    @Id
    @Column(name = "id_book")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_book;

    @Column(name = "name_book")
    private String name_book;

    @Column(name = "discription_book")
    private String discription_book;

    @Column (name = "year_book")
    private int year_book;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book id=" + id_book + ", name=" + "discription: " +
                discription_book + ", year: " + year_book + '}';
    }
}
