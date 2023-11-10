package wanted.moneymwoni.app.expend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.budget.domain.Budget;

@Entity
@Table(
    name = "expend",
    indexes = {
        @Index(
            name = "idx__expend__expend_money__expend_content",
            columnList = "expend_money, expend_content",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Expend {
    @Id
    @Column(name = "expend_id")
    private Long id;

    @Column(name = "expend_money")
    private int expend;

    @Column(name = "expend_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    @Builder
    public Expend(int expend, String content, Budget budget) {
        this.expend = expend;
        this.content = content;
        this.budget = budget;
    }
}
