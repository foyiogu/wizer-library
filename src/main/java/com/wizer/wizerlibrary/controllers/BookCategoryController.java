package com.wizer.wizerlibrary.controllers;

import com.wizer.wizerlibrary.models.BookCategory;
import com.wizer.wizerlibrary.payload.request.BookRequest;
import com.wizer.wizerlibrary.service.BookCategoryService;
import com.wizer.wizerlibrary.service.BookService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/book-category")
public class BookCategoryController {

    private final BookCategoryService bookCategoryService;
    private final BookService bookService;

    @PostMapping("/add-category")
    @ApiOperation(value = "Adds a new category")
    public ResponseEntity<?> addCategory(@Valid @RequestBody BookCategory bookCategory) {
        return new ResponseEntity<>(bookCategoryService.addCategory(bookCategory), HttpStatus.CREATED);
    }

    @GetMapping
    @ApiOperation(value = "Retrieves all categories in th library")
    public ResponseEntity<?> getAllCategories() {
        return new ResponseEntity<>(bookCategoryService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping("/{categoryId}/books")
    @ApiOperation(value = "Retrieves all books under a category, with its ID")
    public ResponseEntity<?> getAllBooksByCategory(@PathVariable("categoryId") Long categoryId) {
        return new ResponseEntity<>(bookService.getBooksByCategory(categoryId), HttpStatus.OK);
    }

    @GetMapping("/{categoryId}")
    @ApiOperation(value = "Retrieves a particular category with its ID")
    public  ResponseEntity<?> getCategory(@PathVariable("categoryId") Long categoryId) {
        return  new ResponseEntity<>(bookCategoryService.getCategory(categoryId), HttpStatus.OK);
    }


    @PutMapping("/update-category/{categoryId}")
    @ApiOperation(value = "Updates a particular category with its ID")
    public ResponseEntity<?> updateCategory(@PathVariable("categoryId") Long categoryId, @Valid @RequestBody BookCategory bookCategory) {
        return new ResponseEntity<>(bookCategoryService.updateCategory(categoryId, bookCategory), HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/delete-category/{categoryId}")
    @ApiOperation(value = "Deletes a particular category with its ID")
    public ResponseEntity<?> deleteBook(@PathVariable("categoryId") Long categoryId) {

        return new ResponseEntity<>(bookCategoryService.deleteCategory(categoryId), HttpStatus.NO_CONTENT);
    }
}
