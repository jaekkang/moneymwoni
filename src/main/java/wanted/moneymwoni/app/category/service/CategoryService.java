package wanted.moneymwoni.app.category.service;

import wanted.moneymwoni.app.category.domain.Category;

import java.util.List;
import java.util.Set;

public interface CategoryService {
    List<Category> findAll();

    Long createCategory(String categoryName);
}
