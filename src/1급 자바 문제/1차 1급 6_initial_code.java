class Solution{
    public int func(int record){
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }

    public int solution(int[] recordA, int[] recordB){
        int cnt = 0;
        for(int i = 0; i < recordA.length; i++){
            if(recordA[i] == recordB[i])
                continue;			// 비겼을때
            else if(recordA[i] == func(recordB[i]))	// 가위 a:0 b:2
                cnt = cnt + 3;		// 이겼을때
            else
                //cnt = cnt - 1;		// 졌을때
            	cnt = cnt - 1 < 0 ? 0 : cnt - 1;
            	cnt = cnt == -1 ? 0 : cnt--;
        }
        return cnt;	// 13
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}