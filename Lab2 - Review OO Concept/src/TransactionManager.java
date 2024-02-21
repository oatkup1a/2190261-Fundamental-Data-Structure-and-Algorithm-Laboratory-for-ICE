import java.util.ArrayList;

class TransactionManager {
    private static TransactionManager instance;
    private ArrayList<String> transactionList;

    private TransactionManager() {
    	// Put your code here
    	
    	
    	
    }

    public void clear() {
    	this.transactionList.clear();
    }
    
    public static TransactionManager getInstance() {
    	// Put your code here
    	
    	
    	
    	
    	
    	
    }

    public void logTransaction(String transaction) {
    	// Put your code here
    	
    	
    	
    	
    	
    	
    }

    public ArrayList<String> getTransactionList() {
        return new ArrayList<>(transactionList);
    }
}
