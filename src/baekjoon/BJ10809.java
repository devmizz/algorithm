package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuffer sb = new StringBuffer();

        for(int i = 97; i < 123; i++) {
            sb.append(str.indexOf(i) + " ");
        }

        System.out.println(sb);
    }
}
