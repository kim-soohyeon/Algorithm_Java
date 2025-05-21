class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            StringBuilder sb = new StringBuilder();

            for (char ch : str.toCharArray()) {
                if (i % 2 == 0) {
                    // 짝수 인덱스 → 소문자
                    sb.append(Character.toLowerCase(ch));
                } else {
                    // 홀수 인덱스 → 대문자
                    sb.append(Character.toUpperCase(ch));
                }
            }

            answer[i] = sb.toString();
        }

        return answer;

    }
}