/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigcity.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author nicolasdotnet
 * 
 *  Book is the registration entity of a book.
 * 
 */
@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue
    @ApiModelProperty(notes = "book id")
    private Long bookId;

    @Column(length = 100, nullable = false)
    @ApiModelProperty(notes = "the international Standard Book Number")
    private String isbn;

    @Column(length = 100, nullable = false)
    @ApiModelProperty(notes = "book author")
    private String author;

    @Column(length = 100, nullable = false)
    @ApiModelProperty(notes = "book title")
    private String title;

    @ApiModelProperty(notes = "number book copies available : no booked")
    private int copiesAvailable;

    @ManyToOne
    @JoinColumn(nullable = false)
    @ApiModelProperty(notes = "book category")
    private BookCategory bookCategory;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    @ApiModelProperty(notes = "book booking list")
    private Collection<Booking> bookings;

    public Book() {
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Collection<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Collection<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", isbn=" + isbn + ", author=" + author + ", title=" + title + ", copiesAvailable=" + copiesAvailable + 
                ", bookCategory=" + bookCategory.getLabel() + '}';
    }



}
