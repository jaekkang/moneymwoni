package wanted.moneymwoni.app.expense.service;


import wanted.moneymwoni.app.category.domain.Category;
import wanted.moneymwoni.app.member.domain.Member;

public interface ExpenseService {
    Long create(
        Member member,
        Long amount,
        Category category,
        String memo
    );

    Long update(Long expenseId, Long amount, Category category, String memo);

}
