package weinber.bank.loanmanager.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "loan")
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Id
    @Column
    private UUID uuid;
    @Column(name = "customer_uuid")
    private UUID customerUuid;
    @Column(name = "start_date")
    private Instant startDate;
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "total_loan")
    private Long totalLoan;
    @Column(name = "amount_paid")
    private Long amountPaid;
    @Column(name = "outstanding_amount")
    private Long outstandingAmount;
    @Column(name = "create_date", updatable = false)
    private Instant createDate;
}