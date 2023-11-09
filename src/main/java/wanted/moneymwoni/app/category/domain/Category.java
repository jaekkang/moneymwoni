package wanted.moneymwoni.app.category.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(
    name = "category",
    indexes = {
        @Index(
            name = "idx__category__name",
            columnList = "name",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name", nullable = false)
    private String name;

    @Builder
    public Category(String name) {
        this.name = name;
    }
}
