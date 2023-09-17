package weinber.bank.loanmanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class LoanDTO {
    @JsonProperty
    private UUID uuid;
    @JsonProperty("customer_uuid")
    private UUID customerUuid;
    @JsonProperty("start_date")
    private Instant startDate;
    @JsonProperty("loan_type")
    private String loanType;
    @JsonProperty("total_loan")
    private Long totalLoan;
    @JsonProperty("amount_paid")
    private Long amountPaid;
    @JsonProperty("outstanding_amount")
    private Long outstandingAmount;
    @JsonIgnore
    private Instant createDate;
}
