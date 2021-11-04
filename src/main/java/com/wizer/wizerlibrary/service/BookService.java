package com.wizer.wizerlibrary.service;

import com.wizer.wizerlibrary.models.Book;
import com.wizer.wizerlibrary.payload.request.BookRequest;
import com.wizer.wizerlibrary.payload.response.ApiResponse;
import com.wizer.wizerlibrary.payload.response.BookResponse;

import java.util.List;

public interface BookService {

    List<BookResponse> getAllBooks();
    List<BookResponse> getBooksByCategory(Long categoryId);
    BookResponse getBook(Long id);
    BookResponse addBook(BookRequest bookRequest);
    BookResponse updateBook(Long id, BookRequest newGameRequest);
    ApiResponse deleteBook(Long id);
}
