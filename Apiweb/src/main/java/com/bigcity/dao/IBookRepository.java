package com.bigcity.dao;

import com.bigcity.entity.Book;
import com.bigcity.entity.BookCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author nicolasdotnet
 */
public interface IBookRepository extends JpaRepository<Book,Long>, JpaSpecificationExecutor<Book>{

    List<Book> findAllByTitleContainingIgnoreCase(String bookTitle);

    Optional<Book> findByIsbn(String isbn);

    Optional<Book> findByIsbnAndTitleAndAuthor(String isbn, String title, String author);

    List<Book> findAllByBookCategory(BookCategory bookCategoryFind);
    
}
