package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int result;
        while(true) {
            String[] input = br.readLine().split(" ");
            result = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            if(result == 0) {
                break;
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
