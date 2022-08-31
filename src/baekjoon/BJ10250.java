package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        int height, num;
        String floor, roomNum;
        String[] input;

        for(int i = 0; i < testCase; i++) {
            input = br.readLine().split(" ");

            height = Integer.parseInt(input[0]);
            num = Integer.parseInt(input[2]);

            if(height == 1) {
                floor = "1";
                roomNum = String.valueOf(num);
            } else {
                if(num % height == 0) {
                    floor = String.valueOf(height);
                    roomNum = String.valueOf(num / height);
                } else {
                    floor = String.valueOf(num % height);
                    roomNum = String.valueOf(num / height + 1);
                }
            }

            if(roomNum.length() < 2) {
                roomNum = "0" + roomNum;
            }

            sb.append(floor);
            sb.append(roomNum + "\n");
        }

        System.out.println(sb);
    }
}
