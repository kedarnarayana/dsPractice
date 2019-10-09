package linkedListDS;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		++sizeOfList;

		if (root == null) {
			this.root = new Node<>(data);
		} else {
			insertDataAtBegining(data);
		}
	}

	// O(1)
	private void insertDataAtBegining(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		this.root = newNode;

	}

	// O(N)
	@SuppressWarnings("unused")
	private void insertDataAtEnd(T data, Node<T> node) {

		if (node.getNextNode() != null) {
			insertDataAtEnd(data, node.getNextNode());
		} else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}

	}

	@Override
	public void remove(T data) {

		if (this.root == null)
			return;

		--sizeOfList;

		if (this.root.getData().compareTo(data) == 0) {
			this.root = this.root.getNextNode();
		} else {
			remove(data, root, root.getNextNode());
		}

	}

	private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {
		while (actualNode != null) {
			if (actualNode.getData().compareTo(dataToRemove) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}

	}

	@Override
	public void traverseList() {
		if (this.root == null)
			return;

		Node<T> actualNode = this.root;

		while (actualNode != null) {
			System.out.print(actualNode + " -> ");
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return sizeOfList;
	}

	// An in-place (without extra memory) algorithm thats able to find the middle node
	@Override
	public Node<T> getMiddleNode() {

		if (this.root == null)
			return null;

		Node<T> fastPointer = this.root;
		Node<T> slowPointer = this.root;

		while (fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null) {
			fastPointer = fastPointer.getNextNode().getNextNode();
			slowPointer = slowPointer.getNextNode();
			// System.out.println("fp: " + fastPointer + "; sp:" + slowPointer);
		}

		return slowPointer;
	}

	// An in-place algorithm to reverse a linked list!
	@Override
	public void reverse() {
		Node<T> currentNode = this.root;
		Node<T> previousNode = null;
		Node<T> nextNode = null;

		while (currentNode != null) {
			nextNode = currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		this.root = previousNode;

	}

}
