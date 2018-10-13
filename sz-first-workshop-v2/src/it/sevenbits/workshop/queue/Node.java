package it.sevenbits.workshop.queue;

public class Node<T> {
private Node<T> next;
private Node<T> previous;
private T mean;

public Node(T mean) {
	this.mean = mean;
}

Node<T> next() {
	return this.next;
}

public Node<T> getNext() {
	return next;
}

public Node<T> getPrevious() {
	return previous;
}

public void setNext(Node<T> next) {
	this.next = next;
}

public void setPrevious(Node<T> previous) {
	this.previous = previous;
}
public T getMean() {
	return mean;
}

}
