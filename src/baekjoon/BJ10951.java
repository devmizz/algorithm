package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int result;
        String input;
        String[] inputArr;
        while((input = br.readLine()) != null) {
            inputArr = input.split(" ");
            result = Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[1]);
            if(result == 0) {
                break;
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
