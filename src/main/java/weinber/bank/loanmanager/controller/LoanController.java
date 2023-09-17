package weinber.bank.loanmanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import weinber.bank.loanmanager.dto.LoanDTO;
import weinber.bank.loanmanager.entity.Loan;
import weinber.bank.loanmanager.service.LoanService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(("/loan"))
@RequiredArgsConstructor
public class LoanController {
    private final LoanService loanService;

    @GetMapping("/findByCustomerUuid")
    public ResponseEntity<List<Loan>> loansByCustomerUuid(@RequestParam("customer_uuid") UUID customerUuid) {
        List<Loan> loansByCustomerUuid = loanService.getLoansByCustomerUuid(customerUuid);
        return ResponseEntity.status(HttpStatus.OK)
                .body(loansByCustomerUuid);
    }

    @PostMapping("/create")
    public ResponseEntity<Loan> createLoan(@RequestBody LoanDTO loanDTO) {
        Loan savedLoan = loanService.saveLoanFromDTO(loanDTO);
        return ResponseEntity.status(HttpStatus.OK)
                .body(savedLoan);
    }
}
