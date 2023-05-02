package spring5mvcrest.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring5mvcrest.springframework.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
