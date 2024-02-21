
public class StudentList extends CDLinkedList {
    // you can write additional methods.

	// implement this method
	public void swapNode(DListIterator i1, DListIterator i2) throws Exception {
		DListNode p1 = i1.currentNode;
		DListNode p1before = i1.currentNode.previousNode;
		DListNode p1after = i1.currentNode.nextNode;
		DListNode p2 = i2.currentNode;
		DListNode p2before = i2.currentNode.previousNode;
		DListNode p2after = i2.currentNode.nextNode;
		
		p1before.nextNode = p2;
		p2.previousNode = p1before;
		
		p1after.previousNode = p2;
		p2.nextNode = p1after;
		
		p2before.nextNode = p1;
		p1.previousNode = p2before;
		
		p2after.previousNode = p1;
		p1.nextNode = p2after;
	}
	
	// implement this method
	public void insertList(DListIterator i1, CDLinkedList lst) throws Exception {
		
		if (lst.isEmpty()) {
			return;
		}
		
		DListNode p1 = i1.currentNode;
		DListNode p2 = i1.currentNode.nextNode;
		DListNode l1 = lst.header.nextNode;
		DListNode l2 = lst.header.previousNode;
		
		p1.nextNode = l1;
		l1.previousNode = p1;
		
		p2.previousNode = l2;
		l2.nextNode = p2;
		
	}

	// implement this method
	public void gender(String g) throws Exception {
		DListIterator head = new DListIterator(header);
		DListIterator itr = new DListIterator(header);
		
		while (itr.hasNext() && itr.currentNode.nextNode != header) {
			Student s = (Student)itr.next();
			if (s.getSex() == g) {
				remove(findPrevious(itr));
				insert(s, head);
				head.next();
			}
		}
	}

}
