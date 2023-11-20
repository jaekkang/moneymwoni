package wanted.moneymwoni.app.expense.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.member.domain.Member;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "expense",
    indexes = {
        @Index(
            name = "idx__expense__member__category__expense_amount",
            columnList = "member, category, expense_amount",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private Long id;

    @JoinColumn(name = "member", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @JoinColumn(name = "category")
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Column(name = "expense_amount")
    private Long amount;

    @Column(name = "memo")
    private String memo;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Builder
    public Expense(Member member, Category category, Long amount, String memo) {
        this.member = member;
        this.category = category;
        this.amount = amount;
        this.memo = memo;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void update(Category category, Long amount, String memo) {
        this.category = category;
        this.amount = amount;
        this.memo = memo;
        this.updatedAt = LocalDateTime.now();
    }
}
