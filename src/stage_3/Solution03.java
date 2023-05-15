package stage_3;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution03 {
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        
        char defX = 'A';
        char defY = '1';
        
        boolean[][] arr = new boolean[8][8];
        
        for (String bishop : bishops) {
        	// 좌표
        	int x = bishop.charAt(0) - defX;
        	int y = bishop.charAt(1) - defY;
        	
        	// 본인자리
        	arr[x][y] = true;
        	
        	int tempX;
        	int tempY;
        	
			// 비숍 방향 ↖
        	tempX = x;
        	tempY = y;
        	while(tempX >= 0 && tempY < 8) {
        		arr[tempX--][tempY++] = true;
        	}
        	
        	// 비숍 방향 ↗
        	tempX = x;
        	tempY = y;
        	while(tempX < 8 && tempY < 8) {
        		arr[tempX++][tempY++] = true;
        	}

        	// 비숍 방향 ↙
        	tempX = x;
        	tempY = y;
        	while(tempX >= 0 && tempY >= 0) {
        		arr[tempX--][tempY--] = true;
        	}
        	
        	// 비숍 방향 ↘
        	tempX = x;
        	tempY = y;
        	while(tempX < 8 && tempY >= 0) {
        		arr[tempX++][tempY--] = true;
        	}
		}
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(!arr[i][j])
					answer++;
			}
		}
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution03 sol = new Solution03();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}