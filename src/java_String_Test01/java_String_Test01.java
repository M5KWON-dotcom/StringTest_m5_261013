package java_String_Test01;

public class java_String_Test01 {

	public static void main(String[] args) {
		
		String firstName = "홍";
		String lastName = "길동";
		
		String fullName = firstName +lastName;
		
		System.out.println(fullName);
		
		int age = 25;
		System.out.println("나이: "+ age);
		
		String str = "나이: ";
		String strs = str + age; //문자열+정수 - > 자동형변환 -> age 문자열로 자동변환
		System.out.println(strs);
		
		System.out.println(fullName.length()); //문자열의 길이 , 문자의 개수를 반환
		System.out.println(strs.length());
		
		String str1 = "Hello";
		System.out.println(str1.charAt(1)); //한글자씩 추출하여 반환
	
	  String str2 = "Hello Good Mornimg Java";
	  System.out.println(str2.contains("Good"));
	  System.out.println(str2.startsWith("Hello"));
	  System.out.println(str2.endsWith("Java"));
	  
	  String str3 = "abc.jpg";
	  str3.endsWith(".jpg");
	  
	  System.out.println(str3.substring(4));//확장자만 추출
	  
	  String str4 = "대한민국";
	  System.out.println(str4.substring(1,3));  //끝 인덱스는 포함이 안됨 1,2만 나옴
	
	  System.out.println(str4.replace("민국","국민")); //민국 -> 국민)
	  System.out.println(str4);
	  String str5 = str4.replace("민국","국민");
	  System.out.println(str5);
	  
	  String str6="우리는-자바-공부를-열심히-해야됩니다!";
	  //- ->_로 변경
	  String str7 = str6.replace("-","_");
	  System.out.println(str7);
	  String str8 = str6.replace("-"," ");
	  System.out.println(str8);
	  //replace()와 replaceAll의 차이는 정규식의 사용여부
	
	String str9 = "abc123def456";
	
	String str10 = str9.replaceAll("[0-9]"," ");  //정규식사용 -> 모든 숫자 제거
	System.out.println(str10);
	String str11 = str9.replaceAll("[a-z]"," "); //정규식사용 -> 모든 영문자 제거
	System.out.println(str11);
	
	String str12 = "korea";
	System.out.println(str12.toUpperCase());  //대문자 만들어주기
	System.out.println(str12.toLowerCase());  //소문자 만들어주기
	
	String str13 = " 안녕하세요  ";
	System.out.println(str13);
	System.out.println(str13.trim());
	//문자열 양쪽의 공백을 제거  -> 외부로부터 입력받은 문자열은 무조건 trim()을 적용한 후 사용
	
	String str14 = ""; //아무것도 저장안됨
    //외부로부터 문자열을 입력받았을때 확인필요  -> 내용이 맞는지 없는지의 여부를 확인	
	System.out.println(str14.isEmpty());
	String str15 = " ";
	System.out.println(str15.isEmpty());
	System.out.println(str15.isBlank());
	}
	
	
}
