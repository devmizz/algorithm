package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;
        int input;

        for(int i = 0; i < 9; i++) {
            input = Integer.parseInt(br.readLine());

            if(max < input) {
                max = input;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
