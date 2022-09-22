package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        int[] arr = new int[n * m + 1];

        String[] blocks;
        int block;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            blocks = br.readLine().split(" ");
            for(int j = 0; j < m; j++) {
                block = Integer.parseInt(blocks[j]);
                arr[i * m + j] = block;
                sum += block;
            }
        }

        int minIndex = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;

        int max = (sum + b) / (m * n);
        int time;
        for(int i = max; i >= 0; i--) {
            time = 0;

            for(int j = 0; j < n * m; j++) {
                if(arr[j] < i) {
                    time += i - arr[j];
                } else if(arr[j] > i) {
                    time += (arr[j] - i) * 2;
                }
            }

            if(time < minValue) {
                minValue = time;
                minIndex = i;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(minValue).append(" ").append(minIndex);

        System.out.println(sb);
    }
}
