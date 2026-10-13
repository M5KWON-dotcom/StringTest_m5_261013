package java_String_Test01;

public class StringNumTest {

	public static void main(String[] args) {
		String age = "17";
		
		int ageNum = Integer.parseInt(age);
		//문자열 age값이 정수로 변환되어서 ageNum저장
		//문자열 숫자  -> 실제 정수형 숫자
		int plusAge = ageNum + 3; //당신의 나이는 3년후에 20살이 됩니다.
		//age -> 문자열이므로 계산불가
		
		System.out.println(plusAge);
		
		String height ="175.8";
		double heightNum = Double.parseDouble(height);
		//문자열 height값이 실수로 변환되어서 doubleNum저장
	}

}
