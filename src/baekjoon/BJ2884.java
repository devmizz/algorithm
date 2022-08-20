package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");

        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);

        min -= 45;
        if(min < 0) {
            min += 60;
            hour -= 1;
            if(hour < 0) {
                hour += 24;
            }
        }

        System.out.println(hour + " " + min);

    }
}
