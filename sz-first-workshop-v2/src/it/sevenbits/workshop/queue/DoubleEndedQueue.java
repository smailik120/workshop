package it.sevenbits.workshop.queue;

public class DoubleEndedQueue<T> {
private Node<T> head;
public DoubleEndedQueue(Node<T> head) {
	this.head = head;
}

public T getFirst() {
	return head.getMean();
}

public T getLast() {
	Node<T> temp = this.head;
	while(temp.getNext() != null) {
		temp = temp.next();
	}
	return temp.getMean();
}

public void addFirst(T mean) {
	Node<T> node = new Node<T>(mean);
	node.setNext(head);
	head.setPrevious(node);
	head = head.getPrevious();
}

public void addLast(T mean) {
	Node<T> temp = this.head;
	while(temp.getNext() != null) {
		temp = temp.next();
	}
	temp.setNext(new Node<T>(mean));
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	Node<T> temp = this.head;
	while(temp.getNext() != null) {
		sb.append(temp.getMean()).append(" ");
		temp = temp.next();
		sb.append("\n");
	}
    return sb.toString();
}

}
