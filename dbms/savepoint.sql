
CREATE TABLE IF NOT EXISTS accounts (account_id INT PRIMARY KEY,balance DECIMAL(10, 2));
START TRANSACTION;
INSERT INTO accounts (account_id, balance) VALUES (1, 1000);
SAVEPOINT before_deduction;
UPDATE accounts SET balance = balance - 200 WHERE account_id = 1;
RELEASE SAVEPOINT before_deduction;
UPDATE accounts SET balance = balance + 300 WHERE account_id = 1;
COMMIT;
--  ROLLBACK;
