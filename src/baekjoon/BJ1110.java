package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int init = n;
        int cnt = 0;
        int firstPlace;

        while(true) {
            if(n < 10) {
                n = n * 10 + n;
            } else {
                firstPlace = (n / 10) + (n % 10);
                if(firstPlace > 9) {
                    firstPlace = firstPlace % 10;
                }
                n = ((n % 10) * 10) + firstPlace;
            }
            cnt++;
            if(n == init) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
