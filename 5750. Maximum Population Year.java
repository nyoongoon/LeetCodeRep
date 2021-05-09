// 오답 왜 틀렸는지 찾아보기..
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maximumPopulation(int[][] logs) {
        Arrays.sort(logs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

    int maxPopIdx = 0;
    int maxPop = 0;
    for(int i = 0; i<logs.length; i++){
        int temp = 1;
        for(int j = i+1; j<logs.length; j++) {
            if(logs[i][1] > logs[j][0]){
                temp++;
            }
        }
        for(int k = i-1; k>=0; k--){
            if(logs[i][0] < logs[k][1]){
                temp++;
            }
        }
        if(maxPop<temp){
            maxPop = temp;
            maxPopIdx = i;
        }
    }

    return  logs[maxPopIdx][0];
    }
}
