package stage_2;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution06 {
    public int[] solution(String commands) {
        int[] answer = new int[2];
        
        char[] arrCommand = commands.toCharArray();
        
        for (int i = 0; i < arrCommand.length; i++) {
			char dir = arrCommand[i];
			
			switch (dir) {
				case 'L':
					answer[0]--;
					break; 
		        case 'R':
					answer[0]++;
					break; 
			    case 'U':
					answer[1]++;
					break; 
				case 'D':
					answer[1]--;
					break;
			}
		}
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution06 sol = new Solution06();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}