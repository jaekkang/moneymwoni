package wanted.moneymwoni.app.budget.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.category.domain.Category;
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

    @JoinColumn(name = "budget")
    @ManyToOne
    private Member member;

    @Column(name = "budget_amount")
    private Long amount;

    @OneToMany(mappedBy = "budget")
    private Set<Category> categories;

    @Builder
    public Budget(Member member, Long amount, Set<Category> categories) {
        this.member = member;
        this.amount = amount;
        this.categories = categories;
    }
}
