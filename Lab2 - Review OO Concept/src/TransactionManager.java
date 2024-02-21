import java.util.ArrayList;

class TransactionManager {
    private static TransactionManager instance;
    private ArrayList<String> transactionList;

    private TransactionManager() {
    	// Put your code here
    	transactionList = new ArrayList<String>();
    }

    public void clear() {
    	this.transactionList.clear();
    }
    
    public static TransactionManager getInstance() {
    	// Put your code here
    	if (instance == null) {
    		instance = new TransactionManager();
    	}
    	return instance;
    }

    public void logTransaction(String transaction) {
    	// Put your code here
    	transactionList.add(transaction);
    }

    public ArrayList<String> getTransactionList() {
        return new ArrayList<>(transactionList);
    }
}
