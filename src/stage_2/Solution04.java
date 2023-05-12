package stage_2;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;


class Solution04 {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        
        
        
        return answer;
    }
	
//    public int solution(int[] arr, int K) {
//        int answer = 0;
//        
//        boolean[] visited = new boolean[arr.length];
//        check(arr, visited, 0, arr.length, 3);
//        
//        for (int i = 0; i < _lstC.size(); i++) {
//        	ArrayList<Integer> element = _lstC.get(i);
//        	int sum = element.stream().mapToInt(Integer::intValue).sum();
//        	
//        	if(sum % K == 0)
//        		answer++;
//		}
//
//        return answer;
//    }
//    
//    public static ArrayList<ArrayList<Integer>> _lstC = new ArrayList<ArrayList<Integer>>();
//    public static void check(int[] inputArr, boolean[] visited, int seq, int n, int r) {
//    	if(r == 0) {
//    		ArrayList<Integer> outputArr = new ArrayList<Integer>(); 
//    		for (int i = 0; i < visited.length; i++) {
//				if(visited[i])
//					outputArr.add(inputArr[i]);
//			}
//    		_lstC.add(outputArr);
//			return;
//    	}
//    	
//    	if(seq == n)
//    		return;
//    	
//    	visited[seq] = true;
//    	check(inputArr, visited, seq + 1, n, r - 1);
//    	
//    	visited[seq] = false;
//    	check(inputArr, visited, seq + 1, n, r);
//    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution04 sol = new Solution04();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}