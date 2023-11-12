package wanted.moneymwoni.app.category.domain;

import jakarta.persistence.*;
import lombok.*;
import wanted.moneymwoni.app.budgetCategory.domain.BudgetCategory;

import java.util.List;

@Entity
@Table(
    name = "category",
    indexes = {
        @Index(
            name = "idx__category__category_name",
            columnList = "category_name",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<BudgetCategory> budgetCategories;

    @Builder
    public Category(String name) {
        this.name = name;
    }
}
