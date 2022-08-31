package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int height = Integer.parseInt(input[2]);

        // 마지막 날 up만큼 올라갈 수 있는 거 제외하고, 하루당 올라가는 칸 수로 나누는 작업
        int duration = (height - up) / (up - down);

        // 꼭대기와 (height - up) 사이에 위치하는 애들은 한 칸 손해본다
        if((height - up) % (up - down) != 0) {
            duration++;
        }

        System.out.println(duration + 1);
    }
}
