package sec07.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("땡땡", "0000-0000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("이름", "0000-0000");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
