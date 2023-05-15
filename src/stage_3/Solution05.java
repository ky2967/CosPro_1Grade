package stage_3;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution05 {
    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        
        // 0초랑 28초랑 같음
        second = second % 28;
        
        // 전광판 초기화
        Queue<Character> quePhr = new LinkedList<Character>();
        for (int i = 0; i < phrases.length(); i++) {
			quePhr.offer('_');
		}
        
        int time = 0;
        
        //0~14초
        for (int i = 0; i < phrases.length(); i++) {
        	if(time == second)
        		break;
        	
			time++;
			quePhr.poll();
			quePhr.offer(phrases.charAt(i));
		}
        
        //15~27초
        for (int i = 0; i < phrases.length(); i++) {
        	if(time == second)
        		break;
        	
			time++;
			quePhr.poll();
			quePhr.offer('_');
		}
        
        StringBuilder sb = new StringBuilder();
        while(quePhr.size() > 0) {
        	sb.append(quePhr.poll());
        }
        
        answer = sb.toString();
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution05 sol = new Solution05();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}