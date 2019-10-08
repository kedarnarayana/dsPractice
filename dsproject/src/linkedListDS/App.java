package linkedListDS;

public class App {

	public static void main(String[] args) {
		
	/*	LinkedList<Integer> list = new LinkedList<>();
		
		list.insert(12);
		list.insert(27);
		list.insert(42);
		list.insert(21);
		
		list.traverseList(); */
		
		LinkedList<Person> list = new LinkedList<>();
		
		Person p1 = new Person("kedar",27);
		Person p2 = new Person("Guru",28);
		Person p3 = new Person("Jahnavi",28);
		Person p4 = new Person("Roopa",26);
		Person p5 = new Person("Leela",30);
		
		list.insert(p1);
		list.insert(p2);
		list.insert(p3);
		list.insert(p4);
		list.insert(p5);
		
		System.out.println(list.size());
		
		list.remove(p1);
		
		System.out.println(list.size());
		
		list.traverseList();
		
	}

}
