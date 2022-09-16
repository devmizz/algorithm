package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] testInput = br.readLine().split(" ");
        int n = Integer.parseInt(testInput[0]);
        int m = Integer.parseInt(testInput[1]);

        long[] trees = new long[n];
        String[] treesInput = br.readLine().split(" ");

        long tree;
        long min = 1;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            tree = Integer.parseInt(treesInput[i]);
            trees[i] = tree;
            if(max < tree) {
                max = tree;
            }
        }

        long mid;
        long sum;
        long result = 0;
        while(max > min) {
            sum = 0;
            mid = (max + min) / 2;

            for(int i = 0; i < n; i++) {
                sum += (trees[i] - mid > 0) ? trees[i] - mid : 0;
            }

            if(sum > m) {
                min = mid + 1;
                result = mid;
            } else if(sum < m) {
                max = mid;
            } else {
                result = mid;
                break;
            }
        }

        System.out.println(result);
    }
}
