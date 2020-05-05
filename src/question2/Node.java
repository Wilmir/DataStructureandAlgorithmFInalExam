package question2;


/* The Generic Node of the Binary Tree*/
/*
 * A node has an element which in the implementation is a student
 * A node also has pointers to its left and right node
 * Upon instantiation, the left and right node pointers are set to Null
 */
public class Node<T extends Comparable<T>> {
	T element;
	Node<T> left;
	Node<T> right;
	
	public Node(T element) {
		this.element = element;
		this.left = null;
		this.right = null;
	}
	
	//A to String method which will print the Student Name and Average
	public String toString() {
		return element.toString();
	}

}
