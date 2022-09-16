package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ15829 {
    public static void main(String[] args) throws IOException {
        final int STAND = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int c;
        long each;
        long sum = 0;

        for(int i = 0; i < length; i++) {
            c = str.charAt(i) - 96;
            each = 1;
            for(int j = 0; j < i; j++) {
                each *= 31;
                each %= STAND;
            }
            sum += c * each;
            sum %= STAND;
        }

        System.out.println(sum);
    }
}
