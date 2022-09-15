package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        int k = Integer.parseInt(nums[0]);
        int n = Integer.parseInt(nums[1]);

        long input;
        long[] lengths = new long[k];

        long max = Long.MIN_VALUE;
        long min = 0L;

        for(int i = 0; i < k; i++) {
            input = Integer.parseInt(br.readLine());
            lengths[i] = input;
            if(input > max) {
                max = input + 1;
            }
        }

        long mid, sum;
        while(min < max) {
            sum = 0;
            mid = (max + min) / 2;

            for(int i = 0; i < k; i++) {
                sum += lengths[i] / mid;
            }

            if(sum >= n) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        System.out.println(min - 1);
    }
}
