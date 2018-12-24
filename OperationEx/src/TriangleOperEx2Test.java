import java.util.Scanner;

public class TriangleOperEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		삼항연산자
//		표현식
//		(조건식) ? 식1 : 식2
//		ex: 변수 = (조건식) ? 식1 : 식2; 

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int x = 0;
		int y = 0;
		
		x = num;
		
		
		int absX = (x >= 0) ? x : -x; // -> asbX = x;

		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
		
		System.out.println(num);
		
		System.out.println("x=" num 일 때, x의 절대값은" + absX);
	

		
		
		
		
	}

}
