package pakage_1;

public class Student {
	String Name;
	int Kor;
	int Eng;
	int Mat;
	int Total;
	int Avg;
	char Hakjum;
//멤버변수 : 인스턴스-객체생성, 클래스 변수(static ) 
//지역변수	 : 
	void show() {
		Total =Kor + Mat+Eng;
		Avg = Total/3;
		int ss = Avg/10;
		switch (ss) {
		case 10: case 9: Hakjum='A'; break;
		case 8: Hakjum='B'; break;
		case 7: Hakjum='C'; break;
		case 6: Hakjum='D'; break;
		default : Hakjum='F';
		}
		System.out.println("이름"+Name);
		System.out.println("국어"+Kor);
		System.out.println("영어"+Eng);
		System.out.println("수학"+Mat);
		System.out.println("합계"+Total);
		System.out.println("평균"+Avg);
		System.out.println("학점"+Hakjum);
	}
}