package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];

        for(int i = 0; i < 42; i++) {
            arr[i] = true;
        }

        int input;
        for(int i = 0; i < 10; i++) {
            input = Integer.parseInt(br.readLine());

            arr[input % 42] = false;
        }

        int cnt = 0;

        for(int i = 0; i < 42; i++) {
            if(arr[i] == false)
                cnt++;
        }

        System.out.println(cnt);
    }
}
