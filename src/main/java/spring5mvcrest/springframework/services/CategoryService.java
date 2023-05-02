package spring5mvcrest.springframework.services;

import spring5mvcrest.springframework.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
