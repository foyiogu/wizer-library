package com.wizer.wizerlibrary.service;

import com.wizer.wizerlibrary.models.BookCategory;
import com.wizer.wizerlibrary.payload.response.ApiResponse;
import com.wizer.wizerlibrary.payload.response.BookCategoryResponse;

import java.util.List;

public interface BookCategoryService {
    List<BookCategoryResponse> getAllCategories();
    BookCategoryResponse getCategory(Long id);
    BookCategoryResponse addCategory(BookCategory category);
    BookCategoryResponse updateCategory(Long id, BookCategory newCategory);
    ApiResponse deleteCategory(Long id);
}
