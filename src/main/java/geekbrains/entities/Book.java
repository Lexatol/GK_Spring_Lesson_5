package geekbrains.entities;

import javax.persistence.*;

@Entity
@Table(name = "books_tbl")
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

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getDiscription_book() {
        return discription_book;
    }

    public void setDiscription_book(String discription_book) {
        this.discription_book = discription_book;
    }

    public int getYear_book() {
        return year_book;
    }

    public void setYear_book(int year_book) {
        this.year_book = year_book;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book id=" + id_book + ", name=" + "discription: " +
                discription_book + ", year: " + year_book + '}';
    }
}
