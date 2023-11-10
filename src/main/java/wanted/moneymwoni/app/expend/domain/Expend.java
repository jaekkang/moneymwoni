package wanted.moneymwoni.app.expend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.member.domain.Member;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expend_id")
    private Long id;

    @JoinColumn(name = "expend", nullable = false)
    @ManyToOne
    private Member member;

    @JoinColumn(name = "expend")
    @ManyToOne
    private Category category;

    @Column(name = "expend_amount")
    private int amount;

    @Column(name = "expend_memo")
    private String memo;

    @Builder
    public Expend(Member member, Category category, int amount, String memo) {
        this.member = member;
        this.category = category;
        this.amount = amount;
        this.memo = memo;
    }
}
