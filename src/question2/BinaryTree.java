package question2;


/* THE INTERFACE FOR THE BINARY TREE
 * The generic object is bounded to extend Comparable
 * All the methods do not have an implementation
 */
public interface BinaryTree<T extends Comparable<T>> {
	
	//this checks whether the binary tree is empty
	public boolean empty(Node<T> node);
	
	//this allows for insertion of node to the tree
	public void add(Node<T> node, T element);
	
	//this returns the size of the tree
	public int size(Node<T> node);
	
	
	// Return the maximum average grade of the student
	public double maxAverage(Node<T> node);
	
	
	// Return the minimum average grade of the student
	public double minAverage(Node<T> node);
	
	//this will print the tree in 3 different orders (inOrder, preOrder, and postOrder)
	public void printTree(Node<T> node);
}
