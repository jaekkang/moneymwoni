package wanted.moneymwoni.app.category.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wanted.moneymwoni.app.budget.domain.Budget;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.category.domain.CategoryRepository;
import wanted.moneymwoni.app.category.service.CategoryService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Long createCategory(Budget budget, String categoryName) {
        Category newCategory = Category.builder()
                                   .name(categoryName)
                                   .budget(budget)
                                   .build();
        categoryRepository.save(newCategory);

        return newCategory.getId();
    }
}
