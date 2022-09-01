package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        String[] inputs;
        int[][] arr = new int[testCase][2];

        for(int i = 0; i < testCase; i++) {
            inputs = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(inputs[0]);
            arr[i][1] = Integer.parseInt(inputs[1]);
        }

        int rank = 1;
        for(int i = 0; i < testCase; i++) {
            for(int j = 0; j < testCase; j++) {
                if(i != j) {
                    if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                        rank++;
                    }
                }
            }
            sb.append(rank + " ");
            rank = 1;
        }

        System.out.println(sb);
    }
}
