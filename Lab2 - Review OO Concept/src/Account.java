public class Account {
    private String accountId;
    private String accountName;
    private TransactionManager transactionManager;
    private double balance;

    public Account(String accountId, String accountName) {
    	// Put your code here
    	this.accountId = accountId;
    	this.accountName = accountName;
    	transactionManager = TransactionManager.getInstance();
    }

    public void deposit(double amount) throws NegativeAmountException {
    	// Put your code here
    	if (amount < 0) {
    		throw new NegativeAmountException("Negative Amount Transfer.");
    	}
    	else {
    		balance += amount;
    	transactionManager.logTransaction("DEPOSIT - Amount: " + amount +" - Account ID: " + accountId);
    	}
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientAmountException {
    	// Put your code here
    	if (amount < 0) {
    		throw new NegativeAmountException("Negative Amount Transfer.");
    	}
    	else if (amount > balance) {
    		throw new InsufficientAmountException("Transfer amount exceeds the current balance.");
    	}
    	else {
    		balance -= amount;
    		transactionManager.logTransaction("WITHDRAWAL - Amount: " + amount +" - Account ID: " + accountId);
    	}
    }

    public void transfer(Account targetAccount, double amount) throws NegativeAmountException, InsufficientAmountException {
    	// Put your code here
    	if (amount < 0) {
    		throw new NegativeAmountException("Negative Amount Transfer.");
    	}
    	else if (amount > balance) {
    		throw new InsufficientAmountException("Transfer amount exceeds the current balance.");
    	}
    	else {
    		balance -= amount;
    		targetAccount.balance += amount;
    		transactionManager.logTransaction("TRANSFER - Amount: " + amount +" - From Account ID: " + accountId + " - To Account ID: " + targetAccount.accountId);
    	}
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountId() {
    	return accountId;
    }

}