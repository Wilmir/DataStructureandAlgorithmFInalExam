package question1;

public class Main {
	public static void main(String[] args) {
		
		//Creating an instance object of the LinkedList
		LinkedList list = new LinkedList();
		
		//Adding all the elements;
		list.add("Java",50);
		list.add("Maths",78);
		list.add("English", 40);
		list.add("History",50);

		System.out.println("The initial list: ");
		System.out.println(list);
		
		System.out.println("\nFirst Node: " + list.getFirst());

		System.out.println("\nLast Node: " + list.getLast());

		System.out.println("\nIs the list empty: " + list.isEmpty());

		System.out.println("\nSize of the list: " + list.size());

		System.out.println("\nAverage of grades: " + list.getAverage());
		
		System.out.println("\nRemoving the History subject: " + list.remove("History"));	
		
		System.out.println("\nThe new list after removing History: ");
		System.out.println(list);		
		
		
	}
}
