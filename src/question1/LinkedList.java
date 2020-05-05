package question1;



/* The LinkedList implementation
 * Every linkedlist has a head == first, and tail == last
 */
public class LinkedList {
	private Node first;
	private Node last;	
	
	/* The linkedlist constructor*/
	public LinkedList() {
		this.first = null;
		this.last = null;
	}
	
	/*Returns the first element*/
	public Node getFirst(){
		return first;
	}

	/*Returns the last element*/
	public Node getLast(){
		return last;
	}
	 
	
	/*Checks if the first element is null*/
	public boolean isEmpty() {
		return first == null;
	}
	
	/*Traverses through the list of nodes to count the size*/
	public int size() {
		Node subject = first;
		
		int count = 0;
		while(subject!=null) {
			count++;
			subject = subject.next;
		}
		
		return count;
	}
	
	
	/*Traverses through the nodes to get the sum, and then divide with the size() to get the average*/
	public double getAverage() {
		double sum = 0;
		
		Node subject = first;
		
		while(subject!=null) {
			sum += subject.grade;
			subject = subject.next;
		}
		
		return sum / this.size();
		
	}
	
	
	/*Inserts a new node to the list*/
	//Create a new Subject node
	//Check whether the first element is null, if so, point first and last to the Subject node
	// If first element is not empty, add the item to the end of the list;
	public void add(String name, double grade) {
		Node subject = new Node(name, grade);
		
		if(first == null) {
			first = subject;
			last = first;
		}else {
			last.next = subject;
			last = last.next;
		}
	}
	
	
	//Removes the first occurence of a Node with a specified subject name
	// Check if first Node's name is equal to the name given, if yes, then remove first
	// If not, then traverse the list and check for equality of names again.
	public boolean remove(String name) {
		Node subject = first;
		
		if(subject.name.equals(name)) {
			first = first.next;
			
			if(first.next == null) {
				last = first;
			}
			return true;
		}
		
		for(int i = 0; i<this.size(); i++) {
			if(subject.next.name.equals(name)) {
				subject.next = subject.next.next;
				
				if(subject.next == null)
					last = subject;
				
				return true;
			}
			
			subject = subject.next;
		}
			
		return false;
	}

	
	//Prints the String
	public String toString() {
		String str = "[";
		
		Node subject=first;
		
		for(int i = 0; i<this.size(); i++) {
			if(i == this.size()-1) {
				str += subject + "]";
			}else {
				str += subject + ", ";
			}
			subject = subject.next;
		}
		
		return str;
		
	}
	
}
	
