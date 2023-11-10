package wanted.moneymwoni.app.category.service;

import wanted.moneymwoni.app.budget.domain.Budget;
import wanted.moneymwoni.app.category.domain.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Long createCategory(Budget budget, String categoryName);
}
