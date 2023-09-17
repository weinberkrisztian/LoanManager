package weinber.bank.loanmanager.service.converter;

import org.springframework.stereotype.Service;
import weinber.bank.loanmanager.dto.LoanDTO;
import weinber.bank.loanmanager.entity.Loan;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class LoanConverter {

    public Loan convertLoanDTO(LoanDTO loanDTO) {
        return Loan.builder()
                .uuid(Optional.ofNullable(loanDTO.getUuid()).orElse(UUID.randomUUID()))
                .customerUuid(loanDTO.getCustomerUuid())
                .startDate(loanDTO.getStartDate())
                .loanType(loanDTO.getLoanType())
                .totalLoan(loanDTO.getTotalLoan())
                .amountPaid(loanDTO.getAmountPaid())
                .outstandingAmount(loanDTO.getOutstandingAmount())
                .createDate(Instant.now())
                .build();
    }
}