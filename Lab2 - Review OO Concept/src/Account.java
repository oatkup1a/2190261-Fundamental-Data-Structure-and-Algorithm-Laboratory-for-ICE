public class Account {
    private String accountId;
    private String accountName;
    private TransactionManager transactionManager;
    private double balance;

    public Account(String accountId, String accountName) {
    	// Put your code here
    	
    	
    	
    	
    	
    	
    }

    public void deposit(double amount) throws NegativeAmountException {
    	// Put your code here
    	
    	
    	
    	
    	
    	
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientAmountException {
    	// Put your code here
    	
    	
    	
    	
    	
    	

    
    
    
    
    }

    public void transfer(Account targetAccount, double amount) throws NegativeAmountException, InsufficientAmountException {
    	// Put your code here
    	
    	
    	
    	
    	
    	

    
    
    
    
    
    
    
    
    
    }

    public double getBalance() {
        return balance;
    }
    
    public String getAccountId() {
    	return accountId;
    }

}