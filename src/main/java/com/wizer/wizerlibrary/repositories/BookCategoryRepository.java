package com.wizer.wizerlibrary.repositories;

import com.wizer.wizerlibrary.models.Book;
import com.wizer.wizerlibrary.models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
