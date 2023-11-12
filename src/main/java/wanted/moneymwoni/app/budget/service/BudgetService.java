package wanted.moneymwoni.app.budget.service;

import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.member.domain.Member;

public interface BudgetService {

    Long createBudget(Category category);
    Long findByMonth(int year, int month, Member member);

}
