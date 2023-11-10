package wanted.moneymwoni.app.category.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.category.domain.CategoryRepository;
import wanted.moneymwoni.app.category.service.CategoryService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }
}
