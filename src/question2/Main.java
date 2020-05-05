package question2;

import question1.LinkedList;

public class Main {
	public static void main(String[] args) {
	
		//The academicRecord for student1
		LinkedList record1 = new LinkedList(); 
		record1.add("Java", 60);
		record1.add("Math", 70);
		record1.add("English", 80);
		record1.add("History", 60);


		// *HIGHEST AVERAGE* The academicRecord for student2 
		LinkedList record2 = new LinkedList(); 
		record2.add("Java", 80);
		record2.add("Math", 90);
		record2.add("English", 100);
		record2.add("History", 90);

		
		// *LOWEST AVERAGE*The academicRecord for student3
		LinkedList record3 = new LinkedList(); 
		record3.add("Java", 40);
		record3.add("Math", 50);
		record3.add("English", 30);
		record3.add("History", 40);

		
		//The academicRecord for student4
		LinkedList record4 = new LinkedList(); 
		record4.add("Java", 55);
		record4.add("Math", 62);
		record4.add("English", 90);
		record4.add("History", 60);

		
		//The academicRecord for student5
		LinkedList record5 = new LinkedList(); 
		record5.add("Java", 64);
		record5.add("Math", 59);
		record5.add("English", 70);
		record5.add("History", 90);

		
		//The 5 students
		Student student1 = new Student("Tony", 20, 1001, record1);
		Student student2 = new Student("Joey", 19, 1002, record2);
		Student student3 = new Student("Gina", 21, 1003, record3);
		Student student4 = new Student("Alex", 20, 1004, record4);
		Student student5 = new Student("Tere", 20, 1005, record5);

		//The Binary Tree
		BinaryTreeImplem<Student> tree = new BinaryTreeImplem<>();
		
		//For this implementation, we are treating student1 as the root
		Node<Student> root = new Node<>(student1);
		
		//Checks if the tree is empty
		System.out.println("\nThe tree is empty upon addition of root? : " + tree.empty(root));
		
		//Adding the other students to the tree		
		tree.add(root, student2);
		tree.add(root, student3);
		tree.add(root, student4);
		tree.add(root, student5);
		
		
		//Counting the nodes
		System.out.println("\n# of Nodes : " + tree.size(root));
		
		//Maximum Average
		System.out.println("\nMax Average : " + tree.maxAverage(root));
		
		//Minimum Average
		System.out.println("\nMin Average : " + tree.minAverage(root));
		
		//Printing the Tree
		System.out.println("\n================The Representations of The Tree================");
		tree.printTree(root);

	}
}
