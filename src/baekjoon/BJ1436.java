package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 666 1666 2666 3666 4666 5666 6660 6661
public class BJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int i = 665;
        int cnt = 0;

        while(cnt != num) {
            i++;
            if(String.valueOf(i).contains("666")) {
                cnt++;
            }
        }

        System.out.println(i);
    }
}
