package LinkedList;

import java.util.Iterator;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {

	}

	public void append(Object value){
		Node newNode = new Node(value);
		if (head == null){
			head = newNode;
		}
		else {
			tail.next = newNode;
		}
		tail = newNode;
		size++;
	}

	public Object get(int index){
		if (head == null){
			throw new NullPointerException();
		} else if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node node = head;
		int count = 0;
		// khai bao mot cai bien i tuong tu nhu dung for

		while (count < index){
			node = node.next;
			count++;
		}
		return node.getValue();
	}

	public void set(int index, Object value){
		if (head == null){
			throw new NullPointerException();
		} else if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node node = head;
		int count = 0;
		// khai bao mot cai bien i tuong tu nhu dung for

		while (count < index){
			node = node.next;
			count++;
		}

		node.setValue(value);
	}

	public void remove(int index){
		if (head == null){
			throw new NullPointerException();
		} else if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0){
			head = head.next;
		}else{
			Node node = head;
			int count = 0;
			while (count < index - 1){
				node = node.next;
				count++;
			}
			node.next = node.next.next;
			if (index == size - 1){
				tail = node;
			}
		}
	}

	public MyIterator iterator(){
		return new MyLinkedListIterator(head);
	}
}
