package wanted.moneymwoni.app.budget.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import wanted.moneymwoni.app.category.domain.Category;

import java.util.List;

@Entity
@Table( name = "budget" )
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Budget {
    @Id
    @Column(name = "budget_id")
    private Long id;

    @Column(name = "budget_total")
    private Long total;

    @OneToMany(mappedBy = "budget")
    private List<Category> category;

    public Budget(Long total, List<Category> category) {
        this.total = total;
        this.category = category;
    }
}
