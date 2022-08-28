package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int inputNum = Integer.parseInt(br.readLine());
        char[] input;
        int sum = 0;
        int point = 1;


        for(int i = 0; i < inputNum; i++) {
            input = br.readLine().toCharArray();
            for(int j = 0; j < input.length; j++) {
                if(input[j] == 'O') {
                    sum += point++;
                } else {
                    point = 1;
                }
            }
            sb.append(sum + "\n");
            sum = 0;
            point = 1;
        }

        System.out.println(sb);
    }
}
