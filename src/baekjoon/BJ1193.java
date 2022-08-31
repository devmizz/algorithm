package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int sum = 0;
        int index = 0;

        for(int i = 1; sum < x; i++) {
            index = i;
            sum += i;
        }

        if(index % 2 == 0) {
            System.out.println((x - (sum - index)) + "/" + (sum - x + 1));
        } else {
            System.out.println((sum - x + 1) + "/" + (x - (sum - index)));
        }
    }
}
