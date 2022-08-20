package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");
        int wasteTime = Integer.parseInt(br.readLine());

        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);

        int wasteHour = wasteTime / 60;
        int wasteMin = wasteTime % 60;

        min += wasteMin;
        if(min >= 60) {
            min -= 60;
            hour += 1;
        }
        hour += wasteHour;
        if(hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + min);
    }
}
