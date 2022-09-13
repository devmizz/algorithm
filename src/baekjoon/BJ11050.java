package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        int result = 1;
        int divide = 1;

        for( ; k > 0; k--) {
            result *= n;
            divide *= k;
            n--;
        }

        System.out.println(result / divide);
    }
}
