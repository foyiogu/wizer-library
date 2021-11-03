package com.wizer.wizerlibrary.repositories;

import com.wizer.wizerlibrary.models.Book;
import com.wizer.wizerlibrary.models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("select b from Book b where b.category = ?1")
    List<Book> findAllByCategory(BookCategory bookCategory);

    @Query("select b from Book b where b.id = ?1")
    Book getBookById(Long id);
}
