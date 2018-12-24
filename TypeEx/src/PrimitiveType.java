
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		논리형 boolean
//		문자형 char: 0~65535
//		정수형 byte, short, int, long
//		byte: -128~127
//		short: -32,768 ~32,767
//		int: -2의 31승 ~ 반대 까지 약 +-20억
//		long: -2의 64승 ~ 반대 까지
//		실수형 float, double
//		float: 1.4E-45 ~ 3.4E38
//		double: 엄청 크다(long보다 큼)
		
		
//		boolean
//		기본값: false
		boolean power = true;
		boolean checked = false;
		
		System.out.println("대답 yes;/on, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		
//		char
		
		char ch = 97;
	
//		 하나의 문자만 저장할 수 있다 \
		
		
		System.out.println(ch);
//		아스키코드
		
//		인코딩 디코딩
		
		
//		정수형
//		byte, short, int, long
//		1, 2, 4, 8
//	bit 8, 16, 32, 64   00 01 10 11
		int num = 10;
		
		System.out.println(num);
//		-128~127		
		byte b = 127;
		
		b = (byte)(b + 2);
		
		System.out.println(b);
//		기본값 int
	
		long bigNum = 100000000L;
		long bigNum2 = 3000000000L;
		System.out.println("long 타입: " + bigNum);
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		int sum = 0;
		sum = firstNum + secondNum;
		System.out.println("총 명품금액: " + firstNum);
		System.out.println("총 명품금액" + sum);
		
//		실수형
//		float, double 거의안씀 아무것도 안쓰면 더블로 인식됨
//		4byte, 8byte 
//		실수 - > 정밀도 더블이 높음
		float f = 9.12345678901234567890f; //붙여야 인식됨
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
				
		
		
		
		
		
	}

}
