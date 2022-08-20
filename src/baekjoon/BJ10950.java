package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        String[] input;
        int a, b;
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < repeat; i++) {
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            sb.append((a + b) + "\n");
        }

        System.out.println(sb);
    }
}
