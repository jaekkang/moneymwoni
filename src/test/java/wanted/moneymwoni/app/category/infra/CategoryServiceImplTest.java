package wanted.moneymwoni.app.category.infra;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.category.domain.CategoryRepository;
import wanted.moneymwoni.app.category.service.CategoryService;

import java.util.List;

@SpringBootTest
@Transactional
class CategoryServiceImplTest {

    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryRepository categoryRepository;

    @BeforeEach
    public void setUp() {
        Category category1 = Category.builder()
                                 .name("test1")
                                 .build();
        Category category2 = Category.builder()
                                 .name("test2")
                                 .build();

        categoryRepository.save(category1);
        categoryRepository.save(category2);
    }

    @Test
    void test_findAll() {
        Category category3 = Category.builder()
                                 .name("test3")
                                 .build();
        categoryRepository.save(category3);
        // given
        List<Category> findList = categoryService.findAll();

        // when & then
        Assertions.assertThat(findList).isNotEmpty();
    }
}