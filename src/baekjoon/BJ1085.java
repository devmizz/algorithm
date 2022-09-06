package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int w = Integer.parseInt(inputs[2]);
        int h = Integer.parseInt(inputs[3]);

        System.out.println(Math.min(Math.min(x, w - x), Math.min(y, h - y)));
    }
}
