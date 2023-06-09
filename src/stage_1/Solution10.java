package stage_1;

class Solution10 {
    class Pair{
        public int firstNum;
        public int secondNum;
    }
    
    public int func_a(int numA, int numB, char exp){
        if (exp == '+')
            return numA + numB;
        else if (exp == '-')
            return numA - numB;
        else
            return numA * numB;
    }
    
    public int func_b(String exp){
        for(int i = 0; i < exp.length(); i++){
            char e = exp.charAt(i);
            if(e == '+' || e == '-' || e == '*')
                return i;
        }
        return -1;
    }
    public Pair func_c(String exp, int idx){
        Pair ret = new Pair();
        ret.firstNum = Integer.parseInt(exp.substring(0, idx));
        ret.secondNum = Integer.parseInt(exp.substring(idx + 1));
        return ret;
    }
    
    public int solution(String expression) {	// 함수 찾기 
        int expIndex = func_b(expression);		// 최초 파라미터가 들어갈 수 밖에 없는 함수
        Pair numbers = func_c(expression, expIndex);	// return 타입이 유일한 함수
        int result = func_a(numbers.firstNum, numbers.secondNum, expression.charAt(expIndex));	// 위에 두 함수에 나온 리턴값을 파라미터로 연결
        return result;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        String expression = "123+12";
        int ret = sol.solution(expression);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}