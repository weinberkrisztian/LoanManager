package weinber.bank.loanmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weinber.bank.loanmanager.dto.LoanDTO;
import weinber.bank.loanmanager.entity.Loan;
import weinber.bank.loanmanager.repository.LoanRepository;
import weinber.bank.loanmanager.service.converter.LoanConverter;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class LoanService {
    private final LoanRepository loanRepository;
    private final LoanConverter loanConverter;


    public Loan saveLoanFromDTO(LoanDTO loanDTO) {
        Loan card = loanConverter.convertLoanDTO(loanDTO);
        return saveLoan(card);
    }

    public List<Loan> getLoansByCustomerUuid(UUID customerUuid) {
        return loanRepository.findAllByCustomerUuid(customerUuid);
    }

    private Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }
}
