package wanted.moneymwoni.app.category.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
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
public class Category {
    @Id
    @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name", nullable = false)
    private String name;

    @Column(name = "category_budget_percentage", nullable = false)
    private Long percentage;

    @Column(name = "category_budget_allocated")
    private Long budgetAllocated;

    @JoinColumn(name = "category_id")
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
