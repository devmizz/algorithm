package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        int third = first * (second % 10);
        int forth = first * (second / 10 % 10);
        int fifth = first * (second / 100);
        int sixth = third + forth * 10 + fifth * 100;

        StringBuffer sb = new StringBuffer();

        sb.append(third + "\n");
        sb.append(forth + "\n");
        sb.append(fifth + "\n");
        sb.append(sixth);

        System.out.println(sb);

    }
}
