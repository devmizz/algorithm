package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9020 {
    public static void main(String[] args) throws IOException {
        final int MAX = 10000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        boolean[] sieve = new boolean[MAX + 1];

        for(int i = 2; i <= MAX; i++) {
            sieve[i] = true;
        }

        int j;
        for(int i = 2; i <= Math.sqrt(MAX); i++) {
            if(sieve[i]) {
                j = i + i;
                while(j <= MAX) {
                    sieve[j] = false;
                    j += i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int input;
        for(int i = 0; i < testCase; i++) {
            input = Integer.parseInt(br.readLine());

            for(int k = input / 2; k > - 1; k--) {
                if(sieve[k] == true && sieve[input - k] == true) {
                    sb.append(k).append(" ").append(input - k);
                    break;
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
