package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int num;
        String[] arr = br.readLine().split(" ");

        for(int i = 0; i < 5; i++) {
            num = Integer.parseInt(arr[i]);
            sum += num * num;
        }

        System.out.println(sum % 10);
    }
}
