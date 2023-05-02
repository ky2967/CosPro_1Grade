package OneStage;
// You may use import as below.
//import java.util.*;

class Solution02 {
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        
        int[][] arrN = new int[n][n];
        
        // 방향 정하기
        // 1:오른쪽, 2:아래, 3:왼쪽, 4:위
        // 오른쪽부터
        int direction = 1;
        
        // 막힌 카운트
        int mak = 0;
        
        // 좌표
        int i = 0;
        int j = 0;
        
        // 현재 넣어질 숫자
        int num = 1;
        
        // 1,1 칸 미리 넣기
        arrN[0][0] = num;
        num++;
        
        while(true) {
        	switch(direction) {
        	// 본인 칸에 숫자넣기 > 숫자 증가
        	// 오른쪽으로 가다가 막히거나 다음 칸에 0이 아닌경우 아래로 내려가기 : direction 2로 변경
        	case 1:
        		if(j + 1 >= n || arrN[i][j + 1] > 0) {
        			direction = 2;	// 아래로
        			mak++;
        		} else {
        			arrN[i][++j] = num++;
        			mak = 0;
        		}
        		break;
    		// 아래로 가다가 막히거나 다음 칸에 0이 아닌경우 왼쪽으로 가기 : direction 3로 변경	
        	case 2:
        		if(i + 1 >= n || arrN[i + 1][j] > 0) {
        			direction = 3;
        			mak++;
        		} else {
        			arrN[++i][j] = num++;
        			mak = 0;
        		}
        		break;
        		
        	case 3:
        		if(j - 1 < 0 || arrN[i][j - 1] > 0) {
        			direction = 4;
        			mak++;
        		} else {
        			arrN[i][--j] = num++;
        			mak = 0;
        		}
        		break;
        		
        	case 4:
        		if(i - 1 < 0 || arrN[i - 1][j] > 0) {
        			direction = 1;
        			mak++;
        		} else {
        			arrN[--i][j] = num++;
        			mak = 0;
        		}
        		break;
        	}
        	
        	// 다 막혔을 때? > 두번 막혔을 때 빠져나오기
        	if(mak > 4)
        		break;
        }
        
        for (int idx = 0; idx < n; idx++) {
        	answer += arrN[idx][idx];
        }
        
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution02 sol = new Solution02();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}