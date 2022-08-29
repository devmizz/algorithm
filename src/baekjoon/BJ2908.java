package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int num1 = Integer.parseInt(input[0].charAt(2) + "" + input[0].charAt(1) + "" + input[0].charAt(0));
        int num2 = Integer.parseInt(input[1].charAt(2) + "" + input[1].charAt(1) + "" + input[1].charAt(0));

        int result = num1;

        if(num1 < num2)
            result = num2;

        System.out.println(result);
    }
}
