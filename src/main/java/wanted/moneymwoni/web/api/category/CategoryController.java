package wanted.moneymwoni.web.api.category;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.category.service.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/api/v1/categories")
    private List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping("/api/v1/categories")
    private Long create(String name) {
        return categoryService.create(name);
    }
}
