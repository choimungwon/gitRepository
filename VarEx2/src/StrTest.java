import javax.print.DocFlavor.STRING;

public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		문자열
//		문자열 어떤 다른 내용들과 합쳐져도 영향을 주지 않아야 한다
		String str = "";
		String name = "";
		

		//문자형
		char ch = ' '; // 공백 문자형에 공란은 없음
		
		// 문자열 특징
//		문자열+ any type -> 문자열 + 문자열 -> 문자열
//		any type + 문자열 -> 문자열 + 문자열 -> 문자열
//		concat
		
		str = "Ja" + "va";
		name = str + 8.0;
		
		System.out.println("str : " + str);
		System.out.println("name : " + name);

				
		
	}

}
