package programmers;

public class prg_72410 {

	public static void main(String[] args) {
		//신규 아이디 추천
		String new_id = "...!@BaT#*..y.abcdefghijklm";

		System.out.println(solution(new_id));
	}
	
	public static String solution(String new_id) {
        String answer = "";
        //String to char Array
        char[] arr = new_id.toCharArray();
        
        //1단계 - 소문자 -> 대문자
        new_id = new_id.toLowerCase();
        
        for(int i = 0; i < new_id.length(); i++) {
        	int chr = new_id.charAt(i);
        	//2단계 - 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        	String step2 = "";
        	if(chr >= 'a' && chr <= 'z') {
        		step2 += chr;
        	}else if(chr >= '0' && chr <= '9') {
        		step2 += chr;
        	}else if(chr == '-' || chr == '-' || chr == '-') {
        		step2 += chr;
        	}
        	
        	//3단계 -마침표(.)가 2번 이상 -> 하나의 마침표(.)로 치환
        	
        }

        
        
        return answer;
    }
}
