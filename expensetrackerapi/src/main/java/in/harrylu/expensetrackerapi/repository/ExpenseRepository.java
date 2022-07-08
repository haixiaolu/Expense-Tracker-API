package in.harrylu.expensetrackerapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import in.harrylu.expensetrackerapi.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
	//SELECT * FROM tbl_expenses WHERE category = ?
	Page <Expense>findByCategory(String category, Pageable page);

	
}
