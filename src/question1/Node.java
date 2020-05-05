package question1;

// The Node represents a Student which has a name, grade
//Every node has a next variable which points to the next node
public class Node{
	String name;
	double grade;
	Node next;
	
	public Node (String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public Node (String name, double grade, Node next) {
		this.name = name;
		this.grade = grade;
		this.next = next;
	}
	
	
	//The String method to print the Node
	public String toString() {
		return "\"" + name + ", " + grade + "\"";
	}
	
}