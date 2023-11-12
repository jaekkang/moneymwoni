package wanted.moneymwoni.app.budgetCategory.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.budget.domain.Budget;
import wanted.moneymwoni.app.category.domain.Category;

@Entity
@Table(name = "budget_category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BudgetCategory {
    @Id
    @Column(name = "budget_category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public BudgetCategory(Budget budget, Category category) {
        this.budget = budget;
        this.category = category;
    }
}
