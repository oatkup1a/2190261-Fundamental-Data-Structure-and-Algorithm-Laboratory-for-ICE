
public class UseStack {
	
	//implement this method.
	public static Stack sort(Stack s) throws Exception {
		ArrayListStack tempStack = new ArrayListStack();
		
		//We will sort the opposite first (big=top & small=bottom) and push back to s
		
		while (!s.isEmpty()) {
			int tempValue = s.top(); //Store the top value temporary
			s.pop(); //Remove the stored value
			
			//While the sorted is not empty and top of sorted is more than the stored value,
			//we will push the top of sorted back to s and remove it from sorted stack. This will repeat until
			//the stored value is more than top of sorted. Hence, the pushed back value will be back into the cycle.
			
			while (!tempStack.isEmpty() && tempStack.top() > tempValue) {
				s.push(tempStack.top());
				tempStack.pop();
			}
			
			tempStack.push(tempValue);
		}
		
		//Now, we will push the sorted stack back to s, which will reverse the opposite sort from the beginning.
		while (!tempStack.isEmpty()) {
			s.push(tempStack.top());
			tempStack.pop();
		}
		
		return s;
	}

}

