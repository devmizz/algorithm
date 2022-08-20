package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);
        int max;

        if(first == second) {
            if(first == third) {
                System.out.println(10000 + first * 1000);
            } else {
                System.out.println(1000 + first * 100);
            }
        } else {
            if(first == third) {
                System.out.println(1000 + third * 100);
            } else if(second == third) {
                System.out.println(1000 + third * 100);
            } else {
                max = first > second ? first : second;
                max = max > third ? max : third;

                System.out.println(max * 100);
            }
        }
    }
}
