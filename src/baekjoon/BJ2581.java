package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        boolean[] numbers = new boolean[end + 1];
        numbers[0] = false;
        numbers[1] = false;

        for(int i = 2; i <= end; i++) {
            numbers[i] = true;
        }

        for(int i = 2; i < Math.sqrt(end); i++) {
            if(numbers[i]) {
                int j = i;
                while(j <= end - i) {
                    j += i;
                    numbers[j] = false;
                }
            }
        }

        int min = 0;
        int sum = 0;
        for(int i = start; i <= end; i++) {
            if(numbers[i]) {
                sum += i;
                if(min == 0) {
                    min = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if(min == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(min);
        }

        System.out.println(sb);
    }
}
