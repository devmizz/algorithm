package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i = 1; i <= 9; i++) {
            sb.append(n + " * " + i + " = " + n * i + "\n");
        }

        System.out.println(sb);
    }
}
