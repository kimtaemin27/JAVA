package sec07.exam02;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("0000-0000", "김태민");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		p1.name="김김김";

	}

}
