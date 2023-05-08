// You may use import as below.
package stage_1;
import java.util.*;

class Solution01 {
    public long solution(long num) {
        // Write code here.
        long answer = 0;
        
        // 1을 더함
        num += 1;
        
        // long to string > 0을 1으로 replace
        String strTempAns = Long.toString(num).replace("0", "1");
        
        // string to long
        answer = Long.parseLong(strTempAns);
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution01 sol = new Solution01();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}