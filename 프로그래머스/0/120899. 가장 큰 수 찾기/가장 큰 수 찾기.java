import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int[] tmp = Arrays.copyOf(array, array.length);
        
        Arrays.sort(tmp);

        answer[0] = tmp[tmp.length - 1];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == answer[0]) {
                answer[1] = i;
            }
        }

        return answer;
    }
}