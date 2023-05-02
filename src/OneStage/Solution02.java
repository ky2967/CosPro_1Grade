package OneStage;
// You may use import as below.
//import java.util.*;

class Solution02 {
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        
        int[][] arrN = new int[n][n];
        
        // ���� ���ϱ�
        // 1:������, 2:�Ʒ�, 3:����, 4:��
        // �����ʺ���
        int direction = 1;
        
        // ���� ī��Ʈ
        int mak = 0;
        
        // ��ǥ
        int i = 0;
        int j = 0;
        
        // ���� �־��� ����
        int num = 1;
        
        // 1,1 ĭ �̸� �ֱ�
        arrN[0][0] = num;
        num++;
        
        while(true) {
        	switch(direction) {
        	// ���� ĭ�� ���ڳֱ� > ���� ����
        	// ���������� ���ٰ� �����ų� ���� ĭ�� 0�� �ƴѰ�� �Ʒ��� �������� : direction 2�� ����
        	case 1:
        		if(j + 1 >= n || arrN[i][j + 1] > 0) {
        			direction = 2;	// �Ʒ���
        			mak++;
        		} else {
        			arrN[i][++j] = num++;
        			mak = 0;
        		}
        		break;
    		// �Ʒ��� ���ٰ� �����ų� ���� ĭ�� 0�� �ƴѰ�� �������� ���� : direction 3�� ����	
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
        	
        	// �� ������ ��? > �ι� ������ �� ����������
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