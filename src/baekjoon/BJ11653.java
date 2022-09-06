package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int until = ((input % 2 == 0) ? input / 2 : input / 3) + 2; // 2, 3을 대비

        boolean[] sieve = new boolean[until + 1];
        Queue<Integer> primes = new LinkedList<>();

        for(int i = 2; i <= until; i++) {
            sieve[i] = true;
        }

        for(int i = 2; i <= Math.sqrt(until); i++) {
            if(sieve[i] == true) {
                int j = i + i;
                while(j <= until) {
                    sieve[j] = false;
                    j += i;
                }
            }
        }

        for(int i = 0; i < sieve.length; i++) {
            if(sieve[i]) {
                primes.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        int num;

        while(!primes.isEmpty()) {
            num = primes.poll();
            while(input % num == 0) {
                input /= num;
                sb.append(num).append("\n");
            }
        }

        if(input > 1) {
            sb.append(input);
        }

        System.out.println(sb);
    }
}
