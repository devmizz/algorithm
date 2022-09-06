package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int radius = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(Math.PI * radius * radius).append("\n").append(2 * radius * radius);

        System.out.println(sb);
    }
}
