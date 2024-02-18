## **Accounts Simulator**
Revisit OO concepts with Enhanced Transaction Logging

**Objective**: The goal of this lab is to elevate the functionality of the ATM simulator by incorporating a robust transaction logging system for money transfers, leveraging the Singleton design pattern.

Requirements:

###**Account Class:**

**Private Variables:**
- `accountId`: Unique identifier for the account.
- `accountName`: Name associated with the account.
- `transactionManager`: An object of the `TransactionManager` class, implemented as a singleton.

**Operations:**
- **deposit(amount):**
  - Accepts a positive amount and adds it to the account balance.
  - Logs the deposit transaction using the `TransactionManager` singleton, storing the transaction as a string in the format: `"DEPOSIT - Amount: {amount} - Account ID: {accountId}"`.

- **withdraw(amount):**
  - Accepts a positive amount and deducts it from the account balance.
  - Logs the withdrawal transaction using the `TransactionManager` singleton, storing the transaction as a string in the format: `"WITHDRAWAL - Amount: {amount} - Account ID: {accountId}"`.
  - Ensures the withdrawal amount is not negative.
  - Prevents withdrawal of more money than the available balance.
  - Throws a new exception, `NegativeAmount`, if there is a deposit or withdrawal of a negative amount.
  - Throws a new exception, `InsufficientAmount`, if the withdrawal amount exceeds the current balance.

- **transfer(Account, amount):**
  - Transfers a specified amount from the current account to the target account.
  - Logs the transfer transaction using the `TransactionManager` singleton, storing the transaction as a string in the format: `"TRANSFER - Amount: {amount} - From Account ID: {sourceAccountId} - To Account ID: {targetAccountId}"`.
  - Ensures the transfer amount is not negative.
  - Prevents transferring more money than the available balance.
  - Throws a new exception, `NegativeAmount`, if there is a negative transfer amount.
  - Throws a new exception, `InsufficientAmount`, if the transfer amount exceeds the current balance.

- **getBalance(this):**
  - Retrieves the current account balance.

###**TransactionManager (Singleton Class):**

**Private Variables:**
- `instance`: An object responsible for logging transactions.
- `transactionList`: An ArrayList to store all transactions.

**Operations**
- **`logTransaction(String transaction)`**
  - Stores the input transaction in the `transactionList`
- **`getInstance()`**
  - If the instance has not been created yet, please create an instance of this class.
  - Otherwise, return the `instance`
**Singleton Implementation:**
- Ensures that only one instance of `TransactionManager` exists throughout the application.

**Transaction Logging:**
- Logs deposit, withdrawal, and transfer transactions with details such as action, amount, and involved account(s).
- Stores each transaction as a string in the `transactionList`.
