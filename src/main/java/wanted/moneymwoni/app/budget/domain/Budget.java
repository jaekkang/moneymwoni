package wanted.moneymwoni.app.budget.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.budgetCategory.domain.BudgetCategory;
import wanted.moneymwoni.app.member.domain.Member;

import java.util.Set;

@Entity
@Table(name = "budget")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_id")
    private Long id;

    @JoinColumn(name = "member_id")
    @ManyToOne
    private Member member;

    @Column(name = "budget_amount")
    private Long amount;

    @OneToMany(mappedBy = "budget")
    private Set<BudgetCategory> categories;

    @Builder
    public Budget(Member member, Long amount, Set<BudgetCategory> categories) {
        this.member = member;
        this.amount = amount;
        this.categories = categories;
    }
}
