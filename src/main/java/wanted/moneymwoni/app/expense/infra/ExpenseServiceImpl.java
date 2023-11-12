package wanted.moneymwoni.app.expense.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.exception.MemberNotFound;
import wanted.moneymwoni.app.expense.domain.Expense;
import wanted.moneymwoni.app.expense.domain.ExpenseRepository;
import wanted.moneymwoni.app.expense.service.ExpenseService;
import wanted.moneymwoni.app.member.domain.Member;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseRepository expenseRepository;


    @Override
    public Long create(Member member, Long amount, Category category, String memo) {
        Expense expense = Expense.builder()
                              .memo(memo)
                              .member(member)
                              .category(category)
                              .amount(amount)
                              .build();
        expenseRepository.save(expense);
        return expense.getId();
    }

    @Override
    public Long update(Long expenseId, Long amount, Category category, String memo) {
        Expense expense = expenseRepository.findById(expenseId).orElseThrow(MemberNotFound::new);
        expense.update(category, amount, memo);
        return expenseId;
    }
}
