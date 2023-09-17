package weinber.bank.loanmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LoanManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagerApplication.class, args);
	}

}
