
public class PriorityQueue {
	MyQueue q;

	public PriorityQueue(MyQueue q) {
		super();
		this.q = q;
	}

	// implement this.
	public void push(int x) throws Exception {
	    int[] temp = new int[q.size()+1];
	    int i = 0;
	    boolean xInserted = false; // Flag to track if x has been inserted

	    // Handle the case when the queue is empty
	    if (q.isEmpty()) {
	        q.insertLast(x);
	        return;
	    }

	    // keep adding into temp until found that tempValue >= x.
	    // add x into temp and change xInserted to true.
	    // continue adding q to temp until q is empty.
	    
	    while (!q.isEmpty()) {
	        int tempValue = top();
	        pop();

	        if (!xInserted && tempValue >= x) {
	            temp[i++] = x;
	            xInserted = true;
	        }

	        temp[i++] = tempValue;
	    }

	    // Handle case if x is greater than all elements
	    if (!xInserted) {
	        temp[i++] = x;
	    }

	    // Insert elements from temp back into q
	    for (int j = 0; j < i; j++) {
	        q.insertLast(temp[j]);
	    }
	}


	// implement this.
	public void pop() throws Exception {
		q.removeFirst();

	}

	// implement this
	public int top() throws Exception {
		return q.front();

	}

}
