package wanted.moneymwoni.app.budget.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(
    name = "budget",
    indexes = {
        @Index(
            name = "idx__budget",
            columnList = "",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Budget {
    @Id
    @Column(name = "budget_id")
    private Long id;
}
