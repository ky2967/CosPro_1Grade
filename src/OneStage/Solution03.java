package OneStage;
// You may use import as below.
//import java.util.*;

class Solution03 {
    public int solution(String pos) {
        // Write code here.
        int answer = 0;
        
        // �Ķ���Ͱ� ������
        char[] arrPos = pos.toCharArray();
        char x = arrPos[0];
        char y = arrPos[1];
        
        // default ����
        char xMin = 'A';
        char yMin = '1';
        char xMax = (char)(xMin + 7);
        char yMax = (char)(yMin + 7);
        
    	// ����Ʈ�� �̵� ��ġ üũ
        int[][] arrLoc = new int[][] { {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2} };
        for (int i = 0; i < arrLoc.length; i++) {
			char movedX = (char)(x + arrLoc[i][0]);
			char movedY = (char)(y + arrLoc[i][1]);

			// ���� �� ���� ��ġ�϶� �н�
			if(movedX < xMin || movedX > xMax || movedY < yMin || movedY > yMax)
				continue;
			
			answer++;
		}
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution03 sol = new Solution03();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}