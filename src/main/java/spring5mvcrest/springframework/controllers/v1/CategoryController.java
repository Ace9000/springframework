package spring5mvcrest.springframework.controllers.v1;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring5mvcrest.springframework.api.v1.model.CategoryDTO;
import spring5mvcrest.springframework.api.v1.model.CategoryListDTO;
import spring5mvcrest.springframework.services.CategoryService;

@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {
    public static final String BASE_URL = "/api/v1/categories";
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getallCategories() {
        return new CategoryListDTO(categoryService.getAllCategories());
    }
    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String name) {
        return categoryService.getCategoryByName(name);

    }
}
