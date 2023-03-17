package pakage_1;

public class Overloading {
	//public Overloading() {}
	//public Overloading(int m1) {}
	void show(String n1, int n2, int n3) {
		System.out.println("이름: "+n1);
		System.out.println("합계: "+(n2+n3));
	}
	void show(String n1, int n2, int n3, String n4) {
		System.out.println("이름: "+n1);
		System.out.println("합계: "+(n2+n3));
		System.out.println("주소: "+n4);
	}
	void show(String n1, String n4, int n2, int n3) {
		System.out.println("이름: "+n1);
		System.out.println("학과: "+n4);
		System.out.println("합계: "+(n2+n3));
	}

}
