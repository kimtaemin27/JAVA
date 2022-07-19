package sec12.exam01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fail", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("id & pass");
			System.out.println("id : ");
			String id = scanner.nextLine();
			System.out.println("passwd : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("login");
					break;
				} else {
					System.out.println("pass is not confirm");
				}
			} else {
				System.out.println("no id");
			}
		}

	}

}
