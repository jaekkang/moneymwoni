package wanted.moneymwoni.app.category.domain;

import jakarta.persistence.*;
import lombok.*;
import wanted.moneymwoni.app.budget.domain.Budget;

@Entity
@Table(
    name = "category",
    indexes = {
        @Index(
            name = "idx__category__category_name__category_budget_percentage",
            columnList = "category_name, category_budget_percentage",
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

    @Column(name = "category_budget_percentage")
    private Long percentage;

    @Column(name = "category_budget_allocated")
    private Long budgetAllocated;

    @JoinColumn(name = "category")
    @ManyToOne
    private Budget budget;

    @Builder
    public Category(String name, Long percentage, Long budgetAllocated, Budget budget) {
        this.name = name;
        this.percentage = percentage;
        this.budgetAllocated = budgetAllocated;
        this.budget = budget;
    }
}
