package pakage_1;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		Student st = new Student();
		System.out.println("이름?");
		st.Name=scn.nextLine();
		System.out.println("국어?");
		st.Kor=scn.nextInt();
		System.out.println("수학?");
		st.Eng=scn.nextInt();
		System.out.println("영어?");
		st.Mat=scn.nextInt();

		st.show();
	}

}
