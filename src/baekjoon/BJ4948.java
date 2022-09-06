package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ4948 {
    public static void main(String[] args) throws IOException {
        final int MAX = 123456 * 2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input;

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
        int cnt = 0;
        while((input = Integer.parseInt(br.readLine())) != 0) {
            for(int i = input + 1; i <= (Math.min(input * 2, MAX)); i++) {
                if(sieve[i]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
            cnt = 0;
        }

        System.out.println(sb);
    }
}
