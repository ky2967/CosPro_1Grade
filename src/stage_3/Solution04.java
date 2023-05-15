package stage_3;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution04 {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        
        // 초기 answer s1, s2 길이값 합
        int tempAns = s1.length() + s2.length();
        answer = tempAns;
        
        // s1 길이 빈값 + s2 길이 빈값 + s1
        Queue<Character> queS1 = new LinkedList<Character>();
        for (int i = 0; i < s1.length(); i++) {
        	queS1.offer('0');
        }
        for (int i = 0; i < s2.length(); i++) {
        	queS1.offer('0');
        }
        for (int i = 0; i < s1.length(); i++) {
			queS1.offer(s1.charAt(i));
		}
        
        // s1 길이 빈값 + s2 + s1 길이 빈값
        Queue<Character> queS2 = new LinkedList<Character>();
        for (int i = 0; i < s1.length(); i++) {
        	queS2.offer('0');
		}        
        for (int i = 0; i < s2.length(); i++) {
			queS2.offer(s2.charAt(i));
		}
        for (int i = 0; i < s1.length(); i++) {
        	queS2.offer('0');
		}        
        
        // queS1을 하나씩 빼면서 비교 언제까지? queS1에서 빠지는 요소가 0이 아닐때까지
        while(queS1.peek() == '0') {
        	// 앞에 빠지고 뒤에 넣음
        	queS1.poll();
        	queS1.offer('0');
        	
        	// queS1과 queS2 비교
        	Object[] arrS1 = queS1.toArray();
        	Object[] arrS2 = queS2.toArray();
        	
        	int cross = 0;
        	for (int i = 0; i < queS1.size(); i++) {
        		// 둘 다 0이 아닐경우
        		if(!arrS1[i].equals('0') && !arrS2[i].equals('0')) {
					if(arrS1[i].equals(arrS2[i])) {
						cross++;
					} else {
						cross = 0;
						break;
					}
        		}
			}
        	
        	if(answer > tempAns - cross)
        		answer = tempAns - cross;
        	
        }
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution04 sol = new Solution04();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}