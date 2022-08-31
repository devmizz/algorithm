package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int beeHouse = Integer.parseInt(br.readLine());

        int i = 0;
        long right = 1;
        while(true) {
            right += 6 * i;

            if(beeHouse <= right) {
                System.out.println(i + 1);
                break;
            }

            i++;
        }
    }
}
