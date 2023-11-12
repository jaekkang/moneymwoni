package wanted.moneymwoni.web.api.expense;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import wanted.moneymwoni.app.expense.service.ExpenseService;

@RestController
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseService expenseService;
}
