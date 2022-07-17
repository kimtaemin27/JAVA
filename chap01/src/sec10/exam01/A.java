package sec10.exam01;

// 바깥 클래스
public class A {
	A() {
		System.out.println("create A");
	}

	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("create B");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2( ){ }
	}

	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("create C");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {

		// 로컬 클래스
		class D {
			D() {
				System.out.println("create D");
			}

			int field1;

			// static int field2;
			void method1() {
			}
			// static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}