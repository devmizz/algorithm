package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        String[] input;
        int repeat;
        String str;

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < testCase; i++) {
            input = br.readLine().split(" ");
            repeat = Integer.parseInt(input[0]);
            str = input[1];

            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < repeat; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
