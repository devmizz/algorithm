package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int input;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());

            if(input < min) {
                min = input;
            }

            arr[i] = input;
        }

        StringBuilder sb = new StringBuilder();

        int divide;

        outer:
        for(int i = 0; i <= min; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] % i != arr[j + 1] % i) {
                    continue outer;
                }
            }
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
