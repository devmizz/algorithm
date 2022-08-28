package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        if(num >= 100) {
            for(int i = 100; i <= num; i++) {
                result += han(i);
            }
            result += 99;
        } else {
            result = num;
        }

        System.out.println(result);
    }

    static int han(int num) {
        int hundred = num / 100;
        int ten = num/10 % 10;
        int one = num % 10;

        if(hundred - ten == ten - one)
            return 1;

        return 0;
    }
}
