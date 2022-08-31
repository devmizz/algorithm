package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(factorial(num));
    }

    static long factorial(int num) {
        if(num == 0)
            return 1;
        if(num == 1)
            return 1;

        return num * factorial(num - 1);
    }
}
