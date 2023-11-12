package wanted.moneymwoni.app.budget.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wanted.moneymwoni.app.budget.domain.Budget;
import wanted.moneymwoni.app.budget.domain.BudgetRepository;
import wanted.moneymwoni.app.budget.service.BudgetService;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.exception.BudgetNotFound;
import wanted.moneymwoni.app.member.domain.Member;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetServiceImpl implements BudgetService {

    private final BudgetRepository budgetRepository;

    @Override
    public Long createBudget(Category category) {
        Budget budget = Budget.builder()
                            .
                            .build();
        budgetRepository.save()
    }

    @Override
    public Long findByMonth(int year, int month, Member member) {
        Budget budget = budgetRepository.findByYearAndMonthAndMember(year, month, member).orElseThrow(BudgetNotFound::new);
        return budget.getId();
    }
}
