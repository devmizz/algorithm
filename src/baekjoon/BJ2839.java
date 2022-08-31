package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int kg = Integer.parseInt(br.readLine());
        int rest;
        int result = -1;

        for(int i = kg / 5; i >= 0; i--) {
            rest = kg - 5 * i;

            if(rest % 3 == 0) {
                result = i + rest / 3;
                break;
            }
        }

        System.out.println(result);
    }
}
