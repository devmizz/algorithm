package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int length = input.length();
        int num = Integer.parseInt(input);
        int standard = num - 9 * length;
        int result = 0;

        for(int i = (standard > 0) ? standard : 0; i < num; i++) {
            if(num == getConstructor(i)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    static int getConstructor(int num) {
        int sum = num;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
