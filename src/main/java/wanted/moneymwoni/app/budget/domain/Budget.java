package wanted.moneymwoni.app.budget.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.budgetCategory.domain.BudgetCategory;
import wanted.moneymwoni.app.member.domain.Member;

import java.util.Set;

@Entity
@Getter
@Table(
    name = "budget",
    indexes = {
        @Index(
            name = "idx__budget__year__month",
            columnList = "year, month",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_id")
    private Long id;

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY )
    private Member member;

    @Column(name = "budget_amount")
    private Long amount;

    @OneToMany(mappedBy = "budget", fetch = FetchType.LAZY)
    private Set<BudgetCategory> categories;

    @Column(name = "year")
    private Integer year;

    @Column(name = "month")
    private Integer month;

    @Builder

    public Budget(Member member, Long amount, Set<BudgetCategory> categories, Integer year, Integer month) {
        this.member = member;
        this.amount = amount;
        this.categories = categories;
        this.year = year;
        this.month = month;
    }
}
