package com.wizer.wizerlibrary.service;

import com.wizer.wizerlibrary.models.BookCategory;
import com.wizer.wizerlibrary.payload.response.ApiResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookCategoryService {
    List<BookCategory> getAllCategories();
    ResponseEntity<BookCategory> getCategory(Long id);
    ResponseEntity<BookCategory> addCategory(BookCategory category);
    ResponseEntity<BookCategory> updateCategory(Long id, BookCategory newCategory);
    ResponseEntity<ApiResponse> deleteCategory(Long id);
}
