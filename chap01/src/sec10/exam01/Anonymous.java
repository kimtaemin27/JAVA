package sec10.exam01;

public class Anonymous {
	
	// 필드 초기값으로 대입
	Person field = new Person () {
		void work () {
			System.out.println("go work");
		}

		@Override
		void wake() {
			System.out.println("wake up at 6");
			work();
		}
		
	};
	
	void method1() {
		
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("walk");
			}

			@Override
			void wake() {
				System.out.println("wake up at 7");
				walk();
			}
		};
		
		// 로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
}
