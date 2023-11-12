package wanted.moneymwoni.app.budget.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import wanted.moneymwoni.app.member.domain.Member;

import java.util.Optional;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    @Query("SELECT b FROM Budget b WHERE EXTRACT(YEAR FROM b.year) = :year AND EXTRACT(MONTH FROM b.year) = :month AND b.member = :member")
    Optional<Budget> findByYearAndMonthAndMember(@Param("year") int year, @Param("month") int month, @Param("member") Member member);
}
