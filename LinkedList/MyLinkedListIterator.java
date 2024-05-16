package LinkedList;

public class MyLinkedListIterator implements MyIterator{
	private Node currentNode;
	public MyLinkedListIterator(Node head) {
		this.currentNode = head;
	}

	@Override
	public boolean hasNext() {
		return currentNode != null && currentNode.getNext() != null;
	}

	@Override
	public Object next() {
		Object val = currentNode.getValue();
		currentNode = currentNode.getNext();
		return val;
	}
}
