package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        String[] input;

        for(int i = 0; i < repeat; i++) {
            input = br.readLine().split(" ");
            sb.append("Case #" + (i + 1) + ": " + (Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + "\n"));
        }

        System.out.println(sb);
    }
}
