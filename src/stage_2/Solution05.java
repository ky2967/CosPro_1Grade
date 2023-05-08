package stage_2;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution05 {
    public int solution(int[] arr) {
        int answer = 0;
        
        // 직전 요소보다 작을때부터 시작해서 증가되는지 확인
        // 증가 갯수 확인하고 작아지면 start 숫자랑, temp 갯수 초기화해서 다시 ㄱ
        
        int cnt = 1;
        int preNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
			int curNum = arr[i];
			preNum = arr[i - 1];
			if(curNum > preNum) {
				cnt++;
			} else {
				if(answer < cnt)
					answer = cnt;
				cnt = 1;
			}
				
		}
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution05 sol = new Solution05();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}