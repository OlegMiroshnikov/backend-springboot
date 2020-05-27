package ru.javabegin.tasklist.backendspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.tasklist.backendspringboot.entity.Category;
import ru.javabegin.tasklist.backendspringboot.repo.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping("/category") // базовый адрес
public class CategoryController {

    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/test")
    public List<Category> test(){
        return categoryRepository.findAll();
    }

}
