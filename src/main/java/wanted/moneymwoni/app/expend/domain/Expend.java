package wanted.moneymwoni.app.expend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.category.domain.Category;

@Entity
@Table(
    name = "expend"
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Expend {
    @Id
    @Column(name = "expend_id")
    private Long id;

    private int expend;

    private String content;

    @Builder
    public Expend(Long id, int expend, String content) {
        this.id = id;
        this.expend = expend;
        this.content = content;
    }
}
