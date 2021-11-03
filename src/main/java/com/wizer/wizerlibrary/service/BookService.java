package com.wizer.wizerlibrary.service;

import com.wizer.wizerlibrary.models.Book;
import com.wizer.wizerlibrary.payload.request.BookRequest;
import com.wizer.wizerlibrary.payload.response.BookResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    List<Book> getBooksByCategory(Long categoryId);
    Book getBook(Long id);
    ResponseEntity<BookResponse> addBook(BookRequest bookRequest);
    BookResponse updateBook(Long id, BookRequest newGameRequest);
    void deleteBook(Long id);
}
