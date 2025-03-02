package com.spendify.Spendify.service;

import com.spendify.Spendify.model.Category;

import java.util.List;

public interface CategoryService{
    public Category saveCategory(Category category);
    public List<Category> getAllCategories();
}
