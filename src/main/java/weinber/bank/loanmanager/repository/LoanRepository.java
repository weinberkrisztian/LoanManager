package weinber.bank.loanmanager.repository;

import org.springframework.data.repository.CrudRepository;
import weinber.bank.loanmanager.entity.Loan;

import java.util.List;
import java.util.UUID;

public interface LoanRepository extends CrudRepository<Loan, UUID> {
    List<Loan> findAllByCustomerUuid(UUID customerUuid);

}
