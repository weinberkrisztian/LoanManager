DROP TABLE IF EXISTS loan;

CREATE TABLE IF NOT EXISTS loan (
  uuid UUID PRIMARY KEY,
  customer_uuid UUID NOT NULL,
  start_date timestamp NOT NULL,
  loan_type varchar(100) NOT NULL,
  total_loan int NOT NULL,
  amount_paid int NOT NULL,
  outstanding_amount int NOT NULL,
  create_date timestamp DEFAULT NULL
);