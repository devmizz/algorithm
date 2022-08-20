package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        String[] list = br.readLine().split(" ");
        int value;

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < n; i++) {
            value = Integer.parseInt(list[i]);
            if(value < x) {
                sb.append(value + " ");
            }
        }

        System.out.println(sb);
    }
}
