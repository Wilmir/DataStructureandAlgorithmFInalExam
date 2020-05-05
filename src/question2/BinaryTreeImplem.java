package question2;

/*THE BINARY TREE IMPLEMENTATION*/
/*The Generic implementation ensures that the Tree Will only accept Comparable objects
 * 
 */
public class BinaryTreeImplem<T extends Comparable<T>> implements BinaryTree<T> {



	//this checks whether the binary tree is empty by looking at the root node
	@Override
	public boolean empty(Node<T> node) {
		return node == null;
	}


	/* This inserts a node by checking if the root node is empty.
	 * If no, check if the value of node is less than the root node's value.
	 * If yes, perform recursive insertion on the left subtree
	 * If no, perfom recursive insertion on the right subtree
	 */
	@Override
	public void add(Node<T> node, T student) {
		if(student.compareTo(node.element) <= 0) {
			if(node.left != null){
				add(node.left, student);
			}else{
				node.left = new Node<T>(student);
			}			
		}else if(student.compareTo(node.element) > 0){
			if(node.right != null){
				add(node.right, student);
			}else{
				node.right = new Node<T>(student);
			}			
		}
	}

	/* Gets the size of the tree by traversing through recursion on the left and right subtrees
	 * 
	 */
	@Override
	public int size(Node<T> node) {
		if(node == null)
			return 0;

		return 1 + size(node.left) + size(node.right);
	}

	/* The return type is not explicitly defined in the requirement
	 * In my implementation, I decided to return the node with the highest average
	 * I will then get the maximum average value through the returned node in the main method.
	 */
	@Override
	public double maxAverage(Node<T> node) {
		while(node.right != null) {
			node = node.right;
		}

		return ((Student)node.element).getAcademicRecord().getAverage();


	}

	/* The return type is not explicitly defined in the requirement
	 * In my implementation, I decided to return the node with the lowest average
	 * I will then get the minimum average value through the returned node in the main method.
	 */
	@Override
	public double minAverage(Node<T> node) {
		while(node.left != null) 
			node = node.left;

		return ((Student)node.element).getAcademicRecord().getAverage();

	}

	/* There are different ways to represent and print the tree, and it is not explicitly defined in the requirement
	 * In my implementation, I decided to print the trees in 3 different orders
	 * 1. InOrder (left, node, right)
	 * 2. PreOrder(node, left, right)
	 * 3. PostOrder (left, node, right)
	 */
	@Override
	public void printTree(Node<T> node) {
		System.out.println("\nIn Order Traversal");
		inOrder(node);

		System.out.println("\n\nPreOrder Traversal");
		preOrder(node);
		
		System.out.println("\n\nPostOrder Traversal");
		postOrder(node);
	}

	// InOrder Traversal (traverse left subtree, visit node, traverse right subtree)
	public void inOrder(Node<T> node) {
		if(node == null)
			return;

		inOrder(node.left);
		System.out.println(node.element + " ");
		inOrder(node.right);

	}

	// PreOrder Traversal (visit node, traverse left subtree, traverse right subtree)
	public void preOrder(Node<T> node) {
		if(node == null)
			return;

		System.out.println(node.element + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// PostOrder Traversal (traverse left subtree, traverse right subtree, visit node)
	public void postOrder(Node<T> node) {
		if(node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.element + " ");

	}	
}
