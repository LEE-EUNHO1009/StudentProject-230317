package pakage_2;

import java.util.Scanner;

public class CalcMain {
	
	public static void main(String[] args) {
		int num1; int num2;
		Scanner scn= new Scanner(System.in);
		Calc cc = new Calc();
		System.out.println("값은?");
		num1=scn.nextInt();
		num2=scn.nextInt();
		System.out.println(cc.add(num1,num2));
		System.out.println(Calc.multyplay(num1,num2));
		System.out.println(cc.divide(num1,num2));
		
	}

}
